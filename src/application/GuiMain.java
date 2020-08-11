package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
	
	private static Player player = new Player(6,8,"Player", true);
		
	private static Inventory p1Inventory = new Inventory(player.getName());
	
	private static WorldItem[] worldItems = {new Door("Door One", 1, 1, 19, 0, "resource/level2.txt"), 
											 new Door("Door Two", 3, 1, 13, 0, "resource/level3.txt"),
											 new Chest("Chest One", 0, 1, 1, 1, p1Inventory.getSilverKey()),
											 new Chest("Chest Two", 0, 1, 4, 12, p1Inventory.getRustyIronArmor()),
											 new Chest("Chest Three", 0, 1, 24, 6, Inventory.getHPPotion()),
											 new Chest("Chest Four", 0, 2, 24, 5, Inventory.getUltraStaminaPotion()),
											 new Chest("Chest Five", 0, 2, 20, 9, Inventory.getHPUltraPotion()),
											 new Chest("Chest Six", 0, 2, 16, 12, Inventory.getCrestOfArtorias())
											 };
	
	private static Item[] p1EquippedList;
	
	private static Map map = new Map();
	
	private static Userinterface playerStats = new Userinterface(player);
	
	//private static Enemy skeletonOne = new Enemy(12,3,1,"Skeleton"); 
	
	private static Enemy[] enemies = {new Enemy(7,1,1,"Hollow Soldier",5,0,Inventory.getIronSword()), 
	  								  new Enemy(7,10,2,"Skeleton",10,1,Inventory.getFlamingSword()),
	  								  new Enemy(11,6,3,"Great Grey Wolf Sif",15,2,Inventory.getShinyIronArmor())
	  								 };
	
	
	
	private static Boolean onEnemy = false;
	
	private static Boolean pageRefresh = true;

	public static Userinterface getUI() {
		return playerStats;
	}
	
	public static String getRender(Map torender) {
		return torender.render(player, Enemy.chooseEnemy(enemies, map));
	}
	
	public static String getNextRender(String direction) {
		return map.renderNext(player, Enemy.chooseEnemy(enemies, map), direction, p1Inventory);
	}
	
	public static Enemy getEnemy() {
		return Enemy.chooseEnemy(enemies, map);
	}
	
	public static Map getMap() {
		return map;
	}
	
	public static Map readMap() {
		try {
			map.readMap("resource/level1.txt", player);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public static WorldItem[] getWorldItems() {
		return worldItems;
	}
	public static Boolean getOnEnemy() {
		return onEnemy;
	}
	
	public static void setOnEnemy(Boolean result) {
		onEnemy = result;
	}
	
	public static Inventory getP1Inv(){
		return p1Inventory;
	}
	
	public static void setP1Inv(Inventory anInvList) {
		p1Inventory = anInvList;
	}
	
	public static Player getP1() {
		return player;
	}
	public static void setP1(Player aPlayer) {
		player = aPlayer;
	}
	
	public static void setEquippedList(Item[] aList) {
		p1EquippedList = aList;
	}
	
	public static Item[] getEquippedList() {
		return p1EquippedList;
	}
	
	public static Boolean getPageRefresh() {
		return pageRefresh;
	}
	
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
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

	
	

	

	

}