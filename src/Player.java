
public class Player extends Entity {

	private int xp;
	private String combatStatus;
	
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

}
