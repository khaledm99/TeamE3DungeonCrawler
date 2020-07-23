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
	private int givesXP;
	private int givesCoin;

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

	// Setter method for givesCoin
	public void setGivesCoin(int givesCoin) {
		this.givesCoin = givesCoin;
	}
}
