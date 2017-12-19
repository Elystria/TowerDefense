package enigme;

import java.util.*;

public class Mobile implements PartieElement {

	private String nom;
	private int force;
	private int volume;
	private int numVague;
	private Case entree;
	private Case sortie;
	private Energie PVmax;
	private Energie PV;
	private Energie PA;
	private Jeu.TactiqueType tactique;
	private Case position;
	private boolean enJeu;
	private Projectile projectilePrototype;
	private int nbMissilesLancees;

	public Mobile(String nom, int force, int volume, int numVague, Case entree, Case sortie, Energie pVmax,
			Jeu.TactiqueType tactique) {
		this.nom = nom;
		this.force = force;
		this.volume = volume;
		this.numVague = numVague;
		this.entree = entree;
		this.sortie = sortie;
		PVmax = pVmax;
		PV = new Energie(pVmax.getValeur());
		PA = new Energie(pVmax.getValeur());
		this.tactique = tactique;
		//this.position = new Case("bla", 0, 1, entree.getNature());
		this.enJeu = false;
		this.projectilePrototype = new Projectile("missileDe" + nom, 1, 1, 1, null, null, false, new Energie(1));
		this.nbMissilesLancees = 0;
	}

	/********* METHODES *********/

	public void attaquerAutre(Case direction, Carte carte) {
		/* Dans l'exemple, un seul projectile peut être porté 
		 * On ne considèrera donc pas les PA */
		//Projectile p = new Projectile("P", 2, 1, 1, position, direction, false, new Energie(false, 1));
		//p.seDeplacer(carte);
	}
	public boolean attaquer(Partie p) {
		switch (tactique) {
			case procheFirst:
				// On cherche sur qui tirer
				Obstacle cible = null;
				if(p.getObstacles().size() > 0) {
					int distMin = p.getObstacles().get(0).distance2mobile(this);
					for(Obstacle o : p.getObstacles()) {
						if(o.distance2mobile(this) > distMin) {
							distMin = o.distance2mobile(this);
						}
					}
					int distMax = projectilePrototype.getPortee();
					for(Obstacle o : p.getObstacles()) {
						if(o.distance2mobile(this) <= distMax) {
							if (o.distance2mobile(this) <= distMin) {
								cible = o;
								distMin = o.distance2mobile(this);
							}
						}
					}
				}

				// On lui tire dessus
				if(cible != null) {
					nbMissilesLancees ++;
					Projectile proj = new Projectile(
							projectilePrototype.getNom() + nbMissilesLancees,
							projectilePrototype.getPortee(),
							projectilePrototype.getMasse(),
							projectilePrototype.getVitesse(),
							position,
							cible,
							false,
							projectilePrototype.getDegat());
					p.getProjectiles().add(proj);
					return true;
				} else {
					return false;
				}
			default:
				System.out.println("Cette tactique n'a pas encore été implémenté !");
				return false;
		}
	}

	public void apparaitre(Partie p) {
		// TODO !
		// S'occupe de fixer la position du mobile =) Pour le faire rentrer sur le champs de bataille =)
	}
	/********* SETTERS & GETTERS *********/
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getNumVague() {
		return numVague;
	}
	public void setNumVague(int numVague) {
		this.numVague = numVague;
	}
	public Case getEntree() {
		return entree;
	}
	public void setEntree(Case entree) {
		this.entree = entree;
	}
	public Case getSortie() {
		return sortie;
	}
	public void setSortie(Case sortie) {
		this.sortie = sortie;
	}
	public Energie getPVmax() {
		return PVmax;
	}
	public void setPVmax(Energie pVmax) {
		PVmax = pVmax;
	}
	public Energie getPV() {
		return PV;
	}
	public void setPV(Energie pV) {
		PV = pV;
	}
	public Energie getPA() {
		return PA;
	}
	public void setPA(Energie pA) {
		PA = pA;
	}
	public Jeu.TactiqueType getTactique() {
		return tactique;
	}
	public void setTactique(Jeu.TactiqueType tactique) {
		this.tactique = tactique;
	}
	public Case getPosition() {
		return position;
	}

	public void setPosition(Case position) {
		this.position = position;
	}

	public boolean isEnJeu() {
		return enJeu;
	}

	public void setEnJeu(boolean enJeu) {
		this.enJeu = enJeu;
	}

	public Projectile getProjectilePrototype() {
		return projectilePrototype;
	}

	public void setProjectilePrototype(Projectile projectilePrototype) {
		this.projectilePrototype = projectilePrototype;
	}

