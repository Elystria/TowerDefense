/*Démonstration des contraintes sur les cartes*/
Jeu exemple1 { 
	Partie partie_unique {
		
		 
		/* On définie les cases qui vont être utilisées */
		c11 1 1 montagne
		c11bis 1 1 montagne
		c12 1 2 montagne
		c13 1 3 montagne
		c14 1 4 montagne
		c15 1 5 montagne
		c21 2 1 route_entree
		c21nonentree 2 1 route
		c22 2 2 route
		c23 2 3 route
		c24 2 4 route
		c25 2 5 route_sortie
		c25nonsortie 2 5 route
		c31 3 1 garage
		c32 3 2 garage
		c33 3 3 garage
		c34 3 4 garage
		c35 3 5 garage
		c47 4 7 garage //une case incoherente de par ses dimensions
		c31m 3 1 montagne
		c32m 3 2 montagne
		c33m 3 3 montagne
		c34m 3 4 montagne
		c35m 3 5 montagne
		
		
		/* On définit la carte */
		Carte carte1 {
			Lignes 0
			Colonnes 0
			Cases c11 c12 c13 c14 c15 c21 c22 c23 c24 c25 c31 c32 c33 c34 c35
		}
		
		/* On a oublié c11 et la derniere case n'a pas de coordonnees plausibles */
		Carte carte2 {
			Lignes 3
			Colonnes 5
			Cases c12 c13 c14 c15 c21 c22 c23 c24 c25 c31 c32 c33 c34 c47
		}
		
		/* Deux cases de même coordonnees présentes */
		Carte carte3 {
			Lignes 3
			Colonnes 5
			Cases c11 c11bis c12 c13 c14 c15 c21 c22 c23 c24 c25 c31 c32 c33 c34
		}
		/* deux cases identiques */
		Carte carte4 {
			Lignes 3
			Colonnes 5
			Cases c11 c11 c12 c13 c14 c15 c21 c22 c23 c24 c25 c31 c32 c33 c34
		}
		
		/* Carte mal formee */
		Carte carte5 {
			Lignes 3
			Colonnes 5
			Cases c11 c12 c13 c14 c15 c21nonentree c22 c23 c24 c25nonsortie c31m c32m c33m c34m c35m
		}
		
		/* On définie les natures de terrain qui vont être utilisées */
		NatureTerrain route_entree {
			Volume 1
			Type entree
			FatigueEntree 1
		}
		NatureTerrain route_sortie {
			Volume 1
			Type sortie
			FatigueEntree 1
		}
		NatureTerrain montagne {
			Volume 0
			Type deco
			FatigueEntree 0
		}
		NatureTerrain route {
			Volume 1
			Type chemin
			FatigueEntree 1
		}
		NatureTerrain garage {
			Volume 0
			Type camp
			FatigueEntree 0
		}
	
		
		/* On définie les projectiles */
		Projectile p {
			Portee 1
			Masse 1
			Vitesse 1
			Position c21
			Direction c31
			Degat 1
		}
		
		/* On définie les mobiles */
		Mobile m {
			F 1
			V  1
			NumVague 1 //inutile
			In c21
			Out c25
			PVmax 1
			Tactique procheFirst
		}
		
		/* On définie les obstacles */
		Obstacle o {
			Campement c33
			PVmax 1
			Tactique faibleFirst
		}
		
		
		/* On définie l'unique niveau du jeu */
		Niveau niv facile {
			DureePauses 1
			Argent 0
			MobSortisMax 2
			Carte carte1
			Vague v1 { 
					Mobiles m m m
					Obstacles o
					Gain 3
				  }
		}
		
	}
}