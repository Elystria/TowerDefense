package enigme;

public class NatureTerrain {
	
	private String nom;
	private int volume;
	private TYPE_TERRAIN type;
	private Energie fatigueEntree;
	
	public NatureTerrain(String nom, int volume, TYPE_TERRAIN type, Energie fatigueEntree) {
		this.nom = nom;
		this.volume = volume;
		this.type = type;
		this.fatigueEntree = fatigueEntree;
	}

}
