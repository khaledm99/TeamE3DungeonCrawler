package model;

public class HpPotion extends Item{
	
	public HpPotion(String name, int potionHP, int duribility) {
		this.name = name;
		this.potionHP = potionHP;
		this.duribility = 1;
		this.itemType = "HP Potion";
	}
	
	public int getPotionHP() {
		return super.potionHP;
	}
	
	public void setPotionHP(int potionHP) {
		super.potionHP = potionHP;
	}

}
