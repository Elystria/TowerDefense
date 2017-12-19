package enigme;
import org.lwjgl.input.Mouse;

import java.util.Collection;

public class Projectile implements PartieElement {

	private String nom;
	private int portee;
	private int masse;
	private int vitesse;
	private Case position;
	private PartieElement cible;
	private boolean cibleMobile;
	private Energie degat;

	public Projectile(String nom, int portee, int masse, int vitesse, Case position, PartieElement cible, boolean cibleMobile, Energie degat) {
		this.nom = nom;
		this.portee = portee;
		this.masse = masse;
		this.vitesse = vitesse;
		this.position = position;
		this.cible = cible;
		this.degat = degat;
		this.cibleMobile = cibleMobile;
	}

	/********* METHODES *********/

	public void seDeplacer(Partie partie) {
		Case dir = null;
		if(cibleMobile) {
			dir = ((Mobile) this.getCible()).getPosition();
		} else {
			dir = ((Obstacle) this.getCible()).getPosition();
		}

		// Pour chaque case de la vitesse
		for(int i = 0; i < vitesse; i++) {
			// On se déplace
			avancer(partie.getCartes().get(0));

			// Si on est sur un adversaire ou qu'on a atteint notre destination, on explose
            if(dir.egale(getPosition())) {
            	exploser(partie);
            	return;
			}
			if(cibleMobile) {
            	for(Mobile m : partie.getMobiles()) {
            		if(m.isEnJeu() && m.getPosition().egale(getPosition())) {
            			exploser(partie);
            			return;
					}
				}
			} else {
				for(Obstacle o : partie.getObstacles()) {
					if(o.getPosition().egale(getPosition())) {
						exploser(partie);
						return;
					}
				}
			}
		}
	}

	public void exploser(Partie partie) {
		// On inflige les dégats
		// On sait qu'un mobile ne peut pas être sur la même case qu'un obstacle
		// Donc on se pose pas trop de questions
		if(cibleMobile) {
			for(int i = 0; i < partie.getMobiles().size(); i++) {
				Mobile m = partie.getMobiles().get(i);
				if(m.isEnJeu() && m.getPosition().egale(getPosition())) {
					m.pertePV(degat, partie);
				}
			}
		} else {
			for(int i = 0; i < partie.getObstacles().size(); i++) {
				Obstacle o = partie.getObstacles().get(i);
				if(o.getPosition().egale(getPosition())) {
					o.pertePV(degat, partie);
				}
			}
		}

		// On se supprime !
		for(int i = 0; i < partie.getProjectiles().size(); i++) {
			Projectile p = partie.getProjectiles().get(i);
			if(p.getNom().equals(getNom())) {
				partie.getProjectiles().remove(i);
				break;
			}
		}
	}

	public void seDeplacerCarte(Partie partie) {
		Carte carte = partie.getCartes().get(0);
		Case dir;
		if(cibleMobile) {
			dir = ((Mobile) this.getCible()).getPosition();
		} else {
			dir = ((Obstacle) this.getCible()).getPosition();
		}
		Case pos = this.getPosition();
		if (pos.egale(dir)) {
			/* Faire les dégats */
			pos = this.getPosition();
			Collection<PartieElement> contenu = carte.contenuCase(pos);
			if (contenu!=null) {
				for (PartieElement elt : contenu) {
				    if(elt instanceof Mobile) {
						this.infligerDegats((Mobile) elt, partie);
					} else {
						this.infligerDegats((Obstacle) elt, partie);
					}
				}
				/* Supprimer le projectile de la carte*/
				carte.supprimerProjectiles(this);
			}
			/* Supprimer le projectile de la carte */
			carte.supprimerProjectiles(this);
		} else {
			int i = 1;
			while (!(pos.egale(dir)) || i < vitesse) {
				this.avancer(carte);
				i++;
				pos = this.getPosition();
				/* Maj position dans la carte */
				/* je pense que c'est le même projectile qu'on utilise dans la carte, 
				 * donc il n'y a pas besoin de mettre la position du projectile a jour dans la arte
				 */
				/* Vérifier qu'il y ait un élément dans la case Position */
				Collection<PartieElement>contenu = carte.contenuCase(pos);
				if (contenu!=null) {
					for (PartieElement elt : contenu) {
					    if(elt instanceof Mobile) {
							this.infligerDegats((Mobile) elt, partie);
						} else {
							this.infligerDegats((Obstacle) elt, partie);
						}
					}
					/* Supprimer le projectile de la carte*/
					carte.supprimerProjectiles(this);
				}
			}
		}
	}

	public void avancer(Carte carte) {
		Case nouvPosition;
		Case caseCible;
		if(cibleMobile) {
			caseCible = ((Mobile) this.getCible()).getPosition();
		} else {
			caseCible = ((Obstacle) this.getCible()).getPosition();
		}
		int iPos = this.getPosition().getI();
		int iDir = caseCible.getI();
		int jPos = this.getPosition().getJ();
		int jDir = caseCible.getJ();
		int diffI = iDir - iPos;
		int diffJ = jDir - jPos;
		if(!(diffI == 0 && diffJ == 0)) {
			if (Math.abs(diffI) > Math.abs(diffJ)) {
				nouvPosition = carte.getCase(iPos + diffI / Math.abs(diffI), jPos);
			} else {
				nouvPosition = carte.getCase(iPos, jPos + diffJ / Math.abs(diffJ));
			}
			this.setPosition(nouvPosition);
		}
	}
	
	public void infligerDegats(Obstacle o, Partie partie) {
		o.pertePV(this.degat, partie);
	}

	public void infligerDegats(Mobile m, Partie partie) {
		m.pertePV(this.degat, partie);
	}

	
	/********* SETTERS & GETTERS *********/
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPortee() {
		return portee;
	}
	public void setPortee(int portee) {
		this.portee = portee;
	}
	public int getMasse() {
		return masse;
	}
	public void setMasse(int masse) {
		this.masse = masse;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public Case getPosition() {
		return position;
	}
	public void setPosition(Case position) {
		this.position = position;
	}
	public Energie getDegat() {
		return degat;
	}
	public void setDegat(Energie degat) {
		this.degat = degat;
	}

	public PartieElement getCible() {
		return cible;
	}

	public void setCible(PartieElement cible) {
		this.cible = cible;
	}

	public boolean isCibleMobile() {
		return cibleMobile;
	}

	public void setCibleMobile(boolean cibleMobile) {
		this.cibleMobile = cibleMobile;
	}
}
