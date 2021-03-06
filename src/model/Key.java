package model;

public class Key extends Item {

	public Key(String name, int keyValue, int duribility, String imagePath) {
		this.name = name;
		this.keyValue = keyValue;
		this.duribility = 1;
		this.itemType = "Key";
		this.imagePath = imagePath;
	}
	
	public int getKeyValue() {
		return super.keyValue;
	}
	
	public void setKeyValue(int keyValue) {
		super.keyValue = keyValue;
	}

}
