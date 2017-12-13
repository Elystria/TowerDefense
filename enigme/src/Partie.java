import java.util.Collection;

public class Partie {

    /************************************************
     * ATTRIBUTS
    ************************************************/
	private String name;
	private Collection<NatureTerrain> natures;
	private Collection<Case> cases;
	private Collection<Carte> cartes;
	private Collection<PartieElement> partieElements;
	private Collection<Niveau> niveaux;

	/************************************************
     * CONSTRUCTEUR
	 ************************************************/

	public Partie(String name, Collection<NatureTerrain> natures, Collection<Case> cases, Collection<Carte> cartes,
				  Collection<PartieElement> partieElements, Collection<Niveau> niveaux) {

		this.name = name;
		this.natures = natures;
		this.cases = cases;
		this.cartes = cartes;
		this.partieElements = partieElements;
		this.niveaux = niveaux;
	}
	/************************************************
     * METHODES
	 ************************************************/

	public void joueurProjectiles() {
	    // pour tous les projectiles

	}

	/************************************************
     * GETS & SETS
	 ************************************************/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<NatureTerrain> getNatures() {
		return natures;
	}

	public void setNatures(Collection<NatureTerrain> natures) {
		this.natures = natures;
	}

	public Collection<Case> getCases() {
		return cases;
	}

	public void setCases(Collection<Case> cases) {
		this.cases = cases;
	}

	public Collection<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(Collection<Carte> cartes) {
		this.cartes = cartes;
	}

	public Collection<PartieElement> getPartieElements() {
		return partieElements;
	}

	public void setPartieElements(Collection<PartieElement> partieElements) {
		this.partieElements = partieElements;
	}

	public Collection<Niveau> getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(Collection<Niveau> niveaux) {
		this.niveaux = niveaux;
	}
	
	
}
