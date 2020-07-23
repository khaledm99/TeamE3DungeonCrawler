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
}
