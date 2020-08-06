package application;

import model.Combat;
import model.Enemy;
import model.Entity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
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
    	playersRemainingHP = getPlayer().getHp();
    	enemysRemainingHP = application.GuiMain.getEnemy().getHp();
    	playersRemainingStamina = getPlayer().getStamina();
    	enemysRemainingStamina = application.GuiMain.getEnemy().getStamina();
    	hpPotionAmount = 1;
    	stamPotionAmount = 1;
    	staminaBuff = 0;
    	/* healPotion = getEquippedList()[3].getPotionHP();
    	stamPotion = getEquippedList()[4].getPotionHP();
    	armourDefence = getEquippedList()[2].getArmorHP();
    	weaponDamage = getEquippedList()[0].getDamage();
    	*/
    	healPotion = 10;
    	stamPotion = 3;
    	armourDefence = 2;
    	weaponDamage = 5;
    	enemyDamage = application.GuiMain.getEnemy().getDamage();
    	enemyName = application.GuiMain.getEnemy().getName();
    	
    	playerHP.setProgress(playersRemainingHP / 20.0);
    	enemyHP.setProgress(enemysRemainingHP / 20.0);
    	playerStam.setProgress(playersRemainingStamina / 20.0);
    	enemyStam.setProgress(enemysRemainingStamina / 20.0);
    	
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
    }
    
    @FXML
    public void playerMoveButton(ActionEvent event){
    	double playerMove = stamSlider.getValue();
    	int enemyMove = combatMoveSet(enemysRemainingStamina, playersRemainingStamina);
    	
    	if (playerMove > playersRemainingStamina) {
			playerMove = playersRemainingStamina;
		}
		if (playerMove == 0) {
			if (enemyMove == 0) {
				combatText.setText("You and the " + enemyName + " both take a defensive position, eyeing each other carefully..." + "\n");
				playersRemainingStamina += 5 + staminaBuff;
				enemysRemainingStamina += 5;
			} else {
				combatText.setText("The " + enemyName + " launches into an attack, but you take a defensive position, deflecting most of the blow!" + "\n");
				playersRemainingHP -=1;
				playersRemainingStamina += 5 + staminaBuff;
				enemysRemainingStamina -= enemyMove;
				enemysRemainingStamina += 2;
			}
		} else {
			if (playerMove == enemyMove) {
				combatText.setText("You both attack with equal force, matching the other's strength and swordplay...");
				combatText.setText("After a harsh melee, you both retreat to reset your posture");
				playersRemainingHP -= 1;
				enemysRemainingHP-= 1;
				playersRemainingStamina -= playerMove;
				playersRemainingStamina += 2 + staminaBuff;
				enemysRemainingStamina -= enemyMove;
				enemysRemainingStamina += 2;
				
			} else if (playerMove > enemyMove) {
				if (enemyMove == 0) {
					combatText.setText("You launch into an attack, but the " + enemyName + " takes a defensive position, deflecting most of the blow");
					enemysRemainingHP -=1;
					enemysRemainingStamina += 5;
					playersRemainingStamina -= playerMove;
					playersRemainingStamina += 2 + staminaBuff;
				} else if ((playerMove - enemyMove) <= 5) {
					combatText.setText("You and the " + enemyName + " swing at each other, weapons clashing with deadly force...");
					combatText.setText("The " + enemyName + " is overpowered by your blows and you land a glancing hit!" + "\n");
					enemysRemainingHP -= (weaponDamage - 2);
					enemysRemainingStamina -= enemyMove;
					enemysRemainingStamina += 2;
					playersRemainingStamina -= playerMove;
					playersRemainingStamina += 2 + staminaBuff;
				} else if ((playerMove - enemyMove) > 5){
					combatText.setText("The " + enemyName + " moves to swing, but you catch them off guard with a powerful attack...");
					combatText.setText("You brush past their defense and land a devastating blow!" + "\n");
					enemysRemainingHP -= weaponDamage;
					enemysRemainingStamina -= enemyMove;
					enemysRemainingStamina += 2;
					playersRemainingStamina -= playerMove;
					playersRemainingStamina += 2 + staminaBuff;
				}
			} else if (playerMove < enemyMove) {
				if ((enemyMove - playerMove) <=5) {
					combatText.setText("You and the " + enemyName + " swing at each other, weapons clashing with deadly force...");
					combatText.setText("The " + enemyName + " overpowers you and lands a glancing hit!" + "\n");
					playersRemainingHP -= ((enemyDamage - 2) - armourDefence);
					enemysRemainingStamina -= enemyMove;
					enemysRemainingStamina += 2;
					playersRemainingStamina -= playerMove;
					playersRemainingStamina +=2 + staminaBuff;
				} else if ((enemyMove - playerMove) > 5) {
					combatText.setText("You make an attack, but the " + enemyName + " catches you off guard with a powerful attack...");
					combatText.setText("They brush past your defense and land a devastating blow!" + "\n");
					playersRemainingHP -= (enemyDamage - armourDefence);
					enemysRemainingStamina -= enemyMove;
					enemysRemainingStamina += 2;
					playersRemainingStamina -= playerMove;
					playersRemainingStamina += 2 + staminaBuff;
				}
			}
		}
		update();
		
	}
    

    @FXML
    public void update() {
    	stamSlider.setValue(0);
    	stamSlider.setMax(playersRemainingStamina);
    	if (playersRemainingStamina > 20) {
    		playersRemainingStamina = 20;
    	}
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
    
    public int combatMoveSet(int remainingStamina, int playerStamina) {
		if (playerStamina > remainingStamina ) {
			if ((playerStamina - remainingStamina) <= 10) {
				return remainingStamina;
			} else if (playerStamina - remainingStamina > 10)
				return 0;
		} else if (playerStamina < remainingStamina) {
			if (playerStamina < 5) {
				return 5;
			} else if ((remainingStamina - playerStamina) <= 5) {
				return remainingStamina;
			} else if ((remainingStamina - playerStamina) > 5) {
				return playerStamina + 1;
			}
		} else if (playerStamina == remainingStamina) {
			return remainingStamina;
		}
		return 0;
	}
	
 
	@Override
	public void refresh() {
	getPlayer().setHp(playersRemainingHP);
	application.GuiMain.getEnemy().setHp(enemysRemainingHP);
	if (enemysRemainingHP < 1) {
		application.GuiMain.getEnemy().setDead(true);
		getPlayer().setKillCount(getPlayer().getKillCount() + 1);
		getPlayer().setCoins(getPlayer().getCoins() + application.GuiMain.getEnemy().getGivesCoin());
		getPlayer().setXp(getPlayer().getXp() + application.GuiMain.getEnemy().getGivesXP());
	}
}

}