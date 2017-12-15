package data;

import enigme.Case;
import enigme.Jeu;
import enigme.Partie;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import java.util.ArrayList;
import java.util.List;

import static helpers.Artist.BeginSession;
import static helpers.Artist.FPS;
import static helpers.Artist.LoadTexture;

public class EnigmeVue {

    /***************** ATTRIBUTS ****************/

    private int largeur, longueur;
    private List<List<Jeu.TYPE_TERRAIN>> map;
    private TileGrid grid;
    List<Tour> tours;
    List<Mobile> mobiles;
    Player player;

    /***************** CONSTRUCTEUR ****************/
    public EnigmeVue(Partie p) {
        BeginSession();
        largeur = p.getCartes().get(0).getNbColonnes();
        longueur = p.getCartes().get(0).getNbLignes();
        map = new ArrayList<>();
        for(int i = 0; i < largeur; i++) {
            map.add(new ArrayList<>());
            for(int j = 0; j < longueur; j++) {
                Case c = p.getCartes().get(0).getCase(i, j);
                map.get(i).add(c.getNature().getType());
            }
        }
        grid = new TileGrid(map);
        tours = new ArrayList<>();
        mobiles = new ArrayList<>();
        player = new Player(grid, tours);
    }

    /***************** METHODES ****************/

    public void afficher() {
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

    public void update(Partie p) {
        // On récupère toutes les tours
        tours = new ArrayList<>();
        Texture tex = LoadTexture("res/sprite_tour.png", "PNG");

        //Maj des tours présentes sur la map
        for(enigme.Obstacle o : p.getObstacles()) {
            tours.add(new Tour(o.getPosition().getI(), o.getPosition().getJ(), tex));
        }
        // On récupère toutes les mobiles
        mobiles = new ArrayList<>();
        tex = LoadTexture("res/sprite_mechant.png", "PNG");
       for (enigme.Mobile m : p.getMobiles()){
           Tile tile = new Tile(m.getEntree().getI() * 64, m.getEntree().getJ() * 64, 64,64,TileType.Entree);
           mobiles.add(new data.Mobile(tex, tile, m.getPosition().getI() * 64, m.getPosition().getJ() * 64, 64, 64));
       }


    }


    /***************** GETS & SETS ****************/
}
