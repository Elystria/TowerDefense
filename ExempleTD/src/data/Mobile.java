package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Mobile {
	private int longueur, largeur;
	private float x, y;
	private Texture texture;
	private Tile startTile;
	
	public Mobile(Texture texture, Tile startTile, float x, float y, int longueur, int largeur){
		this.texture = texture;
		this.x = startTile.getX();
		this.y = startTile.getY();
		this.longueur = longueur;
		this.largeur = largeur;
		
	}
	
	public void Draw(){
		DrawQuad(texture, x, y, longueur, largeur);
	}
	
	

}
