/**
 * Classname: Chest
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Chest world item. Holds location data and item
 * contained within chest. Usable to retrieve item contained.
 *
 */
package model;

public class Chest extends WorldItem {

	private Item contained;
	
	/**
	 * Chest constructor: Takes name, key level required to open, location, and item contained
	 * @param name
	 * @param keyValue
	 * @param floor
	 * @param xcoord
	 * @param ycoord
	 * @param contained
	 */
	public Chest(String name, int keyValue, int floor, int xcoord, int ycoord, Item contained) {
		this.setName(name);
		this.setKeyValue(keyValue);
		this.setFloor(floor);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.contained = contained;
	}
	
	// Contained item getter
	public Item getContained() {
		return this.contained;
	}
	
	/**
	 * onUse method: Checks if an item is inside. If not, prints "Nothing inside...",
	 * If there is an item contained, adds the item to player inventory and sets the chest
	 * to empty.
	 * @param inv
	 * @param map
	 * @param player
	 */
	public String onUse(Inventory inv, Map map, Player player) {
		if (contained == null) {
			return "Nothing inside...";
		}
		else {
			inv.addToInv(inv, contained);
			String itemName = contained.getName();
			this.contained = null;
			return "Added " + itemName + " to inventory";

		}

	}
	
}
