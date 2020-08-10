package model;

public class WorldItem extends Item{
	private int floor;
	private int xcoord;
	private int ycoord;

	
	public int getXcoord() {
		return this.xcoord;
	}
	
	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}
	
	public int getYcoord() {
		return this.ycoord;
	}
	
	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}
	
	public int getFloor() {
		return this.floor;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public boolean checkSurroundings(Player player) {
		if ((player.getXcoord()-1 == this.xcoord) && (player.getYcoord() == this.ycoord)) {
			return true;
		}
		
		else if ((player.getXcoord()+1 == this.xcoord) && (player.getYcoord() == this.ycoord)) {
			return true;
		}
		
		else if ((player.getXcoord() == this.xcoord) && (player.getYcoord()-1 == this.ycoord)) {
			return true;
		}
		
		else if ((player.getXcoord() == this.xcoord) && (player.getYcoord()+1 == this.ycoord)) {
			return true;
		}
		return false;

	}
	
	public String onUse(Inventory inv, Map map, Player player) {
		return "";
	}
}
