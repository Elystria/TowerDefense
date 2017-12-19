package enigme;
import org.lwjgl.Sys;

public class Obstacle implements PartieElement {

	private String nom;
	private Energie PVmax;
	private Energie PV;
	private Energie PA;
	private Jeu.TactiqueType tactique;
	private Case position;
	private Projectile projectilePrototype;
	private int nbMissilesLancees;

	public Obstacle(String nom, Case campement, Energie PVmax, Jeu.TactiqueType tactique) {
		this.nom = nom;
		this.PVmax = PVmax;
		this.PV = new Energie(PVmax.getValeur());
		this.PA = new Energie(PVmax.getValeur());
		this.tactique = tactique;
		this.position = campement;
		this.nbMissilesLancees = 0;
		this.projectilePrototype = new Projectile("missileDe" + nom, 1, 1, 1, null, null, true, new Energie(1));
	}

	/********* METHODES *********/
	
	public void pertePV(Energie e, Partie partie) {
		int vie = this.PV.getValeur();
		int degats = e.getValeur();
		int nouvPV = vie-degats;
		this.PV.setValeur(nouvPV);
		if (nouvPV<=0) {
		    for(int i = 0; i < partie.getObstacles().size(); i++) {
		    	Obstacle o = partie.getObstacles().get(i);
		    	if(o.getNom().equals(this.getNom())) {
		    		partie.getObstacles().remove(i);
		    		break;
				}
			}
		}
	}
	
	public void attaquer(Partie p) {
		switch (tactique) {
			case faibleFirst:
				// On cherche sur qui tirer
                Mobile cible = null;
			    if(p.getMobiles().size() > 0) {
					Energie min = p.getMobiles().get(0).getPV();
					for(Mobile m : p.getMobiles()) {
						if(m.getPV().getValeur() > min.getValeur()) {
							min = m.getPV();
						}
					}
					int distMax = projectilePrototype.getPortee();
					for(Mobile m : p.getMobiles()) {
						if(m.isEnJeu() && distance2mobile(m) <= distMax) {
							if (m.getPV().getValeur() <= min.getValeur()) {
								min = m.getPV();
								cible = m;
							}
						}
					}
				}

				// On lui tire dessus
				if(cible != null) {
			    	nbMissilesLancees ++;
					Projectile proj = new Projectile(
							projectilePrototype.getNom() + nbMissilesLancees,
							projectilePrototype.getPortee(),
							projectilePrototype.getMasse(),
							projectilePrototype.getVitesse(),
							position,
							cible,
							true,
							projectilePrototype.getDegat());
					p.getProjectiles().add(proj);
				}
				break;
			default:
				System.out.println("Cette tactique n'a pas encore été implémenté !");
				break;
		}
	}

	public int distance2mobile(Mobile m) {
		int dx = Math.abs(m.getPosition().getI() - getPosition().getI());
		int dy = Math.abs(m.getPosition().getJ() - getPosition().getJ());
		return dx + dy;
	}

	public void attaquerAutre(Case direction, Carte carte) {
		/* Dans l'exemple, un seul projectile peut être porté 
		 * On ne considèrera donc pas les PA */
		
		/*int iCamp, iDir, jCamp, jDir, diffI, diffJ;
		Case position;
		iCamp = this.getPosition().getI();
		iDir = direction.getI();
		jCamp = this.getPosition().getJ();
		jDir = direction.getJ();
		diffI = iDir-iCamp;
		diffJ = jDir-jCamp;
		position = carte.getCase(iCamp+diffI/Math.abs(diffI), jCamp+diffJ/Math.abs(diffJ));
		Projectile p = new Projectile("P", 1, 1, 1, position, direction, new Energie(false, 1));
		Projectile p = new Projectile("P", 1, 1, 1, position, direction, new Energie(false, 1));
		carte.ajouterProjectile(p);
		p.seDeplacer(carte);*/
	}
	
	/********* SETTERS & GETTERS *********/

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public Projectile getProjectilePrototype() {
		return projectilePrototype;
	}

	public void setProjectilePrototype(Projectile projectilePrototype) {
		this.projectilePrototype = projectilePrototype;
	}
}
