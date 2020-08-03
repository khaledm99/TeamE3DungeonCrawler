package model;
//import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
	
	private String name = "Unnamed Inv";	
	private Item[] invList;
	private int invElement = 0;
	private int invSpace = 20;
	private Item[] equippedList = new Item[5];
	

	
	//The following are various items to be picked up in-game
	private static Item Empty = new Item();
	private static Weapon woodenSword = new Weapon("Wooden Sword",1,10);
	private static Weapon ironSword = new Weapon("Iron Sword",5,20);
	private static Weapon silverSword = new Weapon("Silver Sword",10,15);
	private static Weapon flamingSword = new Weapon("Flaming Sword", 20, 30);
	private static Armor leatherArmor = new Armor("Leather Armor", 10, 10);
	private static Potion HPpotion = new Potion("HP Potion", 10, 1);

	public Inventory(String name)
	{
		this.name = name;
		invList = new Item[invSpace];
		Arrays.fill(invList, Empty);
		if (name == "p1") 
		{
			invList[invElement++]=woodenSword;
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
		
	public void dropFromInv(Inventory anInv, int aSlot)
	{
		if(anInv.invList[aSlot] != Empty)
		{
			anInv.invElement--;
			anInv.invList[aSlot]=Empty;

		}
		else 
		{
			System.out.println("Slot " + aSlot + " already empty");
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
	
	public Potion getHPPotion() {
		return HPpotion;
	}
	public Armor getLeatherArmor()
	{
		return leatherArmor;
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
			{
				System.out.println("** " + this.invList[i].getName() + " |Damage: " + this.invList[i].getDamage()+" Duribililty: "
			+ this.invList[i].getDuribility() +"| In Inventory slot "+ i + " **");
			}
		}
		System.out.println("------------------------------------------------------");

	//	System.out.println("Inventory Slots Remaining: " + (spaceLeft));
	}
/*
	public static void main(String[] args)
	{
		
		Inventory p1 = new Inventory("p1");
		Inventory chest = new Inventory("chest");
		chest.addToInv(chest,flamingSword);
		p1.addToInv(p1,flamingSword);
		p1.addToInv(p1,silverSword);
		p1.addToInv(p1,ironSword);	
		chest.giveToInv(p1, ironSword);
		p1.dropFromInv(p1,1);
		
		int spaceLeft = 0;
		
		//start of chest Inventory
		spaceLeft = 0;
		for(int i = 0; i < chest.invList.length; i++)
		{
			if (chest.invList[i] == Empty)
			{
				spaceLeft++;
			}
		}
		System.out.println("--- " + chest.getInvName() + "'s Inventory ---"+"/n");

		for(int i = 0; i< chest.invList.length;i++)
		{
			if (chest.invList[i].getName() != "Empty")
			{
				System.out.println("** " + chest.invList[i].getName() + " |Damage: " + chest.invList[i].getDamage()+" Duribililty: "
			+ chest.invList[i].getDuribility() +"| In Inventory slot "+ i + " **");
			}
		}
		System.out.println("Inventory Slots Remaining: " + (spaceLeft));
	}
		//end of chest inventory
	*/
	}
	


