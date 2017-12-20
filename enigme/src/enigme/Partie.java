package enigme;
import java.awt.*;
import java.util.*;
import java.util.List;

import static enigme.Jeu.TYPE_TERRAIN.*;

public class Partie {

    /************************************************
     * ATTRIBUTS
    ************************************************/
	private String name;
	private List<NatureTerrain> natures;
	private List<Case> cases;
	private List<Carte> cartes;
	private List<Niveau> niveaux;
	private List<Projectile> projectiles;
	private List<Mobile> mobiles;
	private List<Obstacle> obstacles;
	private int argent;
	private int mobilesSorti;

	/************************************************
     * CONSTRUCTEUR
	 ************************************************/

	public Partie(String name, List<NatureTerrain> natures, List<Case> cases, List<Carte> cartes,
				  List<PartieElement> partieElements, List<Niveau> niveaux) {

		this.name = name;
		this.natures = natures;
		this.cases = cases;
		this.cartes = cartes;
		this.niveaux = niveaux;
		projectiles = new ArrayList<>();
		mobiles = new ArrayList<>();
		obstacles = new ArrayList<>();
		for(PartieElement pe : partieElements) {
			if(pe instanceof Projectile) {
				projectiles.add((Projectile) pe);
			} else if (pe instanceof Mobile) {
				mobiles.add((Mobile) pe);
			} else {
				obstacles.add((Obstacle) pe);
			}
		}
		this.argent = 0;
		this.mobilesSorti = 0;
	}
	/************************************************
     * METHODES
	 ************************************************/

	public void jouerProjectiles() {
	    // pour tous les projectiles
		for(int i = 0; i < getProjectiles().size(); i++) {
			Projectile p = getProjectiles().get(i);
			p.seDeplacer(this);
		}
	}

	public void jouerObstacles() {
		// pour tous les Obstacles
		Carte c = cartes.get(0);
		Collection<Mobile> mobilesPourAttaque;
		for(Obstacle o : obstacles) {
		    o.getPA().setValeur(o.getPV().getValeur());
		    while(o.getPA().getValeur() > 0) {
				o.attaquer(this);
				o.getPA().setValeur(o.getPA().getValeur() - 1);
			}
		}
	}

	public void jouerMobiles() {
		// On fait jouer les mobiles
		Collection<Mobile> mobilesAutours = new ArrayList<>();
		Carte c = cartes.get(0);
		// pour tous les mobiles
		for(int i = 0; i < getMobiles().size(); i++) {
			Mobile m = getMobiles().get(i);
			if(m.isEnJeu()) {
				m.getPA().setValeur(m.getPV().getValeur());
				// On va faire du HIT & RUN !!
				Boolean mustRun = true;
				try {
					while (m.getPA().getValeur() > 0) {
						if (mustRun) {
							if (m.seDeplacer(this)) {
								mustRun = false;
							} else if(m.attaquer(this)) {
								m.getPA().setValeur(m.getPA().getValeur() - 1);
							    mustRun = true;
							} else {
								break;
							}
						} else {
							if (m.attaquer(this)) {
								m.getPA().setValeur(m.getPA().getValeur() - 1);
								mustRun = true;
							} else if(m.seDeplacer(this)) {
								mustRun = false;
							} else {
								break;
							}
						}
					}
				} catch (DisparuException e) {
				}
			}
		}

		// On fait apparaître les mobiles
		// On les fait apparaître après le déplacement pour bien les voir au début
		for(Mobile m : getMobiles()) {
			if(!m.isEnJeu()) {
			    if(m.bougerToCase(this, m.getEntree())) {
			        m.setEnJeu(true);
			        // On fait apparître les mobiles un à la fois
			    	break;
				}
			}
		}
	}

	public boolean estTerminee() {
	    return getMobiles().size() == 0;
	}

