import org.lwjgl.opengl.Display;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static helpers.Artist.*;

// La classe principale
public class Enigme {

    public static void main(String[] args){
        // Initialiser le jeu
        Energie e1 = new Energie(false, 1);
        Energie e3 = new Energie(false, 3);
        Energie eInf = new Energie(true, -1);
        NatureTerrain montagne = new NatureTerrain("montagne", 0, Jeu.TYPE_TERRAIN.decoration, eInf);
        NatureTerrain route = new NatureTerrain("route", 1, Jeu.TYPE_TERRAIN.chemin, e1);
        NatureTerrain garage = new NatureTerrain("garage", 1, Jeu.TYPE_TERRAIN.campement, eInf);
        List<NatureTerrain> natures = new ArrayList<>();
        Case c11 = new Case("c11", 1, 1, montagne);
        Case c21 = new Case("c21", 2, 1, montagne);
        Case c31 = new Case("c31", 3, 1, montagne);
        Case c41 = new Case("c41", 4, 1, montagne);
        Case c51 = new Case("c51", 5, 1, montagne);
        Case c12 = new Case("c12", 1, 2, route);
        Case c22 = new Case("c22", 2, 2, route);
        Case c32 = new Case("c32", 3, 2, route);
        Case c42 = new Case("c42", 4, 2, route);
        Case c52 = new Case("c52", 5, 2, route);
        Case c13 = new Case("c13", 1, 3, garage);
        Case c23 = new Case("c23", 2, 3, garage);
        Case c33 = new Case("c33", 3, 3, garage);
        Case c43 = new Case("c43", 4, 3, garage);
        Case c53 = new Case("c53", 5, 3, garage);
        List<Case> cases = new ArrayList<>();
        cases.add(c11);
        cases.add(c21);
        cases.add(c31);
        cases.add(c41);
        cases.add(c51);
        cases.add(c12);
        cases.add(c22);
        cases.add(c32);
        cases.add(c42);
        cases.add(c52);
        cases.add(c13);
        cases.add(c23);
        cases.add(c33);
        cases.add(c43);
        cases.add(c53);
        Carte carte = new Carte("carte", 3, 5, cases);
        List<Carte> cartes = new ArrayList<>();
        cartes.add(carte);

        Mobile m1 = new Mobile("m1", 1, 1, 1, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m2 = new Mobile("m2", 1, 1, 2, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m3 = new Mobile("m3", 1, 1, 3, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        List<Mobile> mobiles = new ArrayList<>();

        mobiles.add(m1);
        mobiles.add(m2);
        mobiles.add(m3);

        Obstacle obstacle = new Obstacle("o1", c33, new Energie(1), Jeu.TactiqueType.faibleFirst);
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(obstacle);
        Vague vague = new Vague(mobiles, obstacles, 3);
        List<Vague> vagues = new ArrayList<>();
        vagues.add(vague);

        List<PartieElement> pe = new ArrayList<>();
        pe.addAll(mobiles);
        pe.addAll(obstacles);

        Niveau niveau1 = new Niveau("niveau1", Jeu.Difficulte.facile, 1, 3, 2, carte, vagues);
        List<Niveau> niveaux = new ArrayList<>();
        niveaux.add(niveau1);

        Partie partie = new Partie("partie", natures, cases, cartes, pe, niveaux);

        // Initialiser l'affichage
        BeginSession();


        // Tant que la partie n'est pas finie
        while(!partie.estFinie()) {
            // Calcul du nouveau modele
            // On fait jouer les projectiles
            partie.jouerProjectiles();
            // On fait jouer les obstacles
            partie.jouerObstacles();
            // On fait jouer les mobiles
            partie.jouerMobiles();

            // Affichage

            // Petite pause pour qu'on ait le temps de voir ce qu'il se passe
        }

    }

}
