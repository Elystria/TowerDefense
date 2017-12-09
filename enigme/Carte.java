package enigme;

import java.util.Collection;

public class Carte {

	private String nom;
	private int nbLignes;
	private int nbColonnes;
	private Collection<Case> cases;
	
	public Carte(String nom, int nbLignes, int nbColonnes, Collection<Case> cases) {
		this.nom = nom;
		this.nbLignes = nbLignes;
		this.nbColonnes = nbColonnes;
		this.cases = cases;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbLignes() {
		return nbLignes;
	}

	public void setNbLignes(int nbLignes) {
		this.nbLignes = nbLignes;
	}

	public int getNbColonnes() {
		return nbColonnes;
	}

	public void setNbColonnes(int nbColonnes) {
		this.nbColonnes = nbColonnes;
	}

	public Collection<Case> getCases() {
		return cases;
	}

	public void setCases(Collection<Case> cases) {
		this.cases = cases;
	}
	
	

}
