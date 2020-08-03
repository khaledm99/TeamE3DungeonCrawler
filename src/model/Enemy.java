package model;

/**
 * 
 * Classname: Enemy
 * 
 * Version: 0
 *
 * Author: William Ho
 * 
 * Descriptiion: Creates an Enemy class that is inherited from the Entity class. Introduced isDead, givesXP, and givesCoin variables that are implemented 
 * 				 when the enemy is killed in the game.
 *
 */

public class Enemy extends Entity {
	
	private boolean isDead;
	private int mapLevel;
	private int givesXP;
	private int givesCoin;

	/**
	 * Enemy Constructor
	 * @param xcoord: initial x-coordinate
	 * @param ycoord: initial y-coordinate
	 * @param name: Enemy name
	 */
	public Enemy(int xcoord, int ycoord, int mapLevel, String name) {
		this.setMapLevel(mapLevel);
		this.setHp(20);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.setName(name);
		this.setType("enemy");
		this.setLevel(1);
		this.isDead = false;
		this.givesXP = 5;
		this.givesCoin = 5;
	}
	// Getter method for isDead
	public boolean isDead() {
		return isDead;
	}

	// Setter method for isDead
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	// Getter method for givesXP
	public int getGivesXP() {
		return givesXP;
	}

	// Setter method for givesXP
	public void setGivesXP(int givesXP) {
		this.givesXP = givesXP;
	}

	// Getter method for givesCoin
	public int getGivesCoin() {
		return givesCoin;
	}
	
	public int getMapLevel() {
		return mapLevel;
	}
	
	public void setMapLevel(int mapLevel) {
		this.mapLevel = mapLevel;
	}
	// Setter method for givesCoin
	public void setGivesCoin(int givesCoin) {
		this.givesCoin = givesCoin;
	}
}
