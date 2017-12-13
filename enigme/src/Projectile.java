import java.util.Collection;

public class Projectile implements PartieElement {

	private String nom;
	private int portee;
	private int masse;
	private int vitesse;
	private Case position;
	private Case direction;
	private Energie degat;
	
	public Projectile(String nom, int portee, int masse, int vitesse, Case position, Case direction, Energie degat) {
		this.nom = nom;
		this.portee = portee;
		this.masse = masse;
		this.vitesse = vitesse;
		this.position = position;
		this.direction = direction;
		this.degat = degat;
	}

	/********* METHODES *********/
	
	public void seDeplacer(Carte carte) {
		Case pos = this.getPosition();
		Case dir = this.getDirection();
		if (pos.egale(dir)) {
			/* Faire les dégats */
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
						this.infligerDegats(elt, carte);
					}
					/* Supprimer le projectile de la carte*/
					carte.supprimerProjectiles(this);
				}
			}
		}
	}

	public void avancer(Carte carte) {
		int iPos, iDir, jPos, jDir, pas;
		int diffI, diffJ;
		Case nouvPosition;
		iPos = this.getPosition().getI();
		iDir = this.getDirection().getI();
		jPos = this.getPosition().getJ();
		jDir = this.getDirection().getJ();
		diffI = iDir-iPos;
		diffJ = jDir-jPos;
		nouvPosition = carte.getCase(iPos+diffI/Math.abs(diffI), jPos+diffJ/Math.abs(diffJ));
		this.setPosition(nouvPosition);
	}
	
	public void infligerDegats(PartieElement elt, Carte carte) {
		elt.pertePV(this.degat, carte);
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
	public Case getDirection() {
		return direction;
	}
	public void setDirection(Case direction) {
		this.direction = direction;
	}
	public Energie getDegat() {
		return degat;
	}
	public void setDegat(Energie degat) {
		this.degat = degat;
	}
	
	
}
