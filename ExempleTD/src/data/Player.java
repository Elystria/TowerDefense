package data;

import org.lwjgl.input.Mouse;

import static helpers.Artist.*;
public class Player {
	
	private TileGrid grid;
	
	public Player(TileGrid grid){
		this.grid = grid;
	}
	
	public void SetTile(){

		grid.setTile((int) Math.floor(Mouse.getX() / 64),
				(int) Math.floor((HAUTEUR - Mouse.getY() - 1) / 64) - 2, TileType.Entree);
	}
}
