package enigme;

import java.util.Collection;

public class Vague {

	private Collection<Mobile> mobiles;
	private Collection<Obstacle> obstacles;
	private int gainVictoire;
	
	public Vague(Collection<Mobile> mobiles, Collection<Obstacle> obstacles, int gainVictoire) {
		this.mobiles = mobiles;
		this.obstacles = obstacles;
		this.gainVictoire = gainVictoire;
	}

	public Collection<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(Collection<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public Collection<Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(Collection<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	public int getGainVictoire() {
		return gainVictoire;
	}

	public void setGainVictoire(int gainVictoire) {
		this.gainVictoire = gainVictoire;
	}
	
	
}
