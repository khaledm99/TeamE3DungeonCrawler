package model;

public class Weapon extends Item {
	
	public Weapon(String name, int damage, int duribility, String imagePath) {
		this.name = name;
		this.damage = damage;
		this.duribility = duribility;
		this.itemType = "Weapon";
		this.imagePath = imagePath;
	}
	
	public int getWeaponDamage() {
		return super.damage;
	}
	
	public void setDamage(int damage) {
		super.damage = damage;
	}
	
	
}
