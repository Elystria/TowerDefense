package enigme;

public class Obstacle {

	private String nom;
	private Case campement;
	private Energie PVmax;
	private Energie PV;
	private Energie PA;
	private TactiqueType tactique;
	
	public Obstacle(String nom, 
					Case campement,
					Energie PVmax,
					Energie PV,
					Energie PA,
					TactiqueType tactique) {
		this.nom = nom;
		this.PVmax = PVmax;
		this.PV = PV;
		this.PA = PA;
		this.tactique = tactique;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Case getCampement() {
		return campement;
	}

	public void setCampement(Case campement) {
		this.campement = campement;
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
