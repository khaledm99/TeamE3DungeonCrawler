package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import model.Player;
import model.Userinterface;

/**
 * Classname: UserInterfaceController
 *
 * Version: 0
 * 
 * Author: Homing Wat
 * 
 * Description:	This class functions as the userinterface GUI controller. As inputs it takes the current players coins,
 * 				health, xp, killcount and level from the 'Player' class and produces a visual representation
 * 				of the stats and current progress in the game at current point of time.
 * 				
 * 				NOTE: at this time the stats does not update in current game time due to refresh issues (this will be addressed in the
 * 				final iteration)  
 * 
 */

public class UserInterfaceController extends GameController {
	
	private String currentPlayerId; 
	
	private Player currentPlayer;
	
	private int currentPlayerCoins;
	
	private int currentPlayerHealth;
	
	private double currentPlayerXP;
	
	private int currentPlayerKillCount;
	
	private int currentPlayerLevel;
	
	private Userinterface gameUI;
	
	private String healthBar;
	
	//Bindings
	IntegerProperty coins = new SimpleIntegerProperty(this.currentPlayerCoins);
	IntegerProperty health = new SimpleIntegerProperty(this.currentPlayerHealth);
	IntegerProperty killCount = new SimpleIntegerProperty(this.currentPlayerKillCount);
	IntegerProperty playerLvl = new SimpleIntegerProperty(this.currentPlayerLevel);
	DoubleProperty xpLabel = new SimpleDoubleProperty(currentPlayerXP);
	
	
	
    @FXML
    private Label healthBarLabel;

    @FXML
    private Label playerKillcount;

    @FXML
    private Label playerCoins;

    @FXML
    private Label playerHealth;

    @FXML
    private Label killCountLabel;

    @FXML
    private Label playerXPLabel;

    @FXML
    private Label playerNameLabel;

    @FXML
    private ProgressBar toggleXP;

    @FXML
    private AnchorPane statsWindow;

    @FXML
    private Label playerLvlLabel;

    @FXML
    private Label playerXP;

    @FXML
    private Label PlayerLvl;

    @FXML
    private Label playerCoinsLabel;

    @FXML
    private Label playerID;

    @FXML
    void toggleONProgress(ActionEvent event) {

    }

    @FXML
    void toggleOFFProgress(ActionEvent event) {

    }
    
	@FXML 
	void initialize() {
		this.currentPlayerId = getPlayer().getName();
		playerNameLabel.setText(this.currentPlayerId);
		killCountLabel.setText(Integer.toString(this.currentPlayerKillCount));
		playerCoinsLabel.setText(Integer.toString(this.currentPlayerCoins));
		playerLvlLabel.setText(Integer.toString(this.currentPlayerLevel));
		healthBarLabel.setText(Integer.toString(this.currentPlayerHealth));
		playerXPLabel.setText(Double.toString(this.currentPlayerXP));
		 
	}
    
	
	/**
	 * replaceHealthBarCharacters method. This method takes the String array healthBarArray this take healtbar String generated
	 * by the Userinterface class and replaces the '=' characters to '<' which resembles hearts in font our game uses
	 * @param healthBarString 
	 * @return heartHealthBar
	 * 
	 */
	private String replaceHealthBarCharacters (String healthBarString) {
		
		char[] currentHealthBar = healthBarString.toCharArray();
		
		for(int i = 0; i < currentHealthBar.length; i++) {
			if (currentHealthBar[i] == '=') {
				currentHealthBar[i] = '<';
			}
				
		}
		
		String heartHealthBar = String.valueOf(currentHealthBar);
		
		return heartHealthBar;	
		
	}
	
	
	/**
	 * uiInitializer method. This method takes the player stats variables and assigns them to instance variables of this 
	 * class. It is the instance variables which are displayed on the labels.
	 * @param currentPlayer
	 */
	public void uiInitializer(Player currentPlayer) {

			this.currentPlayerCoins = currentPlayer.getCoins();
			this.currentPlayerKillCount = currentPlayer.getKillCount();
			this.currentPlayerXP = currentPlayer.getXp();
			this.currentPlayerHealth = currentPlayer.getHp();
			this.currentPlayerLevel = currentPlayer.getLevel();
			this.currentPlayer = currentPlayer;
			this.gameUI = new Userinterface(currentPlayer);
			this.healthBar = this.gameUI.healthBarStringCreator();
	
	    }
	
	
	/**
	 * refresh method. This method is called upon when updating the player stats. For the next iteration we will be implementing
	 * this method more actively in order to update the players stats in real time.
	 */
	@Override
	public void refresh() {
		
		// TODO Auto-generated method stub
		
		uiInitializer(getPlayer());
		/*
		//Where to bind property bindings?
		playerNameLabel.setText(this.currentPlayerId);
		killCountLabel.textProperty().bind(killCount.asString());
		playerCoinsLabel.textProperty().bind(coins.asString());
		playerLvlLabel.textProperty().bind(playerLvl.asString());
		playerXPLabel.textProperty().bind(xpLabel.asString());
		healthBarLabel.setText(replaceHealthBarCharacters(this.healthBar));
		*/
	}

}
