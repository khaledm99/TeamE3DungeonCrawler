package model;
//import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
	
	private String name = "Unnamed Inv";	
	private Item[] invList;
	private int invElement = 0;
	private final int INVSPACE = 20;
	private Item[] equippedList = new Item[5];
	

	
	//The following are various items to be picked up in-game
	private static Item Empty = new Item();

	public static Key getSilverKey() {
		return new Key("Silver Key", 1, 1, "resource/RandomKey1.png");
	}
	public static Key getGoldKey() {
		return new Key("Gold Key", 2, 1, "resource/RandomKey2.png");
	}
	
	public static Key getCrestOfArtorias() {
		return new Key("Crest of Artorias", 3, 1, "resource/CrestOfArtorias.png");
	}
	
	public static HpPotion getHPUltraPotion() {
		return new HpPotion("Ultra HP Potion", 20, 1, "resource/EstusFlask.png");
	}
	public static StamPotion getUltraStaminaPotion() {
		return new StamPotion("Ultra Stamina Potion", 6, 1, "resource/GreenBlossom.png");
	}
	public Armor getArmorScraps() {
		return new Armor("Armor Scraps", 2, 10, "resource/ArmorScraps.png");
	}
	public static Armor getRustyIronArmor() {
		return new Armor("Rusty Iron Armor", 10, 10, "resource/RustyArmor.png");
	}
	public static Armor getShinyIronArmor() {
		return new Armor("Shiny Iron Armor", 15, 20, "resource/ShinyArmor.png");
	}
	public static StamPotion getStaminaPotion() {
		return new StamPotion("Stamina Potion", 4, 1, "resource/StaminaPotion.png");
	}
	public static HpPotion getHPPotion() {
		return new HpPotion("HP Potion", 10, 1, "resource/HPPotion.png");
	}
	public static Armor getLeatherArmor()
	{
		return new Armor("Leather Armor", 4, 10, "resource/LeatherArmor.png");
	}
	public Weapon getRustySword() {
		return new Weapon("Rusty Sword", 7, 5, "resource/RustySword.png");
	}
	public Weapon getWoodenSword()
	{
		return new Weapon("Wooden Sword",5,10, "resource/WoodenSword.png");
	}
	
	public static Weapon getIronSword()
	{
		return new Weapon("Iron Sword",10,10, "resource/IronSword.png");
	}
	public Weapon getSilverSword()
	{
		return new Weapon("Silver Sword",15,15, "resource/SilverSword.png");
	}
	public static Weapon getFlamingSword()
	{
		return new Weapon("Flaming Sword", 20, 20, "resource/FlamingSword.png");
	}
	public Item getEmpty()
	{
		return new Item();
	}
	public Item[] getInvList()
	{
		return this.invList;
	}
	public void setInvList() {
		
	}
	public String getInvName()
	{
		return this.name;
	}
	
	public void setEquippedList(Item[] aList) {
		this.equippedList = aList;
	}
	public Item[] getEquippedList() {
		return equippedList;
		
	}
	
	public int usePotion() {
		int potionHP = equippedList[3].getPotionHP();
		dropFromInv(equippedList[3]);
		unEquipItem(3);
		return potionHP;
	}
	public void equipItem(int anIndex) {
		Boolean alreadyEquipped = false;
		if (anIndex <= this.invList.length && this.invList[anIndex].getItemType() != "Empty") {
			for(int i = 0; i < getEquippedList().length; i++) {
				if (this.invList[anIndex] == equippedList[i]) {
					alreadyEquipped = true;
				}
			}
			if (alreadyEquipped == false) {
			if (this.invList[anIndex].getItemType() == "Weapon") {
				if (equippedList[0] == null) {
					equippedList[0] = this.invList[anIndex];
				}
				else {
					equippedList[1] = this.invList[anIndex];
				}
			}
			else if (this.invList[anIndex].getItemType() == "Armor") {
				equippedList[2] = this.invList[anIndex];
			}
			else if (this.invList[anIndex].getItemType() == "HP Potion") {
				equippedList[3] = this.invList[anIndex];
			}	
			else if (this.invList[anIndex].getItemType() == "Stam Potion") {
				equippedList[4] = this.invList[anIndex];
				}
			setEquippedList(equippedList);
			}
			else {
				System.out.println("Item already equipped");
			}
		}
		else {
			System.out.println("Make sure you equip an Item in the list");
		}
	}
	
	public void unEquipItem(int anIndex) {
		if (anIndex <= getEquippedList().length && getEquippedList()[anIndex] != null) {
			this.equippedList[anIndex] = null;
		}
		setEquippedList(this.equippedList);
	}

	public Inventory(String name)
	{
		//default start inventory for p1//
		this.name = name;
		invList = new Item[INVSPACE];
		Arrays.fill(invList, Empty);
		if (name != "Xavier") 
		{
			invList[invElement++] = getWoodenSword();
			invList[invElement++] = getArmorScraps();
			invList[invElement++] = getHPPotion();
			invList[invElement++] = getStaminaPotion();
		}
		else {
			invList[invElement++] = getFlamingSword();
			invList[invElement++] = getShinyIronArmor();
			invList[invElement++] = getHPUltraPotion();
			invList[invElement++] = getSilverSword();
			invList[invElement++] = getSilverSword();
			invList[invElement++] = getHPPotion();
			invList[invElement++] = getStaminaPotion();
			invList[invElement++] = getUltraStaminaPotion();
			invList[invElement++] = getRustySword();
			invList[invElement++] = getSilverSword();
			invList[invElement++] = getSilverSword();
			invList[invElement++] = getHPPotion();
			invList[invElement++] = getStaminaPotion();
			invList[invElement++] = getUltraStaminaPotion();
			invList[invElement++] = getRustySword();
			invList[invElement++] = getFlamingSword();
			
			invList[invElement++] = getSilverSword();
		}
	}

	public Inventory(Inventory toCopy)
	{
		name = toCopy.name;
		invList = toCopy.invList;
		invElement = toCopy.invElement;
	}
	
	public void addToInv(Inventory anInv, Item anItem)
	{
		if (anInv.invList[anInv.invElement].getItemType() == "Empty")
		{
		anInv.invList[anInv.invElement++]=anItem;
		}
		else
		{
			for(int i = 0; i < anInv.invList.length; i++)
			{
				if (invList[i] == Empty)
				{
					anInv.invList[i]=anItem;
					i = anInv.invList.length;
					anInv.invElement++;
				}
			}
		}		
	}
	
	//first iteration drop function
	/*	
	public void dropFromInv(int aSlot)
	{
		if(this.invList[aSlot] != Empty)
		{
			this.invElement--;
			this.invList[aSlot]=Empty;

		}
		else 
		{
			System.out.println("Slot " + aSlot + " already empty");
		}
		
	}
	*/
	public void dropFromInv(Item anItem)
	{
		//System.out.println("in drop()");
		for(int aSlot = 0; aSlot < invList.length; aSlot++) {
			if(this.invList[aSlot] == anItem) {
				this.invElement--;
				this.invList[aSlot]= Empty;
				break;
			}
		}
	}
	public void dropFromSlot(Item anItem, int aSlot) {
		//System.out.println("in drop()");
			if(this.invList[aSlot] == anItem) {
				this.invElement--;
				this.invList[aSlot]=Empty;
				}
	}
	
	public void giveToInv(Inventory anInv, Item anItem)
	{
		boolean hasItem = false;
		for(int i = 0; i < this.invList.length; i++)
		{
			if (this.invList[i] == anItem)
			{
				this.invList[i] = Empty;
				hasItem = true;
			}
		}
		if (hasItem == true)
		{
			Item tradedItem = new Item(anItem);
			if (anInv.invList[anInv.invElement] == Empty)
			{
				anInv.invList[anInv.invElement++] = tradedItem;

			}
		}
		else 
		{
			System.out.println(anItem.getName() + " not found within " + this.getInvName() + "'s inventory");
		}
	}
	

	public void getInventory()
	{
		int spaceLeft = 0;
		//Output for p1 Inventory
		for(int i = 0; i < this.invList.length; i++)
		{
			if (this.invList[i] == Empty)
			{
				spaceLeft++;
			}
		}
		System.out.println("---------------------------");
		System.out.println(this.getInvName() + "'s Inventory");
		System.out.println ("------------------------------------------------------");


		for(int i = 0; i< this.invList.length;i++)
		{
			if (this.invList[i].getName() != "Empty")
				
				if(this.invList[i].getItemType() == "Weapon"){
					System.out.println(this.invList[i].getName() + " |Damage: " + this.invList[i].getDamage()+" Duribililty: "
							+ this.invList[i].getDuribility() +"| In Inventory slot "+ i );
				}
				else if(this.invList[i].getItemType() == "Armor") {
				System.out.println(this.invList[i].getName() + " |AP: " + this.invList[i].getArmorHP()+" Duribililty: "
			+ this.invList[i].getDuribility() +"| In Inventory slot "+ i);
				}
				else if(this.invList[i].getItemType() == "HP Potion") {
					System.out.println(this.invList[i].getName() + " |HP: " + this.invList[i].getPotionHP()+" Duribililty: "
							+ this.invList[i].getDuribility() +"| In Inventory slot "+ i);
				}
				else if(this.invList[i].getItemType() == "Stam Potion") {
					System.out.println(this.invList[i].getName() + " |SP: " + this.invList[i].getPotionStam()+" Duribililty: "
							+ this.invList[i].getDuribility() +"| In Inventory slot "+ i);
				}
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Inventory Slots Remaining: " + (spaceLeft));
		System.out.println("Equipped Items");
		System.out.println("------------------------------------------------------");
		//Displays the currently equipped list
		for(int i = 0; i < getEquippedList().length; i++) {
			if(getEquippedList()[i] != null) {
			System.out.println(getEquippedList()[i].getName() + " Index slot: " + i);
			}
		}
		System.out.println("------------------------------------------------------");
	}
	
}