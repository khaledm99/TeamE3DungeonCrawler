package model;

public class Key extends Item {

	public Key(String name, int keyValue, int duribility) {
		this.name = name;
		this.keyValue = keyValue;
		this.duribility = 1;
		this.itemType = "Key";
	}
	
	public int getKeyValue() {
		return super.keyValue;
	}
	
	public void setKeyValue(int keyValue) {
		super.keyValue = keyValue;
	}

}
