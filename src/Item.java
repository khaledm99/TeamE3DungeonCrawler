
public class Item {
	private String name;
	private int damage;
	private int duribility;
	
	public Item(String name, int damage, int duribility) 
	{
		this.name = name;
		this.damage = damage;
		this.duribility = duribility;
	}
	
	public Item ()
	{
		this.name = "Empty";
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
	
	
}
	
	
	