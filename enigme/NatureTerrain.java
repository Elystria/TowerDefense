package enigme;

import enigme.Jeu.TYPE_TERRAIN;

public class NatureTerrain implements PartieElement {
	
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

	public TYPE_TERRAIN getType() {
		return type;
	}

	public void setType(TYPE_TERRAIN type) {
		this.type = type;
	}

	public Energie getFatigueEntree() {
		return fatigueEntree;
	}

	public void setFatigueEntree(Energie fatigueEntree) {
		this.fatigueEntree = fatigueEntree;
	}

}
