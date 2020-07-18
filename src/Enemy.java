import java.util.ArrayList;

public class Enemy extends Entity {
	
	private boolean isDead;
	private int givesXP;
	private ArrayList<Integer> moveSet = new ArrayList<Integer>();

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

	public ArrayList<Integer> getMoveSet() {
		return moveSet;
	}

	public void setMoveSet(ArrayList<Integer> moveSet) {
		this.moveSet = moveSet;
	}
	
	

}
