package model;

import java.util.Random;
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
	private int damage;
	private int difficulty;
	private Item dropItem;
	private int combatSprite;

	/**
	 * Enemy Constructor
	 * @param xcoord: initial x-coordinate
	 * @param ycoord: initial y-coordinate
	 * @param name: Enemy name
	 */
	public Enemy(int xcoord, int ycoord, int mapLevel, String name, int damage, int difficulty, Item dropItem) {
		if (difficulty == 0) {
			this.setHp(30);
		} else if (difficulty == 1) {
			this.setHp(60);
		} else if (difficulty == 2) {
			this.setHp(100);
		}
		this.setMapLevel(mapLevel);
		this.setDamage(damage);
		this.setStamina(20);
		this.setXcoord(xcoord);
		this.setYcoord(ycoord);
		this.setName(name);
		this.setType("enemy");
		this.setLevel(1);
		this.isDead = false;
		this.givesXP = 5;
		this.givesCoin = 5;
		this.setDifficulty(difficulty);
		this.setcombatSprite(difficulty);
		this.setDropItem(dropItem);
	}
	
	public static Enemy chooseEnemy(Enemy[] enemies, Map map) {
		for (int i = 0; i < enemies.length; i++) {
			if (enemies[i].getMapLevel() == map.getLevel()) {
				return enemies[i];
			}
		}
		return enemies[0];
	}
	
	//Getter for combatSprite
	public int getcombatSprite() {
		return combatSprite;
	}
	
	//Setter for combatSprite
	public void setcombatSprite(int sprite) {
		this.combatSprite = sprite;
	}
	
	//Getter for dropItem
	public Item getDropItem() {
		return dropItem;
	}
	
	//Setter for dropItem
	public void setDropItem(Item item) {
		this.dropItem = item;
	}
	
	// Getter for difficulty
	public int getDifficulty() {
		return difficulty;
	}
	
	//Setter for difficulty
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	// Setter method for damage
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	//Getter method for damage
	public int getDamage() {
		return damage;
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
	
	// This method is responsible for the A.I. during combat
	public int combatMoveSet(int remainingStamina, int playerStamina, int difficulty) {
		Random rand = new Random();
		if (difficulty == 0) {
			if (remainingStamina / this.getStamina() <= 0.6) {
				return 0;
			} else {
				return rand.nextInt(remainingStamina + 1);
			}
		}
		if (difficulty == 1) {
			if (playerStamina > remainingStamina ) {
				if ((playerStamina - remainingStamina) <= 10) {
					return remainingStamina;
				} else if (playerStamina - remainingStamina > 10)
					return 0;
			} else if (playerStamina < remainingStamina) {
				if (playerStamina < 5) {
					return 5;
				} else {
					return rand.nextInt(remainingStamina + 1);
				}
			}
		}
		if (difficulty == 2) {
			if (playerStamina - remainingStamina > 10) {
				return -1;
			}
			if (playerStamina > remainingStamina ) {
				if ((playerStamina - remainingStamina) <= 10) {
					return remainingStamina;
				} else if (playerStamina - remainingStamina > 10)
					return 0;
			} else if (playerStamina < remainingStamina) {
				if (playerStamina < 5) {
					return 5;
				} else if (remainingStamina - playerStamina > 10){
					return playerStamina + 1;
				} else {
					return remainingStamina;
				}
					
			}
		}
		
		return 0;
	}
}
