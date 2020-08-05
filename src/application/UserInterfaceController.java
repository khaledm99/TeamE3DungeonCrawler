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
	
		playerNameLabel.setText(this.currentPlayerId);
		killCountLabel.setText(Integer.toString(this.currentPlayerKillCount));
		playerCoinsLabel.setText(Integer.toString(this.currentPlayerCoins));
		playerLvlLabel.setText(Integer.toString(this.currentPlayerLevel));
		//healthBarLabel.setText(this.healthBar);
		playerXPLabel.setText(Double.toString(this.currentPlayerXP));
		 
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
	

	@Override
	public void refresh() {
		
		// TODO Auto-generated method stub
		
		uiInitializer(getPlayer());
		
		//Where to bind property bindings?
		playerNameLabel.setText(this.currentPlayerId);
		killCountLabel.textProperty().bind(killCount.asString());
		playerCoinsLabel.textProperty().bind(coins.asString());
		playerLvlLabel.textProperty().bind(playerLvl.asString());
		playerXPLabel.textProperty().bind(xpLabel.asString());
		healthBarLabel.setText(replaceHealthBarCharacters(this.healthBar));
	}

}
