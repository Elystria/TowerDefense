package enigme;
import java.util.Collection;

public class Jeu {
	
	public enum TactiqueType {
		procheFirst,
		faibleFirst,
		fortFirst;
	}
	
	public static enum TYPE_TERRAIN {
		entree,
		sortie,
		chemin,
		campement,
		decoration;
	}
	
	public enum Difficulte {
		facile,
		moyen,
		difficile;
	}
	
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
