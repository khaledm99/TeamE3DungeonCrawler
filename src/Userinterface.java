
import java.text.SimpleDateFormat;
import java.util.Date;

public class Userinterface {
	
	//
	Entity currentEntity = new Entity();
	Player currentPlayer = new Player();
	
	
	private int currentPlayerCoins = currentPlayer.getCoins();
	
	private int currentPlayerHealth = currentPlayer.getHp();
	
	private double currentPlayerXP = currentPlayer.getXp();
	
	private int currentPlayerKillCount = currentPlayer.getKillCount();
	
	
	private String[] healthBarArray = new String [12];
	
	private String[][] currentMapRender = { {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
		      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".","#",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
		      {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
};
		
	public String[] healthBarArrayFiller (String[] healthBarArray, int nrOfHealthBars) {
	
			int size = healthBarArray.length;
			
			int count = 0;
			
			for(int index = 0; index < size; index++) {
				
				if(index == 0)
					
					healthBarArray[index]= "[";
				
				else if(index == size-1)
					
					healthBarArray[index]= "]";
				
				else {	
					
					if(count < nrOfHealthBars) {
						
						healthBarArray[index]= "=";
						
						count++;
					}
					
					else
						healthBarArray[index]= " ";
						
				}
			}
			
		return healthBarArray;
		
	}
	
	public String healthBarStringCreator () {
		
		int nrOfHealthBars;
		int size = healthBarArray.length;
		
		if((currentPlayerHealth >= 90) && (currentPlayerHealth <= 99)) {
			
			nrOfHealthBars = 9;
			
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 80) && (currentPlayerHealth <= 89)) {
				
			nrOfHealthBars = 8;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 70) && (currentPlayerHealth <= 79)) {
			
			nrOfHealthBars = 7;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
			
		if((currentPlayerHealth >= 60) && (currentPlayerHealth <= 69)) {
			
			nrOfHealthBars = 6;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 50) && (currentPlayerHealth <= 59)) {
			
			nrOfHealthBars = 5;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 40) && (currentPlayerHealth <= 49)) {
			
			nrOfHealthBars = 4;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 30) && (currentPlayerHealth <= 39)) {
			
			nrOfHealthBars = 3;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 20) && (currentPlayerHealth <= 29)) {
			
			nrOfHealthBars = 2;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		if((currentPlayerHealth >= 0) && (currentPlayerHealth <= 19)) {
			
			nrOfHealthBars = 1;
				
			healthBarArray = healthBarArrayFiller(healthBarArray, nrOfHealthBars);
			
		}
		
		String healthBarString = "";
		
		//Combine all strings in the visualizationArray into one string.
		for (int i=0; i<size; i++ ) {
			healthBarString =  healthBarString + healthBarArray[i];
		}
		
		return healthBarString;
		
	}
				
	public void playerStepPrintOut(){
		
		//Clock
		Date dt = new Date();
	    SimpleDateFormat dateFormat;
	    dateFormat = new SimpleDateFormat("kk:mm:ss");
	
		String healthBar = healthBarStringCreator();
		String border_1= "######################################";
		
		System.out.println(border_1);
		System.out.println("TIME: " +dateFormat.format(dt));
		//System.out.println(border_2);
		//System.out.println(border_3);
		System.out.println("---------------------------");
		System.out.println("Player Current Status: ");
		System.out.println("---------------------------");
		//System.out.println("");
		System.out.println("Player Healthbar: " + healthBar + " currently @ "  + currentPlayerHealth + "%");
		System.out.println("Player XP: " + currentPlayerXP);
		System.out.println("Player Coins: " + currentPlayerCoins + " Coins");
		System.out.println("Player Killcount: " + currentPlayerKillCount + " Kills");
		//System.out.println("");
		System.out.println("---------------------------");
		
	}

	
	//TEST
	public int getCurrentPlayerHealth() {
		return currentPlayerHealth;
	}
	//TEST

	public void setCurrentPlayerHealth(int currentPlayerHealth) {
		this.currentPlayerHealth = currentPlayerHealth;
	}
	
	

}
