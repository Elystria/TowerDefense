package enigme;

public class Mobile {

	private String nom;
	private int force;
	private int volume;
	private int numVague;
	private Case entree;
	private Case sortie;
	private Energie PVmax;
	private Energie PV;
	private Energie PA;
	private TactiqueType tactique;
	
	public Mobile(String nom, int force, int volume, int numVague, Case entree, Case sortie, Energie pVmax, Energie pV,
			Energie pA, TactiqueType tactique) {
		this.nom = nom;
		this.force = force;
		this.volume = volume;
		this.numVague = numVague;
		this.entree = entree;
		this.sortie = sortie;
		PVmax = pVmax;
		PV = pV;
		PA = pA;
		this.tactique = tactique;
	}
	
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
	public TactiqueType getTactique() {
		return tactique;
	}
	public void setTactique(TactiqueType tactique) {
		this.tactique = tactique;
	}
	
	
}
