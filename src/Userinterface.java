
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classname: Userinterface
 *
 * Version: 0
 * 
 * Author: Homing Wat
 * 
 * Description:	This class functions as the userinterface. As inputs it takes the current players coins,
 * 				health, xp, killcount and level from the 'Player' class and produces a visual representation
 * 				of the stats and current progress in the game at current point of time.  
 * 
 */

public class Userinterface {
	
	
		
	private int currentPlayerCoins;
	
	private int currentPlayerHealth;
	
	private double currentPlayerXP;
	
	private int currentPlayerKillCount;
	
	private int currentPlayerLevel;
	
	private String[] healthBarArray = new String [12];

	/**
	 * Userinterface Constructor. Takes the following parameters :
	 * 
	 * @param currentPlayer: The 'Player' object created and used within the maingame loop
	 * 
	 */
	public Userinterface(Player currentPlayer) {
		this.currentPlayerCoins = currentPlayer.getCoins();
		this.currentPlayerHealth = currentPlayer.getHp();
		this.currentPlayerXP = currentPlayer.getXp();
		this.currentPlayerKillCount = currentPlayer.getKillCount();
		this.currentPlayerLevel = currentPlayer.getLevel();
	}


	/**
	 * healthBarArrayFiller method. This method takes the String array healthBarArray together with the int nrOfHealthBars
	 * and fills the healthbarArray with the corresponding number of healthbars of the players health. Then, it returns the filled
	 * String array.
	 * @param healthBarArray 
	 * @param nrOfHealthBars
	 * @return healthBarArray
	 * 
	 */
	private String[] healthBarArrayFiller (String[] healthBarArray, int nrOfHealthBars) {
	
			int size = healthBarArray.length;
			
			int count = 0;
			
			//Loop to fill the healthBarArray
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
	
	/**
	 * healthBarStringCreator method. This method has no arguments. The method converts the String array healthBarArray into
	 * a string (i.e. it combines all elements in the string array into one string). Additionally, it sets the nrOfHealthbars based of the
	 * current player health instance variable.  
	 * @return healthBarString
	 */
	private String healthBarStringCreator () {
		
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
	
	
	/**
	 * playerStepPrintOut method. Prints the Userinterface and summarizes the stats of the players obtained from the
	 * player class. 
	 */
	public void playerStepPrintOut(){
		
		//Clock
		Date dt = new Date();
	    SimpleDateFormat dateFormat;
	    dateFormat = new SimpleDateFormat("kk:mm:ss");
	    
	    //Healthbar 
		String healthBar = healthBarStringCreator();
		
		System.out.println("---------------------------");
		System.out.println("TIME: " +dateFormat.format(dt));
		System.out.println("---------------------------");
		System.out.println("Player Current Status: ");
		System.out.println("---------------------------");
		System.out.println("Player Level: " + currentPlayerLevel);
		System.out.println("Player Healthbar: " + healthBar + " currently @ "  + currentPlayerHealth + "%");
		System.out.println("Player XP: " + currentPlayerXP);
		System.out.println("Player Coins: " + currentPlayerCoins + " Coins");
		System.out.println("Player Killcount: " + currentPlayerKillCount + " Kills");
		System.out.println("---------------------------");
		
	}

	/**
	 * clearConsole method. This method clears the console by printing empty lines.
	 */
	public void clearConsole() {
		int consoleLines = 0;
		while(consoleLines < 51) {
			System.out.println("");
			consoleLines++;
		}

	}
	
	/**
	 * slowPrint method. This method prints the introduction message of the game in delayed format
	 * it does this by taking String s and printing its characters one by one delayed.
	 * @param s
	 */
	public void slowPrint(String s) {
		for (int i = 0; i < s.length(); i++){
		    System.out.print(s.charAt(i));  
		    try {
				Thread.sleep(40); //default 40
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
	}

	
	
	

}
