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
import model.Map;
import model.Player;
import model.Userinterface;

public class Main {

	public static void main(String[] args) {
		
		// Creates a new player object and sets its stats
		Player player = new Player(6,8,"Player");
		
		// Creates a new enemy object and sets its stats
		Enemy skeletonOne = new Enemy(12,3,1,"Skeleton");
		
		Userinterface playerStats = new Userinterface(player); // Creates a new user interface using the player 
		
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
		System.out.println("What would you like to do? (up, down, left, right, stats, quit) ");
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
				System.out.println("What would you like to do? (up, down, left, right, stats, quit) ");
				playerInput = inputScanner.nextLine();
				continue;
			} 
			else if (playerInput.equals("up") || playerInput.equals("down") || playerInput.equals("left") || playerInput.equals("right") ) {
				playerStats.clearConsole();
				testmap = map.renderNext(player, skeletonOne, playerInput); 
				System.out.println(testmap);
			}
			else {
				System.out.println("Please input a valid command");
			}
			System.out.println("What would you like to do? (up, down, left, right, stats, quit) ");
			playerInput = inputScanner.nextLine();
		}
		System.out.println("Finished");
	}	
}