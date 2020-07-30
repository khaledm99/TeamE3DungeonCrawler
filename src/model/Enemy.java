package model;
import java.util.ArrayList;

public class Enemy extends Entity {
	
	private boolean isDead;
	private int givesXP;
	private int givesCoin;

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public int getGivesXP() {
		return givesXP;
	}

	public void setGivesXP(int givesXP) {
		this.givesXP = givesXP;
	}

	public int getGivesCoin() {
		return givesCoin;
	}

	public void setGivesCoin(int givesCoin) {
		this.givesCoin = givesCoin;
	}
	
	

}
