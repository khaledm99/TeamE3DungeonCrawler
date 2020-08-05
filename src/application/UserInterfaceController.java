/*
package application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import model.Entity;
import model.Player;
import model.Userinterface;

public class UserInterfaceController extends GameController {


	private String currentPlayerId; 
	
	private Player currentPlayer;
	
	private int currentPlayerCoinsLabel;
	
	private int currentPlayerHealthLabel;
	
	private double currentPlayerXPLabel;
	
	private int currentPlayerKillCountLabel;
	
	private int currentPlayerLevelLabel;
	
	private Userinterface gameUI = new Userinterface(currentPlayer);

	IntegerProperty coins = new SimpleIntegerProperty(this.currentPlayerCoinsLabel);
	IntegerProperty health = new SimpleIntegerProperty(this.currentPlayerHealthLabel);
	IntegerProperty killCount = new SimpleIntegerProperty(this.currentPlayerKillCountLabel);
	IntegerProperty playerLvl = new SimpleIntegerProperty(this.currentPlayerLevelLabel);
	DoubleProperty xpLabel = new SimpleDoubleProperty(currentPlayerXPLabel);
	
	private String healthBar = gameUI.healthBarStringCreator();
	  
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
    
    
    
    public UserInterfaceController(Player gamePlayer, Entity currentEntity) {
		this.currentPlayerCoinsLabel = gamePlayer.getCoins();
		this.currentPlayerKillCountLabel = gamePlayer.getKillCount();
		this.currentPlayerXPLabel = gamePlayer.getXp();
		this.currentPlayerHealthLabel = gamePlayer.getHp();
		this.currentPlayerLevelLabel = gamePlayer.getLevel();
		this.currentPlayer = gamePlayer;
	}
    
    public void setTextLabelPlayerKillcount(int currentKillCount){
    	
    }
    
    
	@FXML 
	void initialize() {
		
		playerNameLabel.setText(this.currentPlayerId);
		killCountLabel.setText(Integer.toString(this.currentPlayerKillCountLabel));
		playerCoinsLabel.setText(Integer.toString(this.currentPlayerCoinsLabel));
		playerLvlLabel.setText(Integer.toString(this.currentPlayerLevelLabel));
		healthBarLabel.setText(replaceHealthBarCharacters(healthBar));
		playerXPLabel.setText(Double.toString(this.currentPlayerXPLabel));
		 
	}
	
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
	
	
	
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
		this.currentPlayer= getPlayer();
		playerNameLabel.setText(this.currentPlayerId);
		killCountLabel.textProperty().bind(killCount.asString());
		playerCoinsLabel.textProperty().bind(coins.asString());
		playerLvlLabel.textProperty().bind(playerLvl.asString());
		playerXPLabel.textProperty().bind(xpLabel.asString());
		
		
		
	
	}
	
	
	
}

*/