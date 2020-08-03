package model;

public class Armor extends Item{
	
	public Armor(String name, int armorHP, int duribility) {
		this.name = name;
		this.duribility = duribility;
		this.armorHP = armorHP;
		this.itemType = "Armor";
	}
	
	public int getArmorHP() {
		return super.armorHP;
	}
	
	public void setArmorHP(int armorHP) {
		super.armorHP = armorHP;
	}

}
