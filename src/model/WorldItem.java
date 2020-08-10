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
	
	public static boolean keyCheck(Inventory inv, WorldItem worldItem) {
		if (worldItem.getKeyValue() == 0) {
			System.out.println("No key necessary");
			return true;	
		}
		for (int items = 0; items < inv.getInvList().length; items++) {
			if (inv.getInvList()[items].getKeyValue() == worldItem.getKeyValue()) {
				System.out.println("Has key");
				return true;
			}
			
		}
		System.out.println("Key needed");
		return false;
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
