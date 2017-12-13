
public class Obstacle implements PartieElement {

	private String nom;
	private Case campement;
	private Energie PVmax;
	private Energie PV;
	private Energie PA;
	private Jeu.TactiqueType tactique;

	public Obstacle(String nom, 
					Case campement,
					Energie PVmax,
					Jeu.TactiqueType tactique) {
		this.nom = nom;
		this.PVmax = PVmax;
		this.PV = PV;
		this.PA = PA;
		this.tactique = tactique;
	}

	/********* METHODES *********/
	
	public void pertePV(Energie e, Carte carte) {
		int vie = this.PV.getValeur();
		int degats = e.getValeur();
		int nouvPV = vie-degats;
		this.PV.setValeur(nouvPV);
		if (nouvPV<=0) {
			carte.supprimerObstacle(this);
			
		}
	}
	
	public void attaquer(Case direction, Carte carte) {
		/* Dans l'exemple, un seul projectile peut être porté 
		 * On ne considèrera donc pas les PA */
		int iCamp, iDir, jCamp, jDir, diffI, diffJ;
		Case position;
		Case nouvPosition;
		iCamp = this.getCampement().getI();
		iDir = direction.getI();
		jCamp = this.getCampement().getJ();
		jDir = direction.getJ();
		diffI = iDir-iCamp;
		diffJ = jDir-jCamp;
		position = carte.getCase(iCamp+diffI/Math.abs(diffI), jCamp+diffJ/Math.abs(diffJ));
		Projectile p = new Projectile("P", 1, 1, 1, position, direction, new Energie(false, 1));
	}
	
	/********* SETTERS & GETTERS *********/

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Case getCampement() {
		return campement;
	}

	public void setCampement(Case campement) {
		this.campement = campement;
	}

	public Energie getPVmax() {
		return PVmax;
	}

	public void setPVmax(Energie pVmax) {
		PVmax = pVmax;
	}

	public Energie getPV() {
		return PV;
	}

	public void setPV(Energie pV) {
		PV = pV;
	}

	public Energie getPA() {
		return PA;
	}

	public void setPA(Energie pA) {
		PA = pA;
	}

	public Jeu.TactiqueType getTactique() {
		return tactique;
	}

	public void setTactique(Jeu.TactiqueType tactique) {
		this.tactique = tactique;
	}

	
}
