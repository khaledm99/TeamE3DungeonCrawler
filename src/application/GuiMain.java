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
	
	private static Player player = new Player(6,8,"Xavier", true);
		
	private static Inventory p1Inventory = new Inventory(player.getName());
	
	private static WorldItem[] worldItems = {new Door("Door One", 1, 1, 5, 0, "resource/test2.txt"), new Chest("Chest Two", 0, 2, 18, 10, p1Inventory.getRustySword()), new Chest("Chest One", 0, 2, 1, 1, p1Inventory.getSilverKey())};
	
	private static Item[] p1EquippedList;
	
	private static Map map = new Map();
	
	private static Userinterface playerStats = new Userinterface(player);
	
	private static Enemy skeletonOne = new Enemy(12,3,1,"Skeleton"); 
	
	private static Boolean onEnemy = false;
	
	private static Boolean pageRefresh = true;

	public static Userinterface getUI() {
		return playerStats;
	}
	
	public static String getRender(Map torender) {
		return torender.render(player, skeletonOne);
	}
	
	public static String getNextRender(String direction) {
		return map.renderNext(player, skeletonOne, direction, p1Inventory);
	}
	
	public static Enemy getEnemy() {
		return skeletonOne;
	}
	
	public static Map getMap() {
		return map;
	}
	
	public static Map readMap() {
		try {
			map.readMap("resource/test.txt", player);
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