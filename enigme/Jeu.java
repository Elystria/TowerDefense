package enigme;

import java.util.Collection;

public class Jeu {
	
	private String nom;
	private Collection<Partie> parties;
	
	public Jeu(String nom, Collection<Partie> parties) {
		this.nom = nom;
		this.parties = parties;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Partie> getParties() {
		return parties;
	}

	public void setParties(Collection<Partie> parties) {
		this.parties = parties;
	}
	
	

}
