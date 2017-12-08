package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

/** Définit une tile à afficher */

public class Tile {
	
	private float x, y, longueur, largeur;
	private Texture texture;
	private TileType type;
	
	public Tile(float x, float y, float longueur, float largeur, TileType type){
		this.x = x;
		this.y = y;
		this.longueur = longueur;
		this.largeur = largeur;
		this.type = type;
		this.texture = LoadTexture(type.textureName, "PNG");
		
	}
	
	public void Draw(){
		DrawQuad(texture, x, y, longueur, largeur);
	}
	
	/*****************************/
	/** GETTERS & SETTERS       */
	/****************************/

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}
	
	

}
