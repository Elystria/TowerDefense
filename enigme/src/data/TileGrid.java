package data;

import static helpers.Artist.*;

/** Pour construire la grille de jeu graphiquement */

public class TileGrid {

	public Tile[][] map;

	public TileGrid() {
		map = new Tile[5][3];
		for(int i =0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				map[i][j] = new Tile( i * 64, j * 64, 64, 64, TileType.Montagne);
			}
		}
	}
	
	public TileGrid(int[][] newMap){
		map = new Tile[5][3];
		for(int i =0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				
				switch (newMap[j][i]){
				//Montagne
				case 0: 
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Montagne);
					break;
				//Route
				case 1:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Route);
					break;
				//Camp
				case 2:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Camp);
					break;
				//Entree
				case 4:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Entree);
					break;
				//Sortie
				case 5:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Sortie);
					break;
					
				}
			}
		}
	}
	
	public void setTile(int x, int y, TileType type){
		int n = map[x].length;
		map[x][y] = new Tile(x * 64, (n - y - 1) * 64, 64, 64, type);
	}
	
	public Tile getTile(int x, int y){
		return map[x][y];
	}
	
	public void Draw(){
		for(int i =0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				Tile t = map[i][j];
				DrawQuad(t.getTexture(), t.getX(), t.getY(), t.getLongueur(), t.getLargeur());
			}
		}
	}
}
