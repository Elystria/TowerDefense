package data;

import enigme.Energie;
import enigme.Jeu;
import enigme.Obstacle;
import enigme.Partie;
import org.lwjgl.Sys;
import org.lwjgl.input.Mouse;

import java.util.List;

import static helpers.Artist.*;
public class Player {
	
	private boolean boutonRelache = true;
	
	public Player(TileGrid grid, List<Tour> tours){
	}
	
	public void update(EnigmeVue vue, Partie partie) {
		TileGrid grid = vue.getGrid();

		if(Mouse.isButtonDown(0) && boutonRelache) {
			boutonRelache = false;
			int xMouse = Mouse.getX();
			int yMouse = Mouse.getY();
			int xTile = xMouse / 64;
			int yTile = yMouse / 64;
			int n = grid.map[0].length;

			boolean ilYaDejaUneTour = false; // #meilleur nom de variable EVER !
			for(enigme.Obstacle o : partie.getObstacles()) {
				if(o.getPosition().getI() == xTile && o.getPosition().getJ() == n - yTile - 1) {
					ilYaDejaUneTour = true;
				}
			}

			if(grid.map[xTile][n - yTile - 1].getType().isBuildable()){
			    if(!ilYaDejaUneTour && !grid.map[xTile][n - yTile - 1].isBuilded()) {
					creerTour(xTile, n - yTile - 1, vue, partie);
					grid.map[xTile][n - yTile - 1].setBuilded(true);
				} else {
			    	supprimerTour(xTile, n - yTile - 1, vue, partie);
					grid.map[xTile][n - yTile - 1].setBuilded(false);
				}
			}
		}
		if(!Mouse.isButtonDown(0)) {
			boutonRelache = true;
		}
	}

	public void creerTour(int x, int y, EnigmeVue vue, Partie partie) {
		List<Tour> tours = vue.getTours();
		tours.add(new Tour(x, y, LoadTexture("res/sprite_tour.png", "PNG")));
		enigme.Obstacle nouvelleTour = new Obstacle(
				"o" + x + "_" + y,
                partie.getCartes().get(0).getCase(x, y),
				new Energie(1),
				Jeu.TactiqueType.faibleFirst);
		partie.getObstacles().add(nouvelleTour);
	}

	public void supprimerTour(int x, int y, EnigmeVue vue, Partie partie) {
		List<Tour> tours = vue.getTours();
		for(int i = 0; i < tours.size(); i++){
			if(tours.get(i).getX() == x && tours.get(i).getY() == y){
				tours.remove(i);
				break;
			}
		}
		for(int i = 0; i < partie.getObstacles().size(); i++) {
			enigme.Obstacle o = partie.getObstacles().get(i);
			if(o.getPosition().getI() == x && o.getPosition().getJ() == y) {
				partie.getObstacles().remove(i);
				break;
			}
		}
	}
}
