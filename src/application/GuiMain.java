package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.Inventory;
import model.Item;
import model.Player;


public class GuiMain extends Application {
	public static final String FXML_FILES_LOCATION = "src/view/";
	
	private static Player player = new Player(6,8,"Xavier");
	
	private static Inventory p1Inventory = new Inventory(player.getName());
	
	private static Item[] p1EquippedList;
	
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
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader parentLoader = new FXMLLoader();
			parentLoader.setLocation(getClass().getResource("../view/MainView.fxml"));
			Parent root = parentLoader.load();
			//GameController controller = (GameController)parentLoader.getController();
			//controller.setGuiMainApp(this);
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