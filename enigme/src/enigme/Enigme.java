// TODO : implémentation projectiles
// TODO : 
package enigme;

import data.EnigmeVue;
import data.Player;
import enigme.*;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;

import javax.print.attribute.standard.MediaSize;
import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static helpers.Artist.*;

// La classe principale
public class Enigme {

    public static void main (String[] args) {
        // Initialiser le jeu
        Energie e1 = new Energie(false, 1);
        Energie e3 = new Energie(false, 3);
        Energie eInf = new Energie(true, -1);
        NatureTerrain montagne = new NatureTerrain("montagne", 0, Jeu.TYPE_TERRAIN.decoration, eInf);
        NatureTerrain route = new NatureTerrain("route", 1, Jeu.TYPE_TERRAIN.chemin, e1);
        NatureTerrain garage = new NatureTerrain("garage", 1, Jeu.TYPE_TERRAIN.campement, eInf);
        List<NatureTerrain> natures = new ArrayList<>();
        Case c11 = new Case("c11", 0, 0, montagne);
        Case c21 = new Case("c21", 1, 0, montagne);
        Case c31 = new Case("c31", 2, 0, montagne);
        Case c41 = new Case("c41", 3, 0, montagne);
        Case c51 = new Case("c51", 4, 0, montagne);
        Case c12 = new Case("c12", 0, 1, route);
        Case c22 = new Case("c22", 1, 1, route);
        Case c32 = new Case("c32", 2, 1, route);
        Case c42 = new Case("c42", 3, 1, route);
        Case c52 = new Case("c52", 4, 1, route);
        Case c13 = new Case("c13", 0, 2, garage);
        Case c23 = new Case("c23", 1, 2, garage);
        Case c33 = new Case("c33", 2, 2, garage);
        Case c43 = new Case("c43", 3, 2, garage);
        Case c53 = new Case("c53", 4, 2, garage);
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
        
        //Le chemin des mobiles
        ArrayList<Case> chemin = new ArrayList<Case>();
        chemin.add(c21);
        chemin.add(c22);
        chemin.add(c23);
        

        Mobile m1 = new Mobile("m1", 1, 1, 1, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m2 = new Mobile("m2", 1, 1, 2, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m3 = new Mobile("m3", 1, 1, 3, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m4 = new Mobile("m4", 1, 1, 1, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m5 = new Mobile("m5", 1, 1, 2, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        Mobile m6 = new Mobile("m6", 1, 1, 3, c12, c52, new Energie(1), Jeu.TactiqueType.procheFirst);
        List<Mobile> mobiles = new ArrayList<>();

        mobiles.add(m1);
        mobiles.add(m2);
        mobiles.add(m3);

        Obstacle obstacle = new Obstacle("o1", c33, new Energie(1), Jeu.TactiqueType.faibleFirst);
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(obstacle);
        Vague vague = new Vague(mobiles, obstacles, 3);
        List<Mobile> mobiles2 = new ArrayList<>();
        mobiles2.add(m4);
        mobiles2.add(m5);
        mobiles2.add(m6);
        Vague vague2 = new Vague(mobiles2, new ArrayList<Obstacle>(), 3);
        List<Vague> vagues = new ArrayList<>();
        vagues.add(vague);
        vagues.add(vague2);

        List<PartieElement> pe = new ArrayList<>();
        pe.addAll(mobiles);
        pe.addAll(obstacles);
        
        // On cré la carte
        Carte carte = new Carte("carte", 3, 5, cases, chemin,  obstacles, mobiles);
        List<Carte> cartes = new ArrayList<>();
        cartes.add(carte);

        Niveau niveau1 = new Niveau("niveau1", Jeu.Difficulte.facile, 1, 3, 2, carte, vagues);
        List<Niveau> niveaux = new ArrayList<>();
        niveaux.add(niveau1);

        Partie partie = new Partie("partie", natures, cases, cartes, pe, niveaux);
        partie.setObstacles(obstacles);
        partie.setMobiles(mobiles);
        
        
        // Initialiser l'affichage
        EnigmeVue vue = new EnigmeVue(partie);

        partie.validerChemins();

        // Tant que la partie n'est pas finie
        // Pour chaque vague
        int nbVague = partie.getNiveaux().get(0).getVagues().size();
        int vagueCourante = 0;
        boolean fermerFenetre = false;
        while(vagueCourante < nbVague && !fermerFenetre) {
            // On initialise la vague
            partie.setMobiles(partie.getNiveaux().get(0).getVagues().get(vagueCourante).getMobiles());
            if(vagueCourante > 0) {
                partie.getObstacles().addAll(partie.getNiveaux().get(0).getVagues().get(vagueCourante).getObstacles());
            }
            partie.setMobilesSorti(0);

            // Jouer la vague !
            while(!partie.estTerminee() && !fermerFenetre) {
                // Calcul du nouveau modele
                // On fait jouer les obstacles
                partie.jouerObstacles();
                // On fait jouer les projectiles
                partie.jouerProjectiles();
                // On fait jouer les mobiles
                partie.jouerMobiles();

                // Transferer le modèle à la vue
                vue.update(partie);

                // Affichage
                vue.afficher();

                // Petite pause pour qu'on ait le temps de voir ce qu'il se passe
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                fermerFenetre = Display.isCloseRequested();
            }
            // Si on a gagné la manche
            if(partie.getMobilesSorti() < partie.getNiveaux().get(0).getMobSortisMax()) {
                // Alors on gagne des sous !
                partie.setArgent(partie.getArgent() + partie.getNiveaux().get(0).getArgent());
                System.out.println("Vous gagnez " + partie.getNiveaux().get(0).getArgent() + " pièces !");
            }

            // Petit temps pour que le joueur puisse placer ses tourelles !
            long time = System.currentTimeMillis();
            Player player = new Player(vue.getGrid(), vue.getTours());
            System.out.println("Vous pouvez ajouter des Tours !");
            System.out.println("Il vous reste " + partie.getArgent() + " pièces.");
            while(System.currentTimeMillis() - time <= 5000 && !fermerFenetre) {
                // On permet de rajouter des tours
                player.update(vue, partie);

                // Transferer le modèle à la vue
                vue.update(partie);

                // Affichage
                vue.afficher();

                fermerFenetre = Display.isCloseRequested();
            }

            // On passe à la vague suivante
            vagueCourante ++;
        }
    }

}
