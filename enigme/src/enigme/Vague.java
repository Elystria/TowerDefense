package enigme;
import java.util.List;

public class Vague {

	private List<Mobile> mobiles;
	private List<Obstacle> obstacles;
	private int gainVictoire;
	
	public Vague(List<Mobile> mobiles, List<Obstacle> obstacles, int gainVictoire) {
		this.mobiles = mobiles;
		this.obstacles = obstacles;
		this.gainVictoire = gainVictoire;
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

	public int getGainVictoire() {
		return gainVictoire;
	}

	public void setGainVictoire(int gainVictoire) {
		this.gainVictoire = gainVictoire;
	}
	
	
}
