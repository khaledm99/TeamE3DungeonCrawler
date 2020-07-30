package model;

public class Player extends Entity {

	private int xp;
	private String combatStatus;
	private int coins;
	private int killCount;
	
	public void attack() {
		this.combatStatus = "attack";
	}
	
	public void defend() {
		this.combatStatus = "defend";
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
	public void moveUp(int amount) {
		setYcoord(getYcoord() - amount);
	}
	
	public void moveDown(int amount) {
		setYcoord(getYcoord() + amount);
	}
	
	public void moveLeft(int amount) {
		setXcoord(getXcoord() - amount);
	}
	
	public void moveRight(int amount) {
		setXcoord(getXcoord() + amount);
	}

	public int getKillCount() {
		return killCount;
	}

	public void setKillCount(int killCount) {
		this.killCount = killCount;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

}
