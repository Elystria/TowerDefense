package data;

/** Permet de définir le type de chaque tile et des propriétés associées */

public enum TileType {
	
	Montagne("res/tile_herbe.png", false), 
	Route("res/tile_terre.png", false), 
	Camp("res/tile_camp.png", true),
	Entree("res/tile_entree.png", false), 
	Sortie("res/tile_entree.png", false),
	Mobile("res/sprite_mechant", false),
	Obstacle("res/sprite_tour.png", false);
	
	String textureName;
	boolean buildable;

	TileType(String textureName, boolean buildable){
		this.textureName = textureName;
		this.buildable = buildable;
	}

	public boolean isBuildable() {
		return buildable;
	}

}
