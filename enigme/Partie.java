package enigme;

import java.util.Collection;

public class Partie {

	private String id;
	private Collection<NatureTerrain> natures;
	private Collection<Case> cases;
	private Collection<Carte> cartes;
	private Collection<PartieElement> partieElements;
	private Collection<Niveau> niveaux;
	
	public Partie(String id, Collection<NatureTerrain> natures, Collection<Case> cases, Collection<Carte> cartes,
			Collection<PartieElement> partieElements, Collection<Niveau> niveaux) {

		this.id = id;
		this.natures = natures;
		this.cases = cases;
		this.cartes = cartes;
		this.partieElements = partieElements;
		this.niveaux = niveaux;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
