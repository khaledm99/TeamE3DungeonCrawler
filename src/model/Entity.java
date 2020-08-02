package model;

/**
 * Classname: Entity
 * 
 * Version: 0
 * 
 * Author: William Ho
 * 
 * 	Description: Creates an entity class to hold various variables. The parent class of Player and Enemy.
 *
 */

public class Entity {
	
	private int hp;
	private int xcoord;
	private int ycoord;
	private String name;
	private String type;
	private int level;
//	private Inventory inventory = new Inventory();
	
	// Getter method for hp
	public int getHp() {
		return hp;
	}

	// Setter method for hp
	public void setHp(int hp) {
		this.hp = hp;
	}

	// Getter method for xcoord
	public int getXcoord() {
		return xcoord;
	}

	// Setter method for xcoord
	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}

	// Getter method for ycoord
	public int getYcoord() {
		return ycoord;
	}

	// Setter method for ycoord
	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for type
	public String getType() {
		return type;
	}

	// Setter method for type
	public void setType(String type) {
		this.type = type;
	}

	// Getter method for level
	public int getLevel() {
		return level;
	}

	// Setter method for level
	public void setLevel(int level) {
		this.level = level;
	}
}
