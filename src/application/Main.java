/**
 * Classname: Main
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Runs the main loop of the game
 *
 */
package application;
import java.io.IOException;
import java.util.Scanner;

import model.Enemy;
import model.Inventory;
import model.Map;
import model.Player;
import model.Userinterface;

public class Main {
	
	public static void main(String[] args) {
		
		// Creates a new player object and sets its stats
		Player player = new Player(6,8,"Player", false);
		
		// Creates a new enemy object and sets its stats
		Enemy skeletonOne = new Enemy(12,3,1,"Skeleton");
		
		Userinterface playerStats = new Userinterface(player); // Creates a new user interface using the player 
		Inventory playerInv = new Inventory(player.getName()); //added Character "player" with it's default inventory. Change name
		//to "Xavier" for a fuller inventory XL

		// Displays the start screen
		//Start menu = new Start();
		//menu.startScreen();
		//playerStats.clearConsole();
			
		Map map = new Map(); // Creates the map
		try {
			map.readMap("resource/test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Initializes a scanner for player input
		Scanner inputScanner = new Scanner(System.in);
		String playerInput = "";
		
		// Renders the map and prompts for user input
		String testmap = map.render(player, skeletonOne);
		//System.out.println(map.getName());
		System.out.println(testmap);
		System.out.println("What would you like to do? (up, down, left, right, stats, inventory, quit) ");
		playerInput = inputScanner.nextLine();
		playerStats.clearConsole();
		
		
		// This loop either moves the player and re-displays the map, displays the stats window, or quits depending on user input
		while (!playerInput.equals("quit")) {
			if (playerInput.equals("stats")) {
				playerStats.clearConsole();
				playerStats.setPlayer(player);
				playerStats.playerStepPrintOut();
				System.out.println("Type anything to return: ");
				inputScanner.nextLine();
				playerStats.clearConsole();
				System.out.println(map.render(player, skeletonOne));
				System.out.println("What would you like to do? (up, down, left, right, stats, inventory, quit) ");
				playerInput = inputScanner.nextLine();
				continue;
			}
			//added menu option Inventory, within it player can select equip, unequip or exit to return to main screen. XL
			else if (playerInput.equals("inventory") || playerInput.equals("inv")) {
				playerStats.clearConsole();
				playerInv.getInventory();
				System.out.println("Type exit to return or type equip/unequip to equip/unequip items or Heal" + '\n'
						+ "to use an equipped HP Potion: ");
				playerInput = inputScanner.nextLine();
				if (playerInput.equals("equip")) {
					System.out.println("Select an Item to Equip or type exit to return: ");
					playerInput = inputScanner.nextLine();
					while (playerInput != "exit") {
						playerStats.clearConsole();
						if (playerInput.equals("exit")) {
							break;
						}
						playerInv.equipItem(Integer.valueOf(playerInput));
						playerInv.getInventory();
						System.out.println("Select an Item to Equip or type exit to return: ");
						playerInput = inputScanner.nextLine();
					}
				}
				else if (playerInput.equals("unequip")) {
					System.out.println("Select an Item to unequip or type exit to return: ");
					playerInput = inputScanner.nextLine();
					while (playerInput != "exit") {
						playerStats.clearConsole();
						if (playerInput.equals("exit")) {
							break;
						}
						playerInv.unEquipItem(Integer.valueOf(playerInput));
						playerInv.getInventory();
						System.out.println("Select an Item to unequip or type exit to return: ");
						playerInput = inputScanner.nextLine();
					}
				}
				else if (playerInput.equals("Heal") || playerInput.equals("heal")) {
					if (playerInv.getEquippedList()[3] != null) {
						System.out.print(playerInv.getEquippedList()[3].getName() + "used");
						if (player.getHp() + playerInv.usePotion() <= 20) {
							player.setHp(player.getHp() + playerInv.usePotion());
						}
						else {
							player.setHp(20);
						}
					}
					else {
						playerInv.getInventory();
						System.out.println("No potions equipped");
					}
					
				}
				System.out.println(map.render(player, skeletonOne));
				System.out.println("What would you like to do? (up, down, left, right, stats, inventory, quit) ");
				playerInput = inputScanner.nextLine();
				continue;
			}
			
			else if (playerInput.equals("up") || playerInput.equals("down") || playerInput.equals("left") || playerInput.equals("right") ) {
				playerStats.clearConsole();
				testmap = map.renderNext(player, skeletonOne, playerInput, playerInv); 
				System.out.println(testmap);
			}
			else {
				System.out.println("Please input a valid command");
			}
			System.out.println("What would you like to do? (up, down, left, right, stats, inventory, quit) ");
			playerInput = inputScanner.nextLine();
		}
		System.out.println("Finished");
	}	
}