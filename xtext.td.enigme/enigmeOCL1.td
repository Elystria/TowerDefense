//Montre regroupant les contraintes principales sur une partie
// On crée deux parties pour montrer que les problèmes sur p1 n'affectent pas p2
Jeu Jeu1 {
	Partie p1 {
		c11 1 1 montagne
		c12 1 2 garage
		c21 2 1 route_entree
		c22 2 2 route_sortie
		c22 2 3 route_entree
		
		/* On définie la carte */
		Carte carte1 {
			Lignes 2
			Colonnes 2
			Cases c11 c12 c21 c22
		}
		
		Carte carte1 {
			Lignes 2
			Colonnes 2
			Cases c11 c12 c21 c22 
		}
		
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
		NatureTerrain garage {
			Volume 0
			Type camp
			FatigueEntree 0
		}
		
		/* On définie les projectiles */
		Projectile garage {
			Portee 1
			Masse 1
			Vitesse 1
			Position c12
			Direction c22
			Degat 1
		}
				
		/* On définie les mobiles */
		Mobile m {
			F 1
			V  1
			NumVague 1 //inutile
			In c21
			Out c22
			PVmax 1
			Tactique procheFirst
		}
		
		/* On définie les obstacles */
		Obstacle o {
			Campement c12
			PVmax 1
			Tactique faibleFirst
		}
		
		/* On définie l'unique niveau du jeu */
		Niveau niv facile {
			DureePauses 1
			Argent 0
			MobSortisMax 1
			Carte carte1
			Vague v1 { 
					Mobiles m 
					Obstacles o
					Gain 3
				  }
		}
		
				/* On définie l'unique niveau du jeu */
		Niveau niv difficile {
			DureePauses 1
			Argent 0
			MobSortisMax 1
			Carte carte1
			Vague v2 { 
					Mobiles m 
					Obstacles o
					Gain 3
				  }
		}
	}
	Partie p2 {
		//On a le même nom de cases que pour p1 mais cela ne pose pas de problemes
		c11 1 1 montagne
		c12 1 2 garage
		c21 2 1 route_entree
		c22 2 2 route_sortie
		
		//Idem pour carte et le reste des éléments
		Carte carte1 {
			Lignes 2
			Colonnes 2
			Cases c11 c12 c21 c22 
		}
		
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
			Position c12
			Direction c22
			Degat 1
		}
				
		/* On définie les mobiles */
		Mobile m {
			F 1
			V  1
			NumVague 1 //inutile
			In c21
			Out c22
			PVmax 1
			Tactique procheFirst
		}
		
		/* On définie les obstacles */
		Obstacle o {
			Campement c12
			PVmax 1
			Tactique faibleFirst
		}
		
		/* On définie l'unique niveau du jeu */
		Niveau niv facile {
			DureePauses 1
			Argent 0
			MobSortisMax 1
			Carte carte1
			Vague v2 { 
					Mobiles m 
					Obstacles o
					Gain 3
				  }
		}

		
	}
}