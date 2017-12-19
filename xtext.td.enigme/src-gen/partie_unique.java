
package ceJeu;

import data.ceJeuVue;

public class partie_unique {

public static void main (String[ ]args) {

	// On definie les natures de terrain de la carte
	List<NatureTerrain> natures = new ArrayList<>();
	NatureTerrain route_entree = new NatureTerrain("route_entree",1,   Jeu.TYPE_TERRAIN.entree, new Energie(1));
	natures.add(route_entree);
	NatureTerrain route_sortie = new NatureTerrain("route_sortie",1,   Jeu.TYPE_TERRAIN.sortie, new Energie(1));
	natures.add(route_sortie);
	NatureTerrain montagne = new NatureTerrain("montagne",0,   Jeu.TYPE_TERRAIN.deco, new Energie(0));
	natures.add(montagne);
	NatureTerrain route = new NatureTerrain("route",1,   Jeu.TYPE_TERRAIN.chemin, new Energie(1));
	natures.add(route);
	NatureTerrain garage = new NatureTerrain("garage",0,   Jeu.TYPE_TERRAIN.camp, new Energie(0));
	natures.add(garage);

	// On definie les cases de la carte
	List<Case> cases = new Arraylist<>();
	Case c11 = new Case("c11", 1, 1, montagne);  
	cases.add(c11);
	Case c12 = new Case("c12", 1, 2, montagne);  
	cases.add(c12);
	Case c13 = new Case("c13", 1, 3, montagne);  
	cases.add(c13);
	Case c14 = new Case("c14", 1, 4, montagne);  
	cases.add(c14);
	Case c15 = new Case("c15", 1, 5, montagne);  
	cases.add(c15);
	Case c21 = new Case("c21", 2, 1, route_entree);  
	cases.add(c21);
	Case c22 = new Case("c22", 2, 2, route);  
	cases.add(c22);
	Case c23 = new Case("c23", 2, 3, route);  
	cases.add(c23);
	Case c24 = new Case("c24", 2, 4, route);  
	cases.add(c24);
	Case c25 = new Case("c25", 2, 5, route_sortie);  
	cases.add(c25);
	Case c31 = new Case("c31", 3, 1, garage);  
	cases.add(c31);
	Case c32 = new Case("c32", 3, 2, garage);  
	cases.add(c32);
	Case c33 = new Case("c33", 3, 3, garage);  
	cases.add(c33);
	Case c34 = new Case("c34", 3, 4, garage);  
	cases.add(c34);
	Case c35 = new Case("c35", 3, 5, garage);  
	cases.add(c35);

	// On definie les mobiles
	List<Mobile> mobiles = new ArrayList<>();
	Mobile m = new Mobile("m", 1, 1, 1, c21, c25, new Energie(1),Jeu.TactiqueTypeprocheFirst);
	mobiles.add(m); 

	// On definie les obstacles
	List<Obstacle> obstacles = new ArrayList<>();
	Obstacle o = new Obstacle("o",c33, new Energie(1),faibleFirst);
	obstacles.add(o); 

	// On definie les niveaux
	List<Niveau> niveaux = new ArrayList<>();
	List<Vague> vagues;
	List<Carte> cartes;
		// On definie les vagues du niveau
		cartes = new ArrayList<>();
		vagues = new ArrayList<>();
			Vague v1 = new Vague(mobiles, obstacles, 3);
			vagues.add(v1);

		// On definie les cartes du niveau
		Carte carte1 = new Carte("carte1", 3, 5, cases, chemin, obstacles, mobiles);
		cartes.add(carte1);
		
		// Enfin on definie le niveau
		Niveau niv = new Niveau("niv", Jeu.Difficulte.facile,n.dureePause, n.argent, n.mobSortisLimite, carte1 ,vagues);
		niveaux.add(niv;

	

	List<PartieElement> pe = new ArrayList<>();
        pe.addAll(mobiles);
        pe.addAll(obstacles);
	
	Partie partie_unique = new Partie("partie_unique",partie natures, cases, cartes, pe, niveaux);
	partie_unique.setObstacles(obstacles);
	partie_unique.setMobiles(mobiles);

	    // Initialiser l'affichage
        EnigmeVue vue = new EnigmeVue(partie_unique);

        // Tant que la partie n'est pas finie
        while(!Display.isCloseRequested()) {
        //while(!partie_unique.estFinie()) {
            // Calcul du nouveau modele
            // On fait jouer les projectiles
            partie_unique.jouerProjectiles();
            // On fait jouer les obstacles
            partie_unique.jouerObstacles();
            // On fait jouer les mobiles
            partie_unique.jouerMobiles();

            // Transferer le modèle à la vue
            vue.update(partie_unique);

            // Affichage
            vue.afficher();

            // Petite pause pour qu'on ait le temps de voir ce qu'il se passe
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}


	


