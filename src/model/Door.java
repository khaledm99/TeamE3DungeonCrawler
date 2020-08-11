/**
 * Classname: Door
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Door world object. Holds location data, 
 * key level required to access, and location for the text file containing
 * the map the door leads to.
 *
 */
package model;

import java.io.IOException;

public class Door extends WorldItem {
	
	private String leadsTo;
	
	/**
	 * Door constructor.
	 * @param name
	 * @param keyValue
	 * @param floor
	 * @param xcoord
	 * @param ycoord
	 * @param leadsTo
	 */
	public Door(String name, int keyValue, int floor, int xcoord, int ycoord, String leadsTo) {
		this.setName(name);
		this.setKeyValue(keyValue);
		this.setFloor(floor);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.leadsTo = leadsTo;
		
	}
	
	// Default Constructor
	public Door() {
		
	}
	
	/**
	 * onUse method: Overwrites the onUse method in WorldItem. When
	 * called, loads the map chosen by leadsTo variable.
	 * @param inv
	 * @param map
	 * @param player
	 */
	public String onUse(Inventory inv, Map map, Player player) {
		try {
			map.readMap(leadsTo, player);
		} catch (IOException e) {
			System.out.println("Issue when loading map from door");
			e.printStackTrace();
		}
		return "Entering door...";
	}
	
	
	
}
