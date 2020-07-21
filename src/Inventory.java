//import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
	
	private String name = "Unnamed Inv";	
	private Item[] invList;
	private int invElement = 0;
	private int invSpace = 20;
	
	
	//The following are various items to be picked up in-game
	private static Item Empty = new Item();
	private static Item woodenSword = new Item("Wooden Sword",1,10);
	private static Item ironSword = new Item("Iron Sword",5,20);
	private static Item silverSword = new Item("Silver Sword",10,15);
	private static Item flamingSword = new Item("Flaming Sword", 20, 30);
	private Item[] weaponsList = {woodenSword, ironSword, silverSword, flamingSword};

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
		weaponsList = toCopy.weaponsList;
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
	public Item[] getWeaponsList()
	{
		return weaponsList;
	}
	
	public String getInvName()
	{
		return this.name;
	}
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
		//Output for p1 Inventory
		for(int i = 0; i < p1.invList.length; i++)
		{
			if (p1.invList[i] == Empty)
			{
				spaceLeft++;
			}
		}
		System.out.println("--- " + p1.getInvName() + "'s Inventory ---");
		for(int i = 0; i< p1.invList.length;i++)
		{
			if (p1.invList[i].getName() != "Empty")
			{
				System.out.println("** " + p1.invList[i].getName() + " |Damage: " + p1.invList[i].getDamage()+" Duribililty: "
			+ p1.invList[i].getDuribility() +"| In Inventory slot "+ i + " **");
			}
		}
		System.out.println("Inventory Slots Remaining: " + (spaceLeft));
		//end of p1 Inventory
		
		//start of chest Inventory
		spaceLeft = 0;
		for(int i = 0; i < chest.invList.length; i++)
		{
			if (chest.invList[i] == Empty)
			{
				spaceLeft++;
			}
		}
		System.out.println("--- " + chest.getInvName() + "'s Inventory ---");

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
	
	}
	*/


