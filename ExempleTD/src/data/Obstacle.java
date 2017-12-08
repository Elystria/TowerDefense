package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Obstacle {
	private int longueur, largeur;
	private float x, y;
	private Texture texture;
	private Tile tile;
	
	public Obstacle(Texture texture, Tile tile, float x, float y, int longueur, int largeur){
		this.texture = texture;
		this.x = tile.getX();
		this.y = tile.getY();
		this.longueur = longueur;
		this.largeur = largeur;
		
	}
	
	public void Draw(){
		DrawQuad(texture, x, y, longueur, largeur);
	}

}