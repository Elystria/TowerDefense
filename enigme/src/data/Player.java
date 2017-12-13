package data;

import org.lwjgl.input.Mouse;

import java.util.List;

import static helpers.Artist.*;
public class Player {
	
	private TileGrid grid;
	private List<Tour> tours;
	private boolean boutonRelache = true;
	
	public Player(TileGrid grid, List<Tour> tours){
		this.grid = grid;
		this.tours = tours;
	}
	
	public void SetTile(){
		int xMouse = Mouse.getX();
		int yMouse = Mouse.getY();
		int xTile = xMouse / 64;
		int yTile = yMouse / 64;

		grid.setTile(xTile,yTile,TileType.Entree);
	}

	public void update() {
		if(Mouse.isButtonDown(0) && boutonRelache) {
			boutonRelache = false;
			int xMouse = Mouse.getX();
			int yMouse = Mouse.getY();
			int xTile = xMouse / 64;
			int yTile = yMouse / 64;
			int n = grid.map[0].length;

			if(grid.map[xTile][n - yTile - 1].getType().isBuildable()){
			    if(!grid.map[xTile][n - yTile - 1].isBuilded()) {
					creerTour(xTile, n - yTile - 1);
					grid.map[xTile][n - yTile - 1].setBuilded(true);
				} else {
			    	supprimerTour(xTile, n - yTile - 1);
					grid.map[xTile][n - yTile - 1].setBuilded(false);
				}
			}
		}
		if(!Mouse.isButtonDown(0)) {
			boutonRelache = true;
		}
	}

	public void creerTour(int x, int y) {
		tours.add(new Tour(x, y, LoadTexture("res/sprite_tour.png", "PNG")));
	}

	public void supprimerTour(int x, int y) {
		for(int i = 0; i < tours.size(); i++){
			if(tours.get(i).getX() == x && tours.get(i).getY() == y){
				tours.remove(i);
				break;
			}
		}
	}
}
