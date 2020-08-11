/**
 * Classname: GuiMain
 * 
 * Version: 0
 * 
 * Author: TeamE3
 * 
 * Description: Main controller for GUI version of the game. Holds data
 * for the player, map, inventory, enemies, and world items.
 *
 */
package application;
	
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import model.Chest;
import model.Door;
import model.Enemy;
import model.Inventory;
import model.Item;
import model.Map;
import model.Player;
import model.Userinterface;
import model.WorldItem;


public class GuiMain extends Application {
	public static final String FXML_FILES_LOCATION = "src/view/";
	
	// Initializes player
	private static Player player = new Player(6,8,"Player", true);
	
	// Player inventory
	private static Inventory p1Inventory = new Inventory(player.getName());
	
	// List of objects in the world and sets relevant stats
	private static WorldItem[] worldItems = {new Door("Door One", 1, 1, 19, 0, "resource/level2.txt"), 
											 new Door("Door Two", 3, 2, 13, 0, "resource/level3.txt"),
											 new Chest("Chest One", 0, 1, 1, 1, p1Inventory.getSilverKey()),
											 new Chest("Chest Two", 0, 1, 4, 12, p1Inventory.getRustyIronArmor()),
											 new Chest("Chest Three", 0, 1, 24, 6, Inventory.getHPPotion()),
											 new Chest("Chest Four", 0, 2, 24, 5, Inventory.getUltraStaminaPotion()),
											 new Chest("Chest Five", 0, 2, 20, 9, Inventory.getHPUltraPotion()),
											 new Chest("Chest Six", 0, 2, 16, 12, Inventory.getCrestOfArtorias()),
											 new Chest("Chest Seven", 0, 3, 14, 11, Inventory.getShinyIronArmor())
											 };
	
	// List of items equipped by player
	private static Item[] p1EquippedList;
	
	// Initializes map
	private static Map map = new Map();
	
	// User interface based on player data
	private static Userinterface playerStats = new Userinterface(player);
	
	// List of enemies with relevant data
	private static Enemy[] enemies = {new Enemy(7,1,1,"Hollow Soldier",5,0,Inventory.getIronSword()), 
	  								  new Enemy(7,10,2,"Skeleton",10,1,Inventory.getFlamingSword()),
	  								  new Enemy(12,6,3,"Great Grey Wolf Sif",15,2,Inventory.getShinyIronArmor())
	  								 };
	
	
	// True if player has walked onto an enemy
	private static Boolean onEnemy = false;
	
	// Refresh marker
	private static Boolean pageRefresh = true;

	// User Interface getter
	public static Userinterface getUI() {
		return playerStats;
	}
	
	// Initial map render getter
	public static String getRender(Map torender) {
		return torender.render(player, Enemy.chooseEnemy(enemies, map));
	}
	
	// Next render getter
	public static String getNextRender(String direction) {
		return map.renderNext(player, Enemy.chooseEnemy(enemies, map), direction, p1Inventory);
	}
	
	// Current room Enemy getter
	public static Enemy getEnemy() {
		return Enemy.chooseEnemy(enemies, map);
	}
	
	// Map getter
	public static Map getMap() {
		return map;
	}
	
	// Reads a map from the text file then returns the new map
	public static Map readMap() {
		try {
			map.readMap("resource/level1.txt", player);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	// World Items getter
	public static WorldItem[] getWorldItems() {
		return worldItems;
	}
	
	// onEnemy getter
	public static Boolean getOnEnemy() {
		return onEnemy;
	}
	
	// onEnemy setter
	public static void setOnEnemy(Boolean result) {
		onEnemy = result;
	}
	
	// Player Inventory getter
	public static Inventory getP1Inv(){
		return p1Inventory;
	}
	
	// Player Inventory setter
	public static void setP1Inv(Inventory anInvList) {
		p1Inventory = anInvList;
	}
	
	// Player getter
	public static Player getP1() {
		return player;
	}
	
	// Player setter
	public static void setP1(Player aPlayer) {
		player = aPlayer;
	}
	
	// Equipped item list setter
	public static void setEquippedList(Item[] aList) {
		p1EquippedList = aList;
	}
	
	// Equipped item list getter
	public static Item[] getEquippedList() {
		return p1EquippedList;
	}
	
	// Refresh marker getter
	public static Boolean getPageRefresh() {
		return pageRefresh;
	}
	
	// Refresh marker setter
	public static void setPageRefresh(Boolean update) {
		pageRefresh = update;
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader parentLoader = new FXMLLoader();
			parentLoader.setLocation(getClass().getResource("../view/MainView.fxml"));
			Parent root = parentLoader.load();
			GameController controller = (GameController)parentLoader.getController();
			controller.setGuiMainApp(this);
			//controller.refresh();
			Scene scene = new Scene(root,1200,800);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Tomb of the Abysswalker");
			File file = new File("resource/bonfire.png");
			Image iconImage = new Image(file.toURI().toString());
			primaryStage.getIcons().add(iconImage);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

	
	

	

	

}