
public class GameStats {
	
	//Player stats
	private double playerXP = 0;
	
	private int playerHealth = 100;
	
	private int playerCoins = 0;
	
	//Enemy stats
	
	private int goblinEnemy1Health = 100;
	
	private int goblinEnemy2Health = 100;
	
	private int goblinEnemy3Health = 100;
	
	// Player getters and setters
	
	public double getPlayerXP() {
		return this.playerXP;
	}
	
	public void setPlayerXP(double playerXP) {
		this.playerXP = playerXP;
	}

	public int getPlayerHealth() {
		return this.playerHealth;
	}

	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}
	
	public int getPlayerCoins() {
		return this.playerCoins;
	}

	public void setPlayerCoins(int playerCoins) {
		this.playerCoins = playerCoins;
	}


	

	// Enemy getters and setters
	
	public int getGoblinEnemy1Health() {
		return this.goblinEnemy1Health;
	}

	public void setGoblinEnemy1Health(int goblinEnemy1Health) {
		this.goblinEnemy1Health = goblinEnemy1Health;
	}

	public int getGoblinEnemy2Health() {
		return this.goblinEnemy2Health;
	}

	public void setGoblinEnemy2Health(int goblinEnemy2Health) {
		this.goblinEnemy2Health = goblinEnemy2Health;
	}

	public int getGoblinEnemy3Health() {
		return this.goblinEnemy3Health;
	}

	public void setGoblinEnemy3Health(int goblinEnemy3Health) {
		this.goblinEnemy3Health = goblinEnemy3Health;
	}

		
}