	public void validerChemins() {
		boolean toutEstValide = true;
	    for(Mobile m : getMobiles()) {
	        Case debut = m.getEntree();
	        Case sortie = m.getSortie();

			Queue<Case> file = new ArrayDeque<>();
			List<Case> casesVisitees = new ArrayList<>();
			casesVisitees.add(debut);

			Case caseCourante = debut;
			// Tant qu'on a pas trouvé la sortie
			boolean fileVide = false;
			while(caseCourante != sortie && !fileVide) {
				// On récupère toutes les cartes voisines
				List<Case> voisines = getCartes().get(0).voisinesCase(caseCourante);

				// Si ces cases ont déjà été visités OU qu'elles ne sont pas accessibles
				int i = 0;
				while(i < voisines.size()) {
					if(voisines.get(i).getNature().getFatigueEntree().isInfini()
							|| casesVisitees.contains(voisines.get(i))) {
						// On les enlèves des voisines
						voisines.remove(i);
					} else {
						i ++;
					}
				}

				// On marque toutes ces cases
                casesVisitees.addAll(voisines);

				// On les rajoutes dans la file
				file.addAll(voisines);

				// On passe à la case suivante
				caseCourante = file.poll();
				if(caseCourante == null) {
					fileVide = true;
				}
			}
			if(!casesVisitees.contains(sortie)) {
				System.out.println("Certains chemins ne sont pas satisfaisables !");
				toutEstValide = false;
				break;
			}
		}
		if(toutEstValide) {
	    	System.out.println("Tous les chemins sont satisfaisables !");
		}
	}

