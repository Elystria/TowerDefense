Jeu exemple2 {
	Partie partie1 {
		
		
		/* Définition des cases */
		c11 1 1 route_entree
		c12 1 2 route
		c13 1 3 montagne
		c14 1 4 montagne
		c15 1 5 garage
		c16 1 6 garage
		c17 1 7 garage
		c18 1 8 garage
		c21 2 1 garage
		c22 2 2 route
		c23 2 3 montagne
		c24 2 4 montagne
		c25 2 5 montagne
		c26 2 6 garage
		c27 2 7 garage
		c28 2 8 garage
		c31 3 1 montagne
		c32 3 2 route
		c33 3 3 route
		c34 3 4 route
		c35 3 5 montagne
		c36 3 6 montagne
		c37 3 7 garage
		c38 3 8 garage
		c41 4 1 garage
		c42 4 2 garage
		c43 4 3 garage
		c44 4 4 route
		c45 4 5 route
		c46 4 6 garage
		c47 4 7 montagne
		c48 4 8 montagne
		c51 5 1 montagne
		c52 5 2 garage
		c53 5 3 montagne
		c54 5 4 montagne
		c55 5 5 route
		c56 5 6 route 
		c57 5 7 route 
		c58 5 8 montagne
		c61 6 1 montagne
		c62 6 2 montagne
		c63 6 3 garage
		c64 6 4 montagne
		c65 6 5 montagne
		c66 6 6 montagne
		c67 6 7 route_sortie
		c68 6 8 garage
		
		/*On définie la carte 1 */
		Carte carte1 {
			Lignes 6
			Colonnes 8
			Cases c11 c12 c13 c14 c15 c16 c17 c18
						c21 c22 c23 c24 c25 c26 c27 c28
						c31 c32 c33 c34 c35 c36 c37 c38
						c41 c42 c43 c44 c45 c46 c47 c48
						c51 c52 c53 c54 c55 c56 c57 c58
						c61 c62 c63 c64 c65 c66 c67 c68
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
			Position c11
			Direction c12
			Degat 1
		}
		
		/* On définie les mobiles */
		Mobile m {
			F 1
			V  1
			NumVague 1
			In c21
			Out c25
			PVmax 1
			Tactique procheFirst
		}
		
		/* On définie les obstacles */
		Obstacle o {
			Campement c46
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