package model;

import java.io.IOException;

public class Door extends WorldItem {
	
	private String leadsTo;
	
	public Door(String name, int keyValue, int floor, int xcoord, int ycoord, String leadsTo) {
		this.setName(name);
		this.setKeyValue(keyValue);
		this.setFloor(floor);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.leadsTo = leadsTo;
		
	}
	
	public Door() {
		
	}
	
	
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
