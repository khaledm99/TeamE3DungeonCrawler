package application;
	
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.StackPane;
import model.Entity;
import model.Item;


public class GuiMain extends Application {
	
	public static final String FXML_FILES_LOCATION = "src/view/";
	
	private Item[] p1Inventory;
	
	private Entity playerName;
	
	public Item[] getP1Inv(){
		return p1Inventory;
	}
	
	public void setP1Inv(Item[] anInvList) {
		p1Inventory = anInvList;
	}
	
	public Entity getP1Name() {
		return playerName;
	}
	
	            
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(); //focus here
			StackPane root = loader.load(new FileInputStream("src/view/Inventory.fxml"));
			GameController controller = (GameController)loader.getController();
			controller.refresh();
			controller.setPollTrackerApp(this);
			Scene scene = new Scene(root,1000,600);
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