	public void avancer(Carte carte){

		int index = carte.getCheminMobiles().indexOf(this.position);
		carte.getMobiles().remove(this.getPosition());
		this.position = carte.getCheminMobiles().get(index+1);
		carte.getMobiles().put(position, this);
	
	}

	public void pertePV(Energie e, Partie partie) {
		int vie = this.getPV().getValeur();
		int degats = e.getValeur();
		int nouvPV = vie - degats;
		this.getPV().setValeur(nouvPV);
		if (nouvPV<=0) {
		    for(int i = 0; i < partie.getMobiles().size(); i++) {
		    	Mobile m = partie.getMobiles().get(i);
		    	if(m.getNom().equals(this.getNom())) {
		    		partie.getMobiles().remove(i);
		    		break;
				}
			}
		}
	}

	public boolean seDeplacer(Partie partie) throws DisparuException {
		//Si on a atteint la case de sortie, disparaitre
        // On le fait avant pour qu'on puisse voir le mobile atteindre la sortie
		if(getPosition().getI() == getSortie().getI() && getPosition().getJ() == getSortie().getJ()) {
			System.out.println("Pouf ! :D");
			for(int i = 0; i < partie.getMobiles().size(); i++) {
				if(getNom().equals(partie.getMobiles().get(i).getNom())) {
					partie.getMobiles().remove(i);
					System.out.println("Un mobile a réussi à sortir !");
					throw new DisparuException();
				}
			}
		}

	    //On se déplace a droite si la case n'est pas trop pleine et qu'on a aseez d'énergie
		int x = getPosition().getI() + 1;
		int y = getPosition().getJ();
		//Case caseDroite = partie.getCartes().get(0).getCase(x, y);
        List<Case> chemin = cheminSorti(partie);
		Case nextCase = chemin.get(chemin.size() - 1);
		// Si on assez d'énergie
		if(PA.getValeur() >= nextCase.getNature().getFatigueEntree().getValeur()) {
			return bougerToCase(partie, nextCase);
		} else {
			return false;
		}
	}

	public List<Case> cheminSorti(Partie partie) {
		Queue<Case> file = new ArrayDeque<>();
		HashMap<Case, Case> casesVisitees = new HashMap<>(); // la clé est la case visité, la valeur est la case précédant cette case
		casesVisitees.put(getPosition(), getPosition());

		System.out.println("On est rentrée !");
		Case caseCourante = getPosition();
		// Tant qu'on a pas trouvé la sortie
		while(caseCourante != getSortie()) {
			// On récupère toutes les cartes voisines
		    List<Case> voisines = partie.getCartes().get(0).voisinesCase(caseCourante);

		    // Si ces cases ont déjà été visités OU qu'elles ne sont pas accessibles
            int i = 0;
			while(i < voisines.size()) {
				if(voisines.get(i).getNature().getFatigueEntree().isInfini()
						|| casesVisitees.get(voisines.get(i)) != null) {
					// On les enlèves des voisines
					voisines.remove(i);
				} else {
					i ++;
				}
			}

			// On marque toutes ces cases
            for(Case c : voisines) {
		    	casesVisitees.put(c, caseCourante);
			}

		    // On les rajoutes dans la file
			file.addAll(voisines);

			// On passe à la case suivante
			caseCourante = file.poll();
		}
		System.out.println("CasesVisitees : " + casesVisitees.size());

		// On va reconstruire le chemin !
		List<Case> chemin = new ArrayList<>();
		chemin.add(getSortie());
		caseCourante = getSortie();
		while(casesVisitees.get(caseCourante) != getPosition()) {
			//System.out.println("CaseCourante : " + caseCourante.getI() + " " + caseCourante.getJ());
			caseCourante = casesVisitees.get(caseCourante);
			chemin.add(caseCourante);
		}

		return chemin;
	}

	public boolean bougerToCase(Partie partie, Case c) {
		int x = c.getI();
		int y = c.getJ();
		// Si il n'y a personne déjà sur la carte
		int nb = 0;
		for(Mobile m : partie.getMobiles()) {
			if(m.isEnJeu() && m.getPosition().getI() == x && m.getPosition().getJ() == y) {
				nb ++;
			}
		}
		if(nb + 1 <= c.getNature().getVolume()) {
			// alors on peut entrer :D
			PA.setValeur(PA.getValeur() - c.getNature().getFatigueEntree().getValeur());
			setPosition(c);
			return true;
		}
		return false;
	}
}
