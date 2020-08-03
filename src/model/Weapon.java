package model;

public class Weapon extends Item {
	
	public Weapon(String name, int damage, int duribility) {
		this.name = name;
		this.damage = damage;
		this.duribility = duribility;
		this.itemType = "Weapon";
	}
	
	public int getWeaponDamage() {
		return super.damage;
	}
	
	public void setDamage(int damage) {
		super.damage = damage;
	}
	
	
}
