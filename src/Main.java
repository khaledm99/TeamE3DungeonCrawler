import java.util.Scanner;

import javax.sound.sampled.Clip;

public class Main {

	public static void main(String[] args) {
		
		//audioHandler music = new audioHandler();
		//Clip clip = audioHandler.loop("/menu.wav");
		
		Player player = new Player();
		player.setXcoord(6);
		player.setYcoord(8);
		player.setCoins(15);
		player.setHp(20);   
		player.setKillCount(0);
		player.setLevel(1);
		player.setName("Test Player");
		Userinterface playerStats = new Userinterface(player);
		
		Start menu = new Start();
		menu.startScreen();
		playerStats.clearConsole();
		//audioHandler.stop(clip);
		
		Map map = new Map();
		
		

		
		Scanner inputScanner = new Scanner(System.in);
		String playerInput = "";
		
		//clip = audioHandler.loop("/dungeon.wav");
		String testmap = map.render(player);
		System.out.println(testmap);
		System.out.println("What would you like to do? (up, down, left, right, stats, quit) ");
		playerInput = inputScanner.nextLine();
		playerStats.clearConsole();
		
		while (!playerInput.equals("quit")) {
			if (playerInput.equals("stats")) {
				playerStats.clearConsole();
				playerStats.playerStepPrintOut();
				System.out.println("Type anything to return: ");
				inputScanner.nextLine();
				playerStats.clearConsole();
				System.out.println(map.render(player));
				System.out.println("What would you like to do? (up, down, left, right, stats, quit) ");
				playerInput = inputScanner.nextLine();
				continue;
			} 
			else if (playerInput.equals("up") || playerInput.equals("down") || playerInput.equals("left") || playerInput.equals("right") ) {
				playerStats.clearConsole();
				testmap = map.renderNext(player, playerInput); 
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