
public class Mobile implements PartieElement {

	private String nom;
	private int force;
	private int volume;
	private int numVague;
	private Case entree;
	private Case sortie;
	private Energie PVmax;
	private Energie PV;
	private Energie PA;
	private Jeu.TactiqueType tactique;
	private Case position;

	public Mobile(String nom, int force, int volume, int numVague, Case entree, Case sortie, Energie pVmax,
			Jeu.TactiqueType tactique) {
		this.nom = nom;
		this.force = force;
		this.volume = volume;
		this.numVague = numVague;
		this.entree = entree;
		this.sortie = sortie;
		PVmax = pVmax;
		PV = new Energie(pVmax.getValeur());
		PA = new Energie(pVmax.getValeur());
		this.tactique = tactique;
	}

	/********* METHODES *********/
	

	
	public void attaquer(Case direction, Carte carte) {
		/* Dans l'exemple, un seul projectile peut être porté 
		 * On ne considèrera donc pas les PA */
		int iPos, iDir, jPos, jDir, diffI, diffJ;
		Case position;
		Case nouvPosition;
		iPos = this.getPosition().getI();
		iDir = direction.getI();
		jPos = this.getPosition().getJ();
		jDir = direction.getJ();
		diffI = iDir-iPos;
		diffJ = jDir-jPos;
		position = carte.getCase(iPos+diffI/Math.abs(diffI), jPos+diffJ/Math.abs(diffJ));
		Projectile p = new Projectile("P", 1, 1, 1, position, direction, new Energie(false, 1));
	}
	
	public void pertePV(Energie e, Carte carte) {
		int vie = this.PV.getValeur();
		int degats = e.getValeur();
		int nouvPV = vie-degats;
		this.PV.setValeur(nouvPV);
		if (nouvPV<=0) {
			carte.supprimerMobile(this);
			
		}
	}
	/********* SETTERS & GETTERS *********/
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getNumVague() {
		return numVague;
	}
	public void setNumVague(int numVague) {
		this.numVague = numVague;
	}
	public Case getEntree() {
		return entree;
	}
	public void setEntree(Case entree) {
		this.entree = entree;
	}
	public Case getSortie() {
		return sortie;
	}
	public void setSortie(Case sortie) {
		this.sortie = sortie;
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
	public Case getPosition() {
		return position;
	}

	public void setPosition(Case position) {
		this.position = position;
	}
	
	public void avancer(Carte carte){

		int index = carte.getCheminMobiles().indexOf(this.position);
		carte.getMobiles().remove(this.getPosition());
		this.position = carte.getCheminMobiles().get(index+1);
		carte.getMobiles().put(position, this);
	
	}




}
