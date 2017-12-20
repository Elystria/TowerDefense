Jeu exemple1 { 
	Partie partie_unique {
		
		/* On définit les cases qui vont être utilisées */
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
		
		/* On définit la carte */
		Carte carte1 {
			Lignes 3
			Colonnes 5
			Cases c11 c12 c13 c14 c15 c21 c22 c23 c24 c25 c31 c32 c33 c34 c35
		}
		
		e0 0
		e1 1
		
		/* On définit les natures de terrain qui vont être utilisées */
		NatureTerrain route_entree {
			Volume 1
			Type entree
			FatigueEntree e1
		}
		NatureTerrain route_sortie {
			Volume 1
			Type sortie
			FatigueEntree e1
		}
		NatureTerrain montagne {
			Volume 0
			Type deco
			FatigueEntree e0
		}
		NatureTerrain route {
			Volume 1
			Type chemin
			FatigueEntree e1
		}
		NatureTerrain garage {
			Volume 0
			Type camp
			FatigueEntree e0
		}
		
		/* On définit les projectiles */
		Projectile p {
			Portee 1
			Masse 1
			Vitesse 1
			Position c21
			Direction c31
			Degat e1
		}
		
		/* On définit les mobiles */
		Mobile m {
			F 1
			V  1
			NumVague 1 //inutile --> plus maintenant
			In c21
			Out c25
			PVmax e1

			Tactique procheFirst
		}
		
		/* On définit les obstacles */
		Obstacle o {
			Campement c33
			PVmax e1
			Tactique faibleFirst
		}
		
		
		/* On définit l'unique niveau du jeu */
		Niveau niv facile {
			DureePauses 1
			Argent 0
			MobSortisMax 2
			Carte carte1
			Vague V1 { 
					Mobiles m m m
					Obstacles o
					Gain 3
				  }

		}
		
	}
}
