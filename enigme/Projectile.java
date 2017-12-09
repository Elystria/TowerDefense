package enigme;

public class Projectile {

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
