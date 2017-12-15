package enigme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Partie {

    /************************************************
     * ATTRIBUTS
    ************************************************/
	private String name;
	private List<NatureTerrain> natures;
	private List<Case> cases;
	private List<Carte> cartes;
	private List<Niveau> niveaux;
	private List<Projectile> projectiles;
	private List<Mobile> mobiles;
	private List<Obstacle> obstacles;

	/************************************************
     * CONSTRUCTEUR
	 ************************************************/

	public Partie(String name, List<NatureTerrain> natures, List<Case> cases, List<Carte> cartes,
				  List<PartieElement> partieElements, List<Niveau> niveaux) {

		this.name = name;
		this.natures = natures;
		this.cases = cases;
		this.cartes = cartes;
		this.niveaux = niveaux;
		projectiles = new ArrayList<>();
		mobiles = new ArrayList<>();
		obstacles = new ArrayList<>();
		for(PartieElement pe : partieElements) {
			if(pe instanceof Projectile) {
				projectiles.add((Projectile) pe);
			} else if (pe instanceof Mobile) {
				mobiles.add((Mobile) pe);
			} else {
				obstacles.add((Obstacle) pe);
			}
		}
	}
	/************************************************
     * METHODES
	 ************************************************/

	public void jouerProjectiles() {
	    // pour tous les projectiles
		for(Projectile p : projectiles) {
			p.seDeplacer(cartes.get(0));
		}
	}

	public void jouerObstacles() {
		// pour tous les Obstacles
		Carte c = cartes.get(0);
		Collection<Mobile> mobilesPourAttaque = new ArrayList<Mobile>();

		for(Obstacle o : obstacles) {
		    o.attaquer(this);
		    mobilesPourAttaque = c.mobilesAutour(1,o.getPosition());
		    for (Mobile m : mobilesPourAttaque) {
		    	o.attaquerAutre(m.getPosition(), c);
		    }
		    
		}
	}

	public void jouerMobiles() {
		Collection<Mobile> mobilesAutours = new ArrayList<Mobile>();
		Carte c = cartes.get(0);
		// pour tous les mobiles
		for(int i = 0; i < getMobiles().size(); i++) {
			Mobile m = getMobiles().get(i);
			m.seDeplacer(this);

		}
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

	public List<NatureTerrain> getNatures() {
		return natures;
	}

	public void setNatures(List<NatureTerrain> natures) {
		this.natures = natures;
	}

	public List<Case> getCases() {
		return cases;
	}

	public void setCases(List<Case> cases) {
		this.cases = cases;
	}

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}

	public List<Niveau> getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(List<Niveau> niveaux) {
		this.niveaux = niveaux;
	}

	public List<Projectile> getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(List<Projectile> projectiles) {
		this.projectiles = projectiles;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public List<Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}
}
