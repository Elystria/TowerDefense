package helpers;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glVertex2f;
import static org.lwjgl.opengl.GL11.glTranslatef;
import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;
import java.io.InputStream;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import static org.lwjgl.opengl.GL11.*;

/** Contient toutes les méthodes utiles à l'affichage et à l'affichage graphique */
//TODO : doc des méthodes

public class Artist {
	
	//On peut avoir 20 tiles de largeur et 15 de hauteur
	public static final int HAUTEUR = 320, LARGEUR = 192, FPS = 40;
	
	/** Initialise toutes les composantes nécessaires au début d'une session de jeu*/
	public static void BeginSession(){
		// Création de la fenêtre de jeu
		Display.setTitle("Tower Defense 1");
		try {
			Display.setDisplayMode(new DisplayMode(HAUTEUR, LARGEUR));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		//On paramètre la perspective
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,  HAUTEUR, LARGEUR, 0, 1, -1);
		//On passe en mode vue pour pouvoir dessiner et modifier des formes
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
	}
	
	/** Permet de dessiner un quadrilatère */
	public static void DrawQuad(float x, float y, float longueur, float largeur){
		//Dessiner un carré avec successivement les sommets dans le sens horaire depuis celui en haut à gauche
		glBegin(GL_QUADS);
		glVertex2f(x,y);
		glVertex2f(x + longueur,y);
		glVertex2f(x + longueur,y + largeur);
		glVertex2f(x,y + largeur);
		glEnd();
	}
	
	/** Permet de dessiner un quadrilatère avec la texture */
	public static void DrawQuad(Texture tex, float x, float y, float longueur, float largeur){
		//Gérer et placer la texture
		tex.bind();

		//On déplace l'origine du canvas
		glTranslatef(x, y, 0);

		//On créée le carré
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0);
		glVertex2f(0, 0);
		glTexCoord2f(1, 0);
		glVertex2f(longueur, 0);
		glTexCoord2f(1, 1);
		glVertex2f(longueur, largeur);
		glTexCoord2f(0, 1);
		glVertex2f(0, largeur);
		glEnd();
		glLoadIdentity();
	}
	
	public static Texture LoadTexture(String path, String fileType){
		Texture tex = null;
		InputStream in = ResourceLoader.getResourceAsStream(path);
		try {
			tex = TextureLoader.getTexture(fileType, in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tex;
	}


}
