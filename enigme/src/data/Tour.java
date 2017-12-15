package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.DrawQuad;

public class Tour {

	private int x, y;
	private float longueur, largeur;
	private Texture texture;

	public Tour(int x, int y, Texture texture) {
		this.x = x;
		this.y = y;
		this.texture = texture;
		this.longueur = 64;
		this.largeur = 64;
	}

	public void draw(){
		DrawQuad(texture, x * 64, y * 64, longueur, largeur);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
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

	public void setX(int x) {
		this.x = x;
	}
}
