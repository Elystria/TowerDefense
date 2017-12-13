
public class NatureTerrain implements PartieElement {
	
	private String nom;
	private int volume;
	private Jeu.TYPE_TERRAIN type;
	private Energie fatigueEntree;
	
	public NatureTerrain(String nom, int volume, Jeu.TYPE_TERRAIN type, Energie fatigueEntree) {
		this.nom = nom;
		this.volume = volume;
		this.type = type;
		this.fatigueEntree = fatigueEntree;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Jeu.TYPE_TERRAIN getType() {
		return type;
	}

	public void setType(Jeu.TYPE_TERRAIN type) {
		this.type = type;
	}

	public Energie getFatigueEntree() {
		return fatigueEntree;
	}

	public void setFatigueEntree(Energie fatigueEntree) {
		this.fatigueEntree = fatigueEntree;
	}

}
