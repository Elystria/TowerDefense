public class Energie {

	private boolean infini;
	private int valeur;
	
	public Energie(boolean infini, int valeur) {
		this.infini = infini;
		this.valeur = valeur;
	}

	public Energie(int valeur) {
		this(false, valeur);
	}
	
	public boolean isInfini() {
		return infini;
	}
	public void setInfini(boolean infini) {
		this.infini = infini;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
