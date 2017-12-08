package data;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;

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
		
		Mobile m = new Mobile(LoadTexture("res/sprite_mechant.png", "PNG"), grid.getTile(0, 1), entree.getX(), entree.getY(), 64, 64);
		Player player = new Player(grid);
		
		while(!Display.isCloseRequested()){
			
			grid.Draw();
			m.Draw();
			
			player.SetTile();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
