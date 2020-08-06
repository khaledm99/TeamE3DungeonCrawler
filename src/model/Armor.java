package model;

public class Armor extends Item{
	
	public Armor(String name, int armorHP, int duribility, String imagePath) {
		this.name = name;
		this.duribility = duribility;
		this.armorHP = armorHP;
		this.itemType = "Armor";
		this.imagePath = imagePath;
	}
	
	public int getArmorHP() {
		return super.armorHP;
	}
	
	public void setArmorHP(int armorHP) {
		super.armorHP = armorHP;
	}

}
