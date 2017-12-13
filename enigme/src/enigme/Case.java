package enigme;
public class Case {

	private String id;
	private int i;
	private int j;
	private NatureTerrain nature;
	
	public Case(String id, int i, int j, NatureTerrain nature) {
		this.id = id;
		this.i = i;
		this.j = j;
		this.nature = nature;
	}

	/********* METHODES *********/
	
	public boolean egale(Case c) {
		boolean egales;
		int i1, i2, j1, j2;
		i1 = this.getI();
		i2 = c.getI();
		j1 = this.getJ();
		j2 = c.getJ();
		
		if ((i1==i2) && (j1==j2)) {
			egales = true;
		} else {
			egales = false;
		}
		return egales;
	}
	
	/********* SETTERS & GETTERS *********/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public NatureTerrain getNature() {
		return nature;
	}

	public void setNature(NatureTerrain nature) {
		this.nature = nature;
	}
}
