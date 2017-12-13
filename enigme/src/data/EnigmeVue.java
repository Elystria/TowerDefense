package data;

import enigme.Case;
import enigme.Jeu;
import enigme.Partie;
import org.lwjgl.opengl.Display;

import java.util.ArrayList;
import java.util.List;

import static helpers.Artist.BeginSession;
import static helpers.Artist.FPS;

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


    /***************** GETS & SETS ****************/
}
