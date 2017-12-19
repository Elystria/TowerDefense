package enigme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Carte {

	private String nom;
	private int nbLignes;
	private int nbColonnes;
	private Collection<Case> cases;
	private HashMap<Case, Mobile> mobiles;
	private HashMap<Case, Obstacle> obstacles;
	private HashMap<Case, Collection<Projectile>> projectiles;
	private ArrayList<Case> cheminMobiles;

	public Carte(String nom, int nbLignes, int nbColonnes, Collection<Case> cases, ArrayList<Case> chemin, List<Obstacle> obstacleList, List<Mobile> mobileList) {
		this.nom = nom;
		this.nbLignes = nbLignes;
		this.nbColonnes = nbColonnes;
		this.cases = cases;
		this.cheminMobiles = chemin;
		this.obstacles = new HashMap<Case,Obstacle>();
		this.mobiles = new HashMap<Case,Mobile>();
		for (Obstacle o: obstacleList) {
			obstacles.put(o.getPosition(), o);
		}
		for (Mobile m: mobileList) {
			mobiles.put(m.getPosition(), m);
		}
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
	
	

	public Collection<Mobile> mobilesAutour(int portee, Case position) {
		Collection<Mobile> res = new ArrayList<>();
		for (Case c : cases) {
			if (c.getI() == position.getI() && c.getJ() == position.getJ() +1) {
				if (mobiles.containsKey(c)) {
					res.add(mobiles.get(c));
				}
			}
			if (c.getI() == position.getI() && c.getJ() == position.getJ() -1) {
				if (mobiles.containsKey(c)) {
					res.add(mobiles.get(c));	
				}
			}
		}
		return res;
	}
	

	public void supprimerMobile(Mobile mobile) {
		mobiles.remove(mobile.getPosition());
	}

	public void supprimerObstacle(Obstacle obstacle) {
		obstacles.remove(obstacle.getPosition());
	}

	public void supprimerProjectiles(Projectile projectile) {
		Collection<Projectile>listeProjectiles = projectiles.get(projectile.getPosition());
		listeProjectiles.remove(projectile);
	}

	public void avancerMobile(Mobile mob) {
		int index = cheminMobiles.indexOf(mob.getPosition());
		mobiles.remove(mob.getPosition());
		mob.setPosition(cheminMobiles.get(index + 1));
		mobiles.put(mob.getPosition(), mob);
	}

	public Case getCase(int i, int j) {
		for(Case c : cases) {
			if(c.getI() == i && c.getJ() == j) {
				return c;
			}
		}
		return null;
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
	
	public void ajouterProjectile(Projectile p) {
		Collection<Projectile> listPro = projectiles.get(p.getPosition());
		listPro.add(p);
		projectiles.remove(p.getPosition());
		projectiles.put(p.getPosition(), listPro );
	}
	
	public void ajouterObstacle(Obstacle o) {
		obstacles.put(o.getPosition(), o);
	}
	
	public void ajouterMobile(Mobile m) {
		mobiles.put(m.getPosition(), m);
	}

	public List<Case> voisinesCase(Case c) {
		List<Case> voisines = new ArrayList<>();
		Case newCase;
		newCase = getCase(c.getI() + 1, c.getJ());
		if(newCase != null) {
			voisines.add(newCase);
		}
		newCase = getCase(c.getI(), c.getJ() + 1);
		if(newCase != null) {
			voisines.add(newCase);
		}
		newCase = getCase(c.getI() - 1, c.getJ());
		if(newCase != null) {
			voisines.add(newCase);
		}
		newCase = getCase(c.getI(), c.getJ() - 1);
		if(newCase != null) {
			voisines.add(newCase);
		}
		return voisines;
	}
}
