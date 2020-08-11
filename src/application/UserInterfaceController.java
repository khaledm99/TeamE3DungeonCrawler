package application;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import model.Item;
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
	
	private ScheduledExecutorService executorService;
	
	private String currentPlayerId; 
	
	private Player currentPlayer;
	
	private int currentPlayerCoins;
	
	private int currentPlayerHealth;
	
	private int currentPlayerXP;
	
	private int currentPlayerKillCount;
	
	private int currentPlayerLevel;
	
	private Userinterface gameUI = new Userinterface();
	
	private int counter = 0;
	
	private  String [] weaponsEquipped = new String [2];
	
	
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
    private Label wieldedWeaponLabel;
    
    @FXML
    private ImageView logoImageView;

	@FXML 
	void initialize() {
		
		// Image img = new Image("resource/Bonfire.png");
		// circleLogo.setFill(new ImagePattern(img));
		
		for(int i=0; i < weaponsEquipped.length; i++) {
			
			weaponsEquipped[i] =  getEquippedList()[i].getName();
			
		}
		
		this.gameUI.setPlayer(getPlayer());
		
		initializeScheduler();
		
		this.currentPlayerId = getPlayer().getName();
		
		playerNameLabel.setText(getPlayer().getName());
		
		killCountLabel.setText("* " + Integer.toString(getPlayer().getKillCount()));
		
		playerCoinsLabel.setText("* " + Integer.toString(getPlayer().getCoins()));
		
		playerLvlLabel.setText(Integer.toString(getPlayer().getLevel()));
		
		healthBarLabel.setText(replaceHealthBarCharacters(gameUI.healthBarStringCreator()));
		
		playerXPLabel.setText(Integer.toString(getPlayer().getXp()));
		
		if(!(weaponsEquipped[0] == "Empty"))
			wieldedWeaponLabel.setText(weaponsEquipped[0].toString());
		else {
			wieldedWeaponLabel.setText("No Weapon Selected");
		}
		
		File file = new File("resource/Bonfire.png");
		Image logoImage = new Image(file.toURI().toString());
		logoImageView.setImage(logoImage);
		 
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
			
			if ((currentHealthBar[i] == '[') || (currentHealthBar[i] == ']')) {
				currentHealthBar[i] = ' ';
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
			
	
	    }
	
	/**
	 * initializeScheduler Method. Method which initializes the scheduler used to call stats update method recurrently ingame
	 */
	private void initializeScheduler() {
		executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(this::loadData, 0, 1, TimeUnit.SECONDS);
		 
	}
	
	/**
	 * loadData method. Method which executes the recurrent stats updates
	 */
	private void loadData() {
		
		Platform.runLater(() -> {;
		
		refresh();
		
		});
		
	}
	
	/**
	 * refresh method. This method is called upon when updating the player stats. For the next iteration we will be implementing
	 * this method more actively in order to update the players stats in real time.
	 */
	@Override
	public void refresh() {
		
		//DEBUGGING PURPOSES
		System.out.println("UIupdates :" + counter + "s");
		
		// TODO Auto-generated method stub
		
		for(int i=0; i < weaponsEquipped.length; i++) {
			
			weaponsEquipped[i] =  getEquippedList()[i].getName();
			
		}
		

		
		uiInitializer(getPlayer());
		this.gameUI.setPlayer((getPlayer()));
		getPlayer().setName(StartController.getName());
		
		this.currentPlayerId = getPlayer().getName();
		playerNameLabel.setText(getPlayer().getName());
		killCountLabel.setText("* " + Integer.toString(this.currentPlayerKillCount));
		playerCoinsLabel.setText("* " + Integer.toString(this.currentPlayerCoins));
		playerLvlLabel.setText(Integer.toString(this.currentPlayerLevel));
		healthBarLabel.setText(replaceHealthBarCharacters(gameUI.healthBarStringCreator()));
		playerXPLabel.setText(Integer.toString(this.currentPlayerXP));
		
		if(!(weaponsEquipped[0] == "Empty"))
			wieldedWeaponLabel.setText(weaponsEquipped[0]);
		else {
			wieldedWeaponLabel.setText("No Weapon Selected");
		}
		
		//DEBUGGING PURPOSES
		counter++;
	}

}