	public void verificationSolution() {
		Niveau lvl = getNiveaux().get(0);

	    // Pour chaque vague
		int vagueNum = 0;
		for(Vague v : lvl.getVagues()) {
		    System.out.println("Vague : " + (vagueNum + 1));
			// On récupère le prototype de la tour
			Obstacle tour = null;
			if(v.getObstacles().size() == 0) {
				tour = this.getObstacles().get(0);
			} else {
				tour = v.getObstacles().get(0);
			}

		    // On regarde combien on pourra avoir de tours
			int nbTour = v.getObstacles().size(); // les tours offertes par la vague
			if(vagueNum > 0) {
				nbTour += lvl.getArgent(); // plus celles qu'on peut construire, vrai si c'est pas la première vague
			}
			// on majore le nombre de tours par le nombre de cases disponibles
			int nbGarages = 0;
			for(Case c : lvl.getCarte().getCases()) {
				if(c.getNature().getType() == campement) {
				    // On vérifie que la tour pourraît tirer sur les mobiles
					boolean aCible = false;
					int portee = tour.getProjectilePrototype().getPortee();
					for(int i = -portee ; i < portee ; i++) {
						for(int j = -portee ; j < portee ; j++) {
							if(!(i == 0 && j == 0)) {
								Case cible = lvl.getCarte().getCase(c.getI() + i, c.getJ() + j);
								if(cible != null) {
								    if(cible.getNature().getType() == chemin
									|| cible.getNature().getType() == entree
									|| cible.getNature().getType() == sortie) {
										aCible = true;
									}
								}
							}
						}
					}
					if(aCible) {
						nbGarages++;
					}
				}
			}
			if (nbTour > nbGarages) {
				nbTour = nbGarages;
			}

			// On compte le nombre de pv de toutes les tours cumulées
			int pvTours = 0;
			int nbToursComptes = 0;
			for(Obstacle o : this.getObstacles()) {
				pvTours += o.getPV().getValeur(); // la tour pourrait être endommagé !
				nbToursComptes ++;
			}
			pvTours += tour.getPVmax().getValeur() * (nbTour - nbToursComptes);


			// Et maintenant on va faire pareil pour les mobiles
            int nbMobiles = v.getMobiles().size();

            // On récupère le prototype du mobile
			Mobile mobile = null;
			if(nbMobiles > 0) {
				mobile = v.getMobiles().get(0);
			}

			// On récupère le nombre de pv de tous les mobiles cumulés
			int pvMobiles = 0;
			pvMobiles += nbMobiles * mobile.getPVmax().getValeur();


			// On va maintenant s'intéresser aux DPS maximum de toutes les tours
            int dpsTour = 0;
            int degat = tour.getProjectilePrototype().getDegat().getValeur();
            int nbAttaque = tour.getPA().getValeur();
            dpsTour += degat * nbAttaque * this.getObstacles().size();
            dpsTour += degat * nbAttaque * (nbTour - this.getObstacles().size());

			// On va maintenant s'intéresser aux DPS maximum de tous les mobiles
            int dpsMobile = 0;
			degat = mobile.getProjectilePrototype().getDegat().getValeur();
			nbAttaque = mobile.getPA().getValeur() / 2;
			dpsMobile += nbMobiles * degat * nbAttaque;


			// On va maintenant calculer le score de combat des tours et des mobiles
            int scoreCombatTour = 0;
            scoreCombatTour = pvTours * dpsTour;
			int scoreCombatMobile = 0;
			scoreCombatMobile = pvMobiles * dpsMobile;


			boolean forceSuffisante;
			if(scoreCombatTour > scoreCombatMobile) {
				forceSuffisante = true;
				System.out.println("Les mobiles ne pourront pas gagner en détruisant toutes les tours si vous jouez au mieux !");
			} else {
				forceSuffisante = false;
				System.out.println("Il est possible que les mobiles gagnent en détruisant toutes les tours même si vous jouez au mieux !");
			}


			// On veut s'assurer que les projectiles ont une vitesse suffisante par rapport aux mobiles !
			boolean vitesseSuffisante;
			if(tour.getProjectilePrototype().getVitesse() < mobile.getPA().getValeur()) {
				vitesseSuffisante = false;
				System.out.println("Les projectiles ne sont pas assez rapides pour rattraper les mobiles !");
			} else {
				vitesseSuffisante = true;
				System.out.println("Les projectiles sont assez rapides pour rattraper les mobiles.");
			}

			// On va maintenant vouloir s'assurer que les tours pourront tuer les ennemies à temps !
			// On veut calculer le temps que mettent les mobiles à atteindre la sortie
			int longueurTrajetMin = v.getMobiles().get(0).cheminSorti(this, mobile.getEntree()).size();
			for(Mobile m : v.getMobiles()) {
				List<Case> chemin = m.cheminSorti(this, m.getEntree());
				if(chemin.size() < longueurTrajetMin) {
					longueurTrajetMin = chemin.size();
				}
			}
			int tempsTrajetMin = (int) Math.ceil(longueurTrajetMin / mobile.getPA().getValeur());

			// On vérifie si on peut tuer le mobile pendant ce temps imparti
			boolean degatSuffisants;
			if(tempsTrajetMin * tour.getProjectilePrototype().getDegat().getValeur() >= mobile.getPVmax().getValeur()) {
				degatSuffisants = true;
				System.out.println("On aura toujours le temps de tuer même le mobile le plus rapide !");
			} else {
				degatSuffisants = false;
				System.out.println("Il est possible qu'un mobile soit tellement rapide qu'on ne puisse pas lui tirer assez dessus !");
			}

			if(degatSuffisants && vitesseSuffisante && forceSuffisante) {
				System.out.println("Nous acceptons ce jeu !");
			} else {
				System.out.println("Ce jeu est extrèmement difficile, voire insoluble, nous vous le déconseillons !");
			}

			// On passe à la vague suivante
			vagueNum ++;
		}
	}

	/************************************************
     * GETS & SETS
	 ************************************************/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NatureTerrain> getNatures() {
		return natures;
	}

	public void setNatures(List<NatureTerrain> natures) {
		this.natures = natures;
	}

	public List<Case> getCases() {
		return cases;
	}

	public void setCases(List<Case> cases) {
		this.cases = cases;
	}

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}

	public List<Niveau> getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(List<Niveau> niveaux) {
		this.niveaux = niveaux;
	}

	public List<Projectile> getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(List<Projectile> projectiles) {
		this.projectiles = projectiles;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public List<Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public int getMobilesSorti() {
		return mobilesSorti;
	}

	public void setMobilesSorti(int mobilesSorti) {
		this.mobilesSorti = mobilesSorti;
	}
}
