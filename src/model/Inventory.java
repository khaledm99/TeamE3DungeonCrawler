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
	private static Weapon woodenSword = new Weapon("Wooden Sword",5,10);
	private static Weapon ironSword = new Weapon("Iron Sword",7,20);
	private static Weapon silverSword = new Weapon("Silver Sword",15,15);
	private static Weapon flamingSword = new Weapon("Flaming Sword", 30, 30);
	private static Weapon rustySword = new Weapon("Rusty Sword", 12, 5);
	private static Armor leatherArmor = new Armor("Leather Armor", 4, 10);
	private static Armor armorScraps = new Armor("Armor Scraps", 2, 10);
	private static Armor rustyIronArmor = new Armor("Rusty Iron Armor", 6, 15);
	private static Armor shinyIronArmor = new Armor("Shiny Iron Armor", 10, 15);
	private static Potion HPUltraPotion = new Potion("Ultra HP Potion", 20, 1);
	private static Potion HPpotion = new Potion("HP Potion", 10, 1);
	private static Potion staminaPotion = new Potion("Stamina Potion", 3, 1);
	private static Potion ultraStaminaPotion = new Potion("Ultra Stamina Potion", 6, 1);
	
	public Potion getHPUltraPotion() {
		return HPUltraPotion;
	}
	public Potion getUltraStaminaPotion() {
		return ultraStaminaPotion;
	}
	public Armor getArmorScraps() {
		return armorScraps;
	}
	public Armor getRustyIronArmor() {
		return rustyIronArmor;
	}
	public Armor getShinyIronArmor() {
		return shinyIronArmor;
	}
	public Potion getStaminaPotion() {
		return staminaPotion;
	}
	public Potion getHPPotion() {
		return HPpotion;
	}
	public Armor getLeatherArmor()
	{
		return leatherArmor;
	}
	public Weapon getRustySword() {
		return rustySword;
	}
	public Weapon getWoodenSword()
	{
		return woodenSword;
	}
	
	public Weapon getIronSword()
	{
		return ironSword;
	}
	public Weapon getSilverSword()
	{
		return silverSword;
	}
	public Weapon getFlamingSword()
	{
		return flamingSword;
	}
	public Item getEmpty()
	{
		return Empty;
	}
	public Item[] getInvList()
	{
		return this.invList;
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
			else if (this.invList[anIndex].getItemType() == "Potion") {
				if (equippedList[3] == null) {
					equippedList[3] = this.invList[anIndex];
				}
				else {
					equippedList[4] = this.invList[anIndex];
				}
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
			equippedList[anIndex] = null;
		}
		setEquippedList(equippedList);
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
		if (anInv.invList[anInv.invElement] == Empty)
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
		for(int aSlot = 0; aSlot < invList.length; aSlot++) {
			if(this.invList[aSlot] == anItem) {
				this.invElement--;
				this.invList[aSlot]=Empty;
				break;
			}
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
				else if(this.invList[i].getItemType() == "Potion") {
					System.out.println(this.invList[i].getName() + " |HP: " + this.invList[i].getPotionHP()+" Duribililty: "
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