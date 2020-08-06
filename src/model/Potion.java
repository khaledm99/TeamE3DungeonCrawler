package model;

public class Potion extends Item{
	
	public Potion(String name, int potionHP, int duribility, String imagePath) {
		this.name = name;
		this.potionHP = potionHP;
		this.duribility = 1;
		this.itemType = "Potion";
		this.imagePath = imagePath;
	}
	
	public int getPotionHP() {
		return super.potionHP;
	}
	
	public void setPotionHP(int potionHP) {
		super.potionHP = potionHP;
	}

}
