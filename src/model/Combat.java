package model;

import java.util.Scanner;


/**
 * Public Class: Combat
 * The combat class handles all combat encounters in the game.
 * Combat is carried out as a text-based and turn-based interaction
 * between the player and one enemy on the map. In it's current iteration,
 * it functions much like rock, paper, scissors with flavor text to make it interesting.
 * @author colec
 *
 */

public class Combat {
	
	private int playersRemainingHP;
	private int enemysRemainingHP;
	private int playersRemainingStamina;
	private int enemysRemainingStamina;
	private String enemyName;
	private Enemy combatEnemy;
	private Player combatPlayer;
	private Userinterface consoleClear;

// Default constructor
	
	public Combat() {
		
	}
	
// Getter methods for current hit points of player and enemy. Not used at this time
	public int getEnemysCurrentHP() {
		return enemysRemainingHP;
	}
	
	public int getPlayersCurrentHP() {
		return playersRemainingHP;
	}

/**
 * Public Method: combatInit
 * this is the combat initializer and takes as arguments the player and enemy object
 * who will be fighting each other. The attributes of these objects are used to determine health,
 * and later other stats like XP and gold. This method is used to initialize combat before invoking the
 * main combat loop, combatRun, if the player chooses to start combat
 * @param enemy
 * @param player
 */
	public void combatInit(Enemy enemy, Player player, Inventory inv) {
		
		combatEnemy = enemy;
		combatPlayer = player;
		enemyName = enemy.getName();
		enemysRemainingHP = enemy.getHp();
		enemysRemainingStamina = enemy.getStamina();
		playersRemainingHP = player.getHp();
		playersRemainingStamina = player.getStamina();
		Scanner init = new Scanner(System.in);
		System.out.println("You have encountered a " + enemyName + "!" + "\n");
		System.out.println("The " + enemyName + " acts with hostile intent, but you still have time to run" + "\n");
		System.out.println("What do you wish to do? (Enter one):" + "\n" + "1: Fight!" + "\n" + "2: Flee!" + "\n");
		int decision = init.nextInt();
		
		if (decision == 1) {
			System.out.println("You ready your weapon, prepared to stand your ground..." + "\n");
			combatRun(enemy, player, inv);
		} else if (decision == 2) {
			System.out.println("You step back cautiously, determined to avoid trouble");
		}
	
	}
	
/**
 * Public Method: combatRun
 * This method contains the main while loop that functions as the combat engine.
 * This method invokes the inventory class, allowing the player to choose a weapon.
 * The player's damage will then be determined by that weapon. Each round, the player
 * will have a rock, paper, scissors type set of actions, each a different attack that beats
 * one attack and is beaten by one attack. The player can also flee. The enemy chooses a random
 * attack, and the results are displayed by the if statements within the loop. Once a combatant has
 * died or the player flees, the loop ends and the combatEnd method is invoked. The enemy and player
 * arguments are required so they can be passed into the end method.
 * @param enemy
 * @param player
 */
	public void combatRun(Enemy enemy, Player player, Inventory inv) {
		
		consoleClear = new Userinterface();
		
		if (inv.getEquippedList()[0] == null) {
			inv.equipItem(0);
		}
		
		if (inv.getEquippedList()[2] == null) {
			inv.equipItem(1);
		}
		
		if (inv.getEquippedList()[3] == null) {
			inv.equipItem(2);
		}
		
		if (inv.getEquippedList()[4] == null) {
			inv.equipItem(3);
		}
		int weaponDamage = inv.getEquippedList()[0].getDamage();
		String weaponName = inv.getEquippedList()[0].getName();
		int armourDefence = inv.getEquippedList()[2].getArmorHP();
		String armourName = inv.getEquippedList()[2].getName();
		int healingPotion = inv.getEquippedList()[3].getPotionHP();
		String potion1Name = inv.getEquippedList()[3].getName();
		int staminaPotion = inv.getEquippedList()[4].getPotionHP();
		String potion2Name = inv.getEquippedList()[4].getName();
		int staminaBuff = 0;
		int staminaDuration = 0;
			
		System.out.println("");
		System.out.println("----------------------------------------------------------");
		System.out.println("FIGHT!" + "\n" + "You and the " + enemyName + " close in on each other, poised to attack..." + "\n");
		boolean quit = false;
		Scanner playerMove = new Scanner(System.in);
		
		while (quit == false) {
			System.out.println(enemyName + "'s remaining hit points: " + enemysRemainingHP + "\n");
			System.out.println("Your remaining hit points: " + playersRemainingHP + "\n");
			System.out.println("Your stamina: " + playersRemainingStamina + "/" + player.getStamina());
			System.out.println("Enemy's stamina: " + enemysRemainingStamina + "/" + enemy.getStamina());
			System.out.println("Make your next move:" + "\n");
			System.out.println("Enter 0 to defend");
			System.out.println("Enter 1-" + playersRemainingStamina + " to attack");
			System.out.println("Enter -1  to use a potion");
			System.out.println("Enter -2 to flee" + "\n");
			int playerAttackDecision = playerMove.nextInt();		
			// String playerOtherChoice = playerMove.next();
			
			consoleClear.clearConsole();
			
			if(playerAttackDecision == -2) {
				System.out.println("You break off your attack and flee, having overestimated your combat abilities" + "\n");
				System.out.println("As you turn and run, the " + enemyName + " takes the opportunity to deliver a parting blow, dealing 3 damage!" + "\n");
				playersRemainingHP -= 3;
				quit = true;
				
			} else if (playerAttackDecision == -1) {
				System.out.println("Enter 1 to drink a healing potion or 2 to drink a stamina potion" + "\n");
				int potionChoice = playerMove.nextInt();
			
				if (potionChoice == 1) {
					
					if (healingPotion == 0) {
						System.out.println("You pull out an empty bottle. You have already cosnumed your healing potion!" + "\n");
					
					} else {
					System.out.println("You back off to hastily quaff your " + potion1Name + ", healing yourself for " + healingPotion + " hit points!" + "\n");
					playersRemainingHP += healingPotion;
					enemysRemainingStamina += 5;
					healingPotion = 0;
					
					if (playersRemainingHP > 20) {
						playersRemainingHP = 20;
					}
					}
					
				} else {
					if (staminaPotion == 0) {
						System.out.println("You pull out an empty bottle. You have already cosnumed your stamina potion!" + "\n");
					
					} else {
					System.out.println("You back off to hastily quaff your " + potion2Name + ", giving yourself " + staminaPotion + " extra stamina regen!" + "\n");
					staminaBuff = staminaPotion;
					staminaDuration = 5;
					enemysRemainingStamina += 5;
					staminaPotion = 0;
					if (playersRemainingHP > 20) {
						playersRemainingHP = 20;
					}
					}
					
				}
				
			} else {
				int enemyMove = enemy.combatMoveSet(enemysRemainingStamina, playersRemainingStamina, 0);
				if (playerAttackDecision > playersRemainingStamina) {
					playerAttackDecision = playersRemainingStamina;
				}
				if (playerAttackDecision == 0) {
					if (enemyMove == 0) {
						System.out.println("You and the " + enemyName + " both take a defensive position, eyeing each other carefully..." + "\n");
						playersRemainingStamina += 5 + staminaBuff;
						enemysRemainingStamina += 5;
					} else {
						System.out.println("The " + enemyName + " launches into an attack, but you take a defensive position, deflecting most of the blow!" + "\n");
						playersRemainingHP -=1;
						playersRemainingStamina += 5 + staminaBuff;
						enemysRemainingStamina -= enemyMove;
						enemysRemainingStamina += 2;
					}
				} else {
					if (playerAttackDecision == enemyMove) {
						System.out.println("You both attack with equal force, matching the other's strength and swordplay...");
						System.out.println("After a harsh melee, you both retreat to reset your posture");
						playersRemainingHP -= 1;
						enemysRemainingHP-= 1;
						playersRemainingStamina -= playerAttackDecision;
						playersRemainingStamina += 2 + staminaBuff;
						enemysRemainingStamina -= enemyMove;
						enemysRemainingStamina += 2;
						
					} else if (playerAttackDecision > enemyMove) {
						if (enemyMove == 0) {
							System.out.println("You launch into an attack, but the " + enemyName + " takes a defensive position, deflecting most of the blow" + "\n");
							enemysRemainingHP -=1;
							enemysRemainingStamina += 5;
							playersRemainingStamina -= playerAttackDecision;
							playersRemainingStamina += 2 + staminaBuff;
						} else if ((playerAttackDecision - enemyMove) <= 5) {
							System.out.println("You and the " + enemyName + " swing at each other, weapons clashing with deadly force...");
							System.out.println("The " + enemyName + " is overpowered by your blows and you land a glancing hit!" + "\n");
							enemysRemainingHP -= (weaponDamage - 2);
							enemysRemainingStamina -= enemyMove;
							enemysRemainingStamina += 2;
							playersRemainingStamina -= playerAttackDecision;
							playersRemainingStamina += 2 + staminaBuff;
						} else if ((playerAttackDecision - enemyMove) > 5){
							System.out.println("The " + enemyName + " moves to swing, but you catch them off guard with a powerful attack...");
							System.out.println("You brush past their defense and land a devastating blow with your " + weaponName + "!" + "\n");
							enemysRemainingHP -= weaponDamage;
							enemysRemainingStamina -= enemyMove;
							enemysRemainingStamina += 2;
							playersRemainingStamina -= playerAttackDecision;
							playersRemainingStamina += 2 + staminaBuff;
						}
					} else if (playerAttackDecision < enemyMove) {
						if ((enemyMove - playerAttackDecision) <=5) {
							System.out.println("You and the " + enemyName + " swing at each other, weapons clashing with deadly force...");
							System.out.println("The " + enemyName + " overpowers you and lands a glancing hit!" + "\n");
							playersRemainingHP -= ((enemy.getDamage() - 2) - armourDefence);
							enemysRemainingStamina -= enemyMove;
							enemysRemainingStamina += 2;
							playersRemainingStamina -= playerAttackDecision;
							playersRemainingStamina +=2 + staminaBuff;
						} else if ((enemyMove - playerAttackDecision) > 5) {
							System.out.println("You make an attack, but the " + enemyName + " catches you off guard with a powerful attack...");
							System.out.println("They brush past your defense and land a devastating blow!" + "\n");
							playersRemainingHP -= (enemy.getDamage() - armourDefence);
							enemysRemainingStamina -= enemyMove;
							enemysRemainingStamina += 2;
							playersRemainingStamina -= playerAttackDecision;
							playersRemainingStamina += 2 + staminaBuff;
						}
					}
				}
			}
			staminaDuration -= 1;
			
			if (staminaDuration == 0) {
				staminaBuff = 0;
			}
			if (playersRemainingStamina > 20) {
				playersRemainingStamina = 20;
			}
			if (enemysRemainingStamina > 20) {
				enemysRemainingStamina = 20;
			}
			
			if (playersRemainingHP <= 0) {
				playersRemainingHP = 0;
				quit = true;
			}
			if (enemysRemainingHP <= 0) {
				enemysRemainingHP = 0;
				quit = true;
			}
		}
		combatEnd(enemy, player);
	}
			
