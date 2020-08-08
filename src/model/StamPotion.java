package model;

public class StamPotion extends Item {

	public StamPotion(String name, int potionStam, int duribility) {
		this.name = name;
		this.potionStam = potionStam;
		this.duribility = 1;
		this.itemType = "Stam Potion";
	}
	
	public int getPotionStam() {
		return super.potionStam;
	}
	
	public void setPotionStam(int potionHP) {
		super.potionStam = potionHP;
	}

}

