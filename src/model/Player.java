package model;

/**
 * Classname: Player
 * 
 * Version: 0
 * 
 * Author: William Ho
 *  
 *  Description: Creates a Player class that is inherited from the entity class. Introduced xp, coins and killCount that is specific to the Player class. 
 *  			 Also introduced movement methods that is used to manipulate x and y coordinates.
 *
 */

public class Player extends Entity {

	private int xp;
	private int coins;
	private int killCount;
	private Boolean isGUI = false;

	/**
	 * Player constructor.
	 * @param xcoord: initial x-coordinate
	 * @param ycoord: initial y-coordinate
	 * @param name: player name
	 */
	public Player(int xcoord, int ycoord, String name, Boolean ui) {
		this.setHp(20);
		this.setStamina(20);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.setName(name);
		this.setType("player");
		this.setLevel(1);
		this.coins = 5;
		this.xp = 0;
		this.killCount = 0;
		this.isGUI = ui;
	}
	
	// Getter method for xp
	public int getXp() {
		return xp;
	}

	// Setter method for xp
	public void setXp(int xp) {
		this.xp = xp;
	}
	
	// Method for upwards movement on the map
	public void moveUp(int amount) {
		setYcoord(getYcoord() - amount);
	}
	
	// Method for downwards movement on the map
	public void moveDown(int amount) {
		setYcoord(getYcoord() + amount);
	}
	
	// Method for left movement on the map 
	public void moveLeft(int amount) {
		setXcoord(getXcoord() - amount);
	}
	
	// Method for right movement on the map
	public void moveRight(int amount) {
		setXcoord(getXcoord() + amount);
	}

	// Getter method for killcount
	public int getKillCount() {
		return killCount;
	}

	// Setter method for killcount
	public void setKillCount(int killCount) {
		this.killCount = killCount;
	}

	// Getter method for coins
	public int getCoins() {
		return coins;
	}

	// Setter method for coins
	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	public Boolean getUI() {
		return isGUI;
	}
	
	public void setUI(Boolean value) {
		this.isGUI = value;
	}
	
	
}