	/**
	 * Public method: combatEnd
	 * This method is invoked when a player flees or one of the combatants dies within the run method.
	 * Depending on the circumstances of the battle's end, this method will set the hit points of the
	 * combatants and potentially award the player xp, coins and a kill count based on the stats of the enemy.
	 * The enemy will be set to dead, and the game will return to the map screen.
	 * @param enemy
	 * @param player
	 */
	public void combatEnd(Enemy enemy, Player player) {
		
		if (playersRemainingHP == 0) {
			System.out.println("You were defeated by the " + enemyName + "!" + "\n");
			System.out.println("----------------------------------------------------------");
			player.setHp(0);
			enemy.setHp(enemysRemainingHP);
			System.out.println("Quitting...");
			System.exit(0);
		}
		
		if (enemysRemainingHP == 0) {
			System.out.println("You have vanquished the " + enemyName + "!" + "\n");
			System.out.println("Your remaining hit points: " + playersRemainingHP);
			System.out.println("XP gained: " + combatEnemy.getGivesXP());
			System.out.println("Coins gained: " + combatEnemy.getGivesCoin() + "\n");
			System.out.println("----------------------------------------------------------");
			player.setHp(playersRemainingHP);
			enemy.setHp(0);
			player.setXp(combatPlayer.getXp() + combatEnemy.getGivesXP());
			player.setCoins(combatPlayer.getCoins() + combatEnemy.getGivesCoin());
			player.setKillCount(player.getKillCount() +1);
			enemy.setDead(true);
		}
		
		if (enemysRemainingHP > 0 && playersRemainingHP > 0) {
			System.out.println("You fled from the fight and survived!" + "\n");
			System.out.println("----------------------------------------------------------");
			player.setHp(playersRemainingHP);
			enemy.setHp(enemysRemainingHP);
		}
		
	}
	
}

