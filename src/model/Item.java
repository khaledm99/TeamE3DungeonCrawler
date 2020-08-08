package model;

public class Item {
	protected String name;
	protected int damage;
	protected int duribility;
	protected int armorHP;
	protected String itemType;
	protected int potionHP;
	protected int value;
	protected int potionStam;
	protected int keyValue;
	
	public Item(String name, String type, int value, int duribility) 
	{
		this.name = name;
		this.value = value;
		this.duribility = duribility;
		this.itemType = type;
		
	}
	
	public Item ()
	{
		this.name = "Empty";
		this.itemType = "Empty";
	}
	
	public Item(Item toCopy)
	{
		this.name = toCopy.name;
		this.damage = toCopy.damage;
		this.duribility = toCopy.duribility;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	
	public String getItemType() {
		return itemType;
	}
	
	public void setDamage(int damage) 
	{
		this.damage = damage;
	}
	
	public int getDuribility() {
		return duribility;
	}
	
	public void setDuribility(int duribility) 
	{
		this.duribility = duribility;
	}
	
	public void setArmorHP(int armorHP) {
		this.armorHP = armorHP;
	}
	
	public int getArmorHP() {
		return armorHP;
	}
	
	public int getPotionHP() {
		return potionHP;
	}
	
	public void setPotionHP(int potionHP) {
		this.potionHP = potionHP;
	}
	
	public int getPotionStam() {
		return potionStam;
	}
	
	public void setPotionStam(int potionStam) {
		this.potionStam = potionStam;
	}
	
	public int getKeyValue() {
		return keyValue;
	}
	
	public void setKeyValue(int keyValue) {
		this.keyValue = keyValue;
	}
}
	
	
	