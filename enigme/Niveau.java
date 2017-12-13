package enigme;

import java.util.Collection;

import enigme.Jeu.Difficulte;

public class Niveau {
	
	private String nom;
	private Difficulte difficulte;
	private int dureePauses;
	private int argent;
	private int mobSortisMax;
	private Carte carte;
	private Collection<Vague> vagues;
	
	public Niveau(String nom, Difficulte difficulte, int dureePauses, int argent, int mobSortisMax, Carte carte,
			Collection<Vague> vagues) {

		this.nom = nom;
		this.difficulte = difficulte;
		this.dureePauses = dureePauses;
		this.argent = argent;
		this.mobSortisMax = mobSortisMax;
		this.carte = carte;
		this.vagues = vagues;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Difficulte getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(Difficulte difficulte) {
		this.difficulte = difficulte;
	}

	public int getDureePauses() {
		return dureePauses;
	}

	public void setDureePauses(int dureePauses) {
		this.dureePauses = dureePauses;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public int getMobSortisMax() {
		return mobSortisMax;
	}

	public void setMobSortisMax(int mobSortisMax) {
		this.mobSortisMax = mobSortisMax;
	}

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public Collection<Vague> getVagues() {
		return vagues;
	}

	public void setVagues(Collection<Vague> vagues) {
		this.vagues = vagues;
	}
	
	
	

}
