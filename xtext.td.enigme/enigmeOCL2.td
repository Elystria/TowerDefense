/*Démonstration des contraintes sur les obstacles, projectiles, mobiles */
Jeu exemple1 { 
	Partie partie_unique {
		
		 
		/* On définie les cases qui vont être utilisées */
		c11 1 1 montagne
		c12 1 2 montagne
		c13 1 3 montagne
		c14 1 4 montagne
		c15 1 5 montagne
		c21 2 1 route_entree
		c22 2 2 route
		c23 2 3 route
		c24 2 4 route
		c25 2 5 route_sortie
		c31 3 1 garage
		c32 3 2 garage
		c33 3 3 garage
		c34 3 4 garage
		c35 3 5 garage
				
		/* On définie la carte */
		Carte carte1 {
			Lignes 3
			Colonnes 5
			Cases c11 c12 c13 c14 c15 c21 c22 c23 c24 c25 c31 c32 c33 c34 c35
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
			Portee 0
			Masse 1
			Vitesse 0
			Position c13
			Direction c12
			Degat 1
		}
		
		/* On définie les mobiles -> ce mobile est tres mal defini */
		Mobile m {
			F 1
			V  0
			NumVague 0 //inutile
			In c22
			Out c23
			PVmax 0
			Tactique procheFirst
		}
		
		/* On définie les obstacles -> il est sur une case deco */
		Obstacle o1 {
			Campement c11
			PVmax 0
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
					Obstacles o1
					Gain 3
				  }
		}
		
	}
}