/**
 * Classname: WorldItem
 * 
 * Version: 0
 * 
 * Author: TeamE3
 * 
 * Description: General class representing items to be displayed and interacted
 * with in the map. Holds location data and key possession check.
 *
 */
package model;

import application.MainController;

public class WorldItem extends Item{
	private int floor; // Map level to hold the item
	private int xcoord; 
	private int ycoord; 

	// Xcoord getter
	public int getXcoord() {
		return this.xcoord;
	}
	
	// Xcoord setter
	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}
	
	// Ycoord getter
	public int getYcoord() {
		return this.ycoord;
	}
	
	// Ycoord setter
	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}
	
	// Floor getter
	public int getFloor() {
		return this.floor;
	}
	
	// Floor setter
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	/**
	 * keyCheck method: Checks if the key required to access the world
	 * item is currently in the player's inventory. Returns true if the 
	 * item doesn't need a key or the player holds the necessary key
	 * @param inv
	 * @param worldItem
	 * @return boolean
	 */
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
	
	/**
	 * checkSurroundings method: checks if there is a world item adjacent to the player
	 * in the four cardinal directions. Returns true if there is.
	 * @param player
	 * @return boolean
	 */
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
	
	// General onUse method, to be overwritten by child classes. 
	public String onUse(Inventory inv, Map map, Player player) {
		return "";
	}
}
