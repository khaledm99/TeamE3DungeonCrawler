package application;
	
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import model.Entity;
import model.Item;


public class GuiMain extends Application {
	
	public static final String FXML_FILES_LOCATION = "src/view/";
	
	private Item[] p1Inventory;
	
	private Entity playerName;
	
	private Item[] p1EquippedList;
	
	public Item[] getP1Inv(){
		return p1Inventory;
	}
	
	public void setP1Inv(Item[] anInvList) {
		p1Inventory = anInvList;
	}
	
	public Entity getP1Name() {
		return playerName;
	}
	
	public void setEquippedList(Item[] aList) {
		p1EquippedList = aList;
	}
	
	public Item[] getEquippedList() {
		return p1EquippedList;
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(); //focus here
			TabPane root = loader.load(new FileInputStream("src/view/Inventory.fxml"));
			GameController controller = (GameController)loader.getController();
			controller.refresh();
			controller.setGuiMainApp(this);
			Scene scene = new Scene(root,401,900);
			primaryStage.setScene(scene);
			//System.out.println(primaryStage.getWidth());
			//System.out.println(primaryStage.getHeight());
			primaryStage.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		launch(args);
	}

	

}