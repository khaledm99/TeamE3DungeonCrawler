package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Classname: Map
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Holds map data. Contains methods for displaying the map based on player coordinates as well as re-rendering the map
 * to reflect player movement as prompted in the main loop.
 *
 */

public class Map {
	
	private int width;
	private int height;
	private int level;
	// Map layout is stored in a nested array where each "cell" of the map is a single character String, to allow for a working coordinates system.
	private String[][] layout = { {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".","#",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
	};
	
	// Creates an enemy for test combat scenario
	
	private Combat combat;

	
	
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public String[][] getLayout() {
		return this.layout;
	}
	
	public void readMap(String file) throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		String is = classloader.getResource(file).getFile();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		
		this.level = Integer.parseInt(line);
		line = reader.readLine();
		this.width = Integer.parseInt(line.substring(6));
		line = reader.readLine();
		this.height = Integer.parseInt(line.substring(7));
		
		this.layout = new String[height][width];

		line = reader.readLine();
		while (line != null) {
			for (int y = 0; y < layout.length; y++) {
			
				int c = 0;
				for (int x = 0; x < layout[y].length; x++) {
					layout[y][x] = Character.toString(line.charAt(c));
					c++;
					}
				line = reader.readLine();		
			}
		}
		
		

	}
	
	/**
	 * render method. Takes the following parameters :
	 * 
	 * @param player: player object to display on the map
	 * @param enemy: enemy object to display on the map
	 * @return mapStr: string of the map to be displayed in main
	 * 
	 * Iterates through the map layout and creates a string
	 * representing the map. For each cell, checks if there is a player
	 * or enemy and replaces that cell character with '@' for the player and 
	 * '$' for an enemy
	 */
	public String render(Player player, Enemy enemy) {
		String mapStr = "";
		for (int index = 0; index < layout.length; index++) {
			for (int iindex = 0; iindex < layout[index].length; iindex++) {
				if ((player.getXcoord() == iindex) && (player.getYcoord() == index))
					mapStr += "@";
				else if ((enemy.getXcoord() == iindex) && (enemy.getYcoord() == index) && (enemy.isDead() == false))
					mapStr += "$";
				else
					mapStr += layout[index][iindex];
			}
			mapStr+= "\n";
		}
		return mapStr;
		
	}
	
	/**
	 * renderNext method. Takes the following parameters:
	 * 
	 * @param player: player object to display on map
	 * @param enemy: enemy object to display on map
	 * @param direction: direction of movement taken from user input
	 * to reflect player movement on new map render
	 * @return mapStr: string of the map to be displayed in main
	 * 
	 * Description: Functions similarly to the render method, but takes a direction
	 * as inputed by the user and re-renders the map to reflect new player position.
	 * Additionally, checks if the player is moving into a wall or if the player is moving into an enemy.
	 * If the player moves into an enemy, initializes a combat encounter.
	 */
	public String renderNext(Player player, Enemy enemy, String direction, Inventory inv) {
		if (direction.equals("up")) {
			if (!layout[player.getYcoord()-1][player.getXcoord()].equals("#")) {
				player.moveUp(1);
				if (player.getYcoord() == (enemy.getYcoord()) && player.getXcoord() == (enemy.getXcoord()) && (enemy.isDead() == false)){
					combat = new Combat();
					if (!player.getUI()) {
						combat.combatInit(enemy, player, inv);
					}
						
					
				}
			}
		}
		else if (direction.equals("down")) {
			if (!layout[player.getYcoord()+1][player.getXcoord()].equals("#")) {
				player.moveDown(1);
				if (player.getYcoord() == (enemy.getYcoord()) && player.getXcoord() == (enemy.getXcoord()) && (enemy.isDead() == false)){
					combat = new Combat();
					if (!player.getUI()) {
						combat.combatInit(enemy, player, inv);
					}
				}	
			}
		}
		else if (direction.equals("left")) {
			if (!layout[player.getYcoord()][player.getXcoord()-1].equals("#")) {
				player.moveLeft(1);
				if (player.getYcoord() == (enemy.getYcoord()) && player.getXcoord() == (enemy.getXcoord()) && (enemy.isDead() == false)){
					combat = new Combat();
					if (!player.getUI()) {
						combat.combatInit(enemy, player, inv);
					}
				}
			}
		}
		else if (direction.equals("right")) {
			if (!layout[player.getYcoord()][player.getXcoord()+1].equals("#")) {
				player.moveRight(1);
				if (player.getYcoord() == (enemy.getYcoord()) && player.getXcoord() == (enemy.getXcoord()) && (enemy.isDead() == false)){
					combat = new Combat();
					if (!player.getUI()) {
						combat.combatInit(enemy, player, inv);
					}
				}
			}
		}
		else {
			return "Please input a valid direction";
		}


		String mapStr = "";
		for (int index = 0; index < layout.length; index++) {
			for (int iindex = 0; iindex < layout[index].length; iindex++) {
				
				if ((player.getXcoord() == iindex) && (player.getYcoord() == index)) {
					mapStr += "@";}
				else if ((enemy.getXcoord() == iindex) && (enemy.getYcoord() == index && (enemy.isDead() == false)))
					mapStr += "$";
				else {

					mapStr += layout[index][iindex];
					}
			}
			mapStr += "\n";
		}
		return mapStr;
	}

}
