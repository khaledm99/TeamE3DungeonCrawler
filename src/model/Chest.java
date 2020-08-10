package model;

public class Chest extends WorldItem {

	private Item contained;
	
	public Chest(String name, int keyValue, int floor, int xcoord, int ycoord, Item contained) {
		this.setName(name);
		this.setKeyValue(keyValue);
		this.setFloor(floor);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.contained = contained;
	}
	
	public Item getContained() {
		return this.contained;
	}
	
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
