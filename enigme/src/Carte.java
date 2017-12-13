import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Carte {

	private String nom;
	private int nbLignes;
	private int nbColonnes;
	private Collection<Case> cases;
	private HashMap<Case, Mobile>  mobiles;
	private HashMap<Case, Obstacle> obstacles;
	private HashMap<Case, Collection<Projectile>> projectiles;
	private ArrayList<Case> cheminMobiles;

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
	
	

	public HashMap<Case, Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(HashMap<Case, Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public HashMap<Case, Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(HashMap<Case, Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	public HashMap<Case, Collection<Projectile>> getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(HashMap<Case, Collection<Projectile>> projectiles) {
		this.projectiles = projectiles;
	}

	public ArrayList<Case> getCheminMobiles() {
		return cheminMobiles;
	}

	public void setCheminMobiles(ArrayList<Case> cheminMobiles) {
		this.cheminMobiles = cheminMobiles;
	}

	public void mobilesAutour(int portee, Case position ) {

		for (int i = 0; i <= portee; i++) {
			mobiles.get(position);


			for (int j = 0; j <= portee; j++) {

			}
		}
	}

	public void supprimerMobile(Mobile mobile) {
		mobiles.remove(mobile.getPosition());
	}

	public void supprimerObstacle(Obstacle obstacle) {
		obstacles.remove(obstacle.getCampement());
	}

	public void supprimerProjectiles(Projectile projectile) {
		Collection<Projectile>listeProjectiles = projectiles.get(projectile.getPosition());
		listeProjectiles.remove(projectile);

	}
	
	public Case getCase(int i, int j) {
		Boolean trouve = false;
		Iterator<Case> it = cases.iterator();
		Case casePossible = it.next();

		while (it.hasNext() && !trouve) {
			if (casePossible.getI() == i && casePossible.getJ() == j) {
				trouve = true;
			}
		}
		return casePossible;
	}


	public Collection<PartieElement> contenuCase(Case c) {
		Collection<PartieElement>contenu = null;
		if (mobiles.containsKey(c)) {
			contenu.add(mobiles.get(c));
		}
		
		if (obstacles.containsKey(c)) {
			contenu.add(obstacles.get(c));
		}
		return contenu;
		
	}



}
