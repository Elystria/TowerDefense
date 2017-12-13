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
