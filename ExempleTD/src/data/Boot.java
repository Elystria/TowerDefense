package data;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

import java.util.ArrayList;
import java.util.List;

import static helpers.Artist.*;

import static org.lwjgl.opengl.GL11.*;

/** Permet de lancer le jeu. Initialise la fenêtre et contient la boucle infinie du jeu */

public class Boot {
		
	public Boot (){
		
		//Initialiser la fenêtre
		BeginSession();
		
		/** La map du jeu
		 * 0 pour décor
		 * 1 pour route
		 * 2 pour campement */
		int[][] map = {
				{0,0,0,0,0},
				{4,1,1,1,5},
				{2,2,2,2,2},
		};
		
		TileGrid grid = new TileGrid(map);
		Tile entree = grid.getTile(0, 1);

		List<Tour> tours = new ArrayList<>();

		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile(LoadTexture("res/sprite_mechant.png", "PNG"), grid.getTile(0, 1), entree.getX(), entree.getY(), 64, 64));

		Player player = new Player(grid, tours);

		while(!Display.isCloseRequested()){

			// Controleur
            player.update();

		    // Affichage !
			grid.Draw();
			for(Mobile m : mobiles) {
				m.Draw();
			}
			for(Tour t : tours) {
				t.draw();
			}
			Display.update();
			Display.sync(FPS);
		}
		
		Display.destroy();
	}
	
	public static void main (String[]args){
		new Boot();
	}

}
