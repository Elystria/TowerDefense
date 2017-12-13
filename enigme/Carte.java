package enigme;

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
	
	public void avancerMobile(Mobile mob) {
		
		int index = cheminMobiles.indexOf(mob.getPosition());
		mobiles.remove(mob.getPosition());
		mob.setPosition(cheminMobiles.get(index+1));
		mobiles.put(mob.getPosition(), mob);
	}
	
	public void pertePV(Energie e, Obstacle o) {
		int vie = o.getPV().getValeur();
		int degats = e.getValeur();
		int nouvPV = vie-degats;
		o.getPV().setValeur(nouvPV);
		if (nouvPV<=0) {
			supprimerObstacle(o);
		}
	}
}
