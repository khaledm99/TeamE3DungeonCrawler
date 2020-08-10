package application;

import model.Combat;
import model.Enemy;
import model.Entity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class CombatController extends GameController {
	
	private int playersRemainingHP;
	private int enemysRemainingHP;
	private int playersRemainingStamina;
	private int enemysRemainingStamina;
	private int hpPotionAmount;
	private int stamPotionAmount;
	private int staminaBuff;
	private int staminaDuration;
	private int healPotion;
	private int stamPotion;
	private int armourDefence;
	private int weaponDamage;
	private int enemyDamage;
	private String enemyName;
	private int difficulty;

	private int amountOfAtks;
	private int amountOfDfns;
	
    @FXML
    private Slider stamSlider;

    @FXML
    private ProgressBar enemyStam;

    @FXML
    private Button healButton;

    @FXML
    private ProgressBar playerStam;

    @FXML
    private Button playerMoveButton;

    @FXML
    private Label combatText;

    @FXML
    private ProgressBar playerHP;

    @FXML
    private Button fleeButton;
    

    @FXML
    private ProgressBar enemyHP;

    @FXML
    private Button staminaButton;
    
    @FXML
    void initialize() {
    	amountOfAtks = 0;
    	amountOfDfns = 0;
    	playersRemainingHP = getPlayer().getHp();
    	enemysRemainingHP = getEnemy().getHp();
    	playersRemainingStamina = getPlayer().getStamina();
    	enemysRemainingStamina = getEnemy().getStamina();
    	hpPotionAmount = 1;
    	stamPotionAmount = 1;
    	staminaBuff = 0;
    	healPotion = getEquippedList()[3].getPotionHP();
    	stamPotion = getEquippedList()[4].getPotionHP();
    	
    	armourDefence = getEquippedList()[2].getArmorHP();
    	if (getEquippedList()[1].getItemType() == "Empty") {
    		//System.out.println("One weapon equipped");
    		weaponDamage = getEquippedList()[0].getDamage();
    	}	
    	else {
    		weaponDamage = getEquippedList()[0].getDamage() + getEquippedList()[1].getDamage();
    	}
    	/*
    	healPotion = 10;
    	stamPotion = 3;
    	armourDefence = 2;
    	weaponDamage = 5;
    	*/
    	enemyDamage = getEnemy().getDamage();
    	enemyName = getEnemy().getName();
    	difficulty = getEnemy().getDifficulty();
    	
    	playerHP.setProgress(playersRemainingHP / 20.0);
    	enemyHP.setProgress(enemysRemainingHP / 20.0);
    	playerStam.setProgress(playersRemainingStamina / 20.0);
    	enemyStam.setProgress(enemysRemainingStamina / 20.0);
    	if (armourDefence > getEnemy().getDamage()) {
    		armourDefence = getEnemy().getDamage();
    	}
    }
    
    @FXML
    public void healPotion(ActionEvent event) {
    	if (hpPotionAmount > 0) {
    		playersRemainingHP += healPotion;
    		enemysRemainingStamina += 5;
			hpPotionAmount = 0;
			if (playersRemainingHP > 20) {
				playersRemainingHP = 20;
			}
			update();
			combatText.setText("You hastily quaff your potion, healing " + healPotion + " HP!\n\nMake your next move...");
    	} else {
    		combatText.setText("You have no more potions of this type!");
    	}
    	
    }
   
    @FXML
    public void staminaPotion(ActionEvent event) {
    	 if (stamPotionAmount > 0) {
    		combatText.setText("You back off to hastily quaff your potion, giving yourself " + stamPotion + " extra stamina regen!\n\nMake your next move...");
    		staminaBuff = stamPotion;
    		staminaDuration = 5;
    		enemysRemainingStamina += 5;
    		stamPotionAmount = 0;
    		update();
		
		} else {
			combatText.setText("You have no more potions of this type!");
		}
		
    }
    
    @FXML
    public void flee(ActionEvent event) {
    	refresh();
    	Stage stage = (Stage) fleeButton.getScene().getWindow();
    	stage.close();
    }
    
    @FXML
    public void playerMoveButton(ActionEvent event){
    	double playerMove = stamSlider.getValue();
    	int enemyMove = getEnemy().combatMoveSet(enemysRemainingStamina, playersRemainingStamina, getEnemy().getDifficulty());
    	
    	if (playerMove > playersRemainingStamina) {
			playerMove = playersRemainingStamina;
		}
    	if (enemyMove == -1) {
    		combatText.setText("The creature lets out a chilling howl that drains your energy and saps your will to live!");
    		playersRemainingStamina = 0;
    		enemysRemainingStamina = getEnemy().getStamina();
    		playersRemainingHP -= 7;
    		
    	} else if (playerMove == 0) {
			if (enemyMove == 0) {
				combatText.setText("You and the " + enemyName + " both take a defensive position, eyeing each other carefully..." + "\n");
				playersRemainingStamina += 6 + staminaBuff;
				enemysRemainingStamina += 6;
			} else {
				amountOfDfns++;
				combatText.setText("The " + enemyName + " launches into an attack, but you take a defensive position, deflecting most of the blow!" + "\n");
				playersRemainingHP -=1;
				playersRemainingStamina += 6 + staminaBuff;
				enemysRemainingStamina -= enemyMove / 2;
			}
		} else {
			
			if (playerMove == enemyMove) {
				amountOfDfns++;
				amountOfAtks++;
				combatText.setText("You both attack with equal force, matching the other's strength and swordplay. After a harsh melee, you both retreat to reset your posture");
				playersRemainingHP -= 1;
				enemysRemainingHP-= 1;
				playersRemainingStamina -= (playerMove / 2);
				playersRemainingStamina += staminaBuff;
				enemysRemainingStamina -= enemyMove / 2;
				
			} else if (playerMove > enemyMove) {
				if (enemyMove == 0) {
					amountOfAtks++;
					combatText.setText("You launch into an attack, but the " + enemyName + " takes a defensive position, deflecting most of the blow");
					enemysRemainingHP -=1;
					enemysRemainingStamina += 6;
					playersRemainingStamina -= playerMove / 2;
					playersRemainingStamina += staminaBuff;
				} else if ((playerMove - enemyMove) <= 5) {
					amountOfAtks++;
					combatText.setText("You and the " + enemyName + " swing at each other, weapons clashing with deadly force. The " + enemyName + " is overpowered by your blows and you land a glancing hit!" + "\n");
					enemysRemainingHP -= weaponDamage;
					enemysRemainingStamina -= enemyMove / 2;
					playersRemainingStamina -= playerMove / 2;
					playersRemainingStamina += staminaBuff;
				} else if ((playerMove - enemyMove) > 5){
					amountOfAtks++;
					combatText.setText("The " + enemyName + " moves to swing, but you catch them off guard with a powerful attack and land a devastating blow!" + "\n");
					enemysRemainingHP -= weaponDamage + 3;
					enemysRemainingStamina -= enemyMove / 2;
					playersRemainingStamina -= playerMove / 2;
					playersRemainingStamina += staminaBuff;
				}
			} else if (playerMove < enemyMove) {
				if ((enemyMove - playerMove) <=5) {
					amountOfDfns++;
					amountOfAtks++;
					combatText.setText("You and the " + enemyName + " swing at each other, weapons clashing with deadly force. The " + enemyName + " overpowers you and lands a glancing hit!" + "\n");
					playersRemainingHP -= (enemyDamage - armourDefence);
					enemysRemainingStamina -= enemyMove / 2;
					playersRemainingStamina -= playerMove / 2;
					playersRemainingStamina += staminaBuff;
				} else if ((enemyMove - playerMove) > 5) {
					amountOfDfns++;
					combatText.setText("You make an attack, but the " + enemyName + " catches you off guard with a powerful attack and lands a devastating blow!" + "\n");
					playersRemainingHP -= (enemyDamage + 3 - armourDefence);
					enemysRemainingStamina -= enemyMove / 2;
					playersRemainingStamina -= playerMove / 2;
					playersRemainingStamina += staminaBuff;
				}
			}
		}
		update();
		
	}
    

    @FXML
    public void update() {
    	stamSlider.setValue(0);
    	if (playersRemainingStamina > 20) {
    		playersRemainingStamina = 20;
    	}
    	stamSlider.setMax(playersRemainingStamina);
    	if (enemysRemainingStamina > 20) {
    		enemysRemainingStamina = 20;
    	}
    	playerHP.setProgress(playersRemainingHP / 20.0);
    	enemyHP.setProgress(enemysRemainingHP / 20.0);
    	playerStam.setProgress(playersRemainingStamina / 20.0);
    	enemyStam.setProgress(enemysRemainingStamina / 20.0);
    	if (staminaDuration > 0) {
    		staminaDuration -= 1;
    	}
    	if (staminaDuration == 0) {
    		staminaBuff = 0;
    	}
    	if (playersRemainingHP < 1) {
    		combatText.setText("You were slain by the enemy!");
    		refresh();
    	}
    	if (enemysRemainingHP < 1) {
    		combatText.setText("You have vanquished the enemy");
    		refresh();
    	}
    	
    }
 
	@Override
	public void refresh() {
		System.out.println("In Combat refresh");
		getPlayer().setHp(playersRemainingHP);
		getEnemy().setHp(enemysRemainingHP);
		Stage stage = (Stage) fleeButton.getScene().getWindow();
		stage.close();
		
		getEquippedList()[0].setDuribility(getEquippedList()[0].getDuribility() - amountOfAtks);	
		getEquippedList()[1].setDuribility(getEquippedList()[1].getDuribility() - amountOfAtks);			 
		getEquippedList()[2].setDuribility(getEquippedList()[2].getDuribility() - amountOfDfns);
		if (hpPotionAmount == 0) {
			getInv().dropFromInv(getEquippedList()[3]);
		}
		if (stamPotionAmount == 0) {
			getInv().dropFromInv(getEquippedList()[4]);
		}
		if (enemysRemainingHP < 1) {
			getEnemy().setDead(true);
			getPlayer().setKillCount(getPlayer().getKillCount() + 1);
			getPlayer().setCoins(getPlayer().getCoins() + application.GuiMain.getEnemy().getGivesCoin());
			getPlayer().setXp(getPlayer().getXp() + application.GuiMain.getEnemy().getGivesXP());
			getInv().addToInv(getInv(), getEnemy().getDropItem());
	    	stage.close();		
	    	}
		
}

}