/**
 * Classname: MainController
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Handles controls on the main screen of the game. Handles 
 * character input for movement, item use, inventory use, and stats view.
 *
 */
package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.WorldItem;

public class MainController extends GameController {
	
	public Stage stage = new Stage();
	
	private WorldItem[] worldItems = GuiMain.getWorldItems(); // Retrieves list of world items from GuiMain

    private String direction = "";   
    
	@FXML
    private TextArea mapWindow;

    @FXML
    private Button RightButton;

    @FXML
    private TextArea eventOutput;

    @FXML
    private Button UseButton;

    @FXML
    private Button LeftButton;

    @FXML
    private Button UpButton;

    @FXML
    private Button DownButton;

    @FXML
    void DownClick(ActionEvent event) { // Moves player down 
    	direction = "down";
    	refresh();
    }

    @FXML
    void RightClick(ActionEvent event) { // Moves player right
    	direction = "right";
    	refresh();
    }

    @FXML
    void UpClick(ActionEvent event) { // Moves player up
    	direction = "up";
    	refresh();
    }

    @FXML
    void LeftClick(ActionEvent event) { // Moves player left
    	direction = "left";
    	refresh();
    }

    /**
     * UseClick Method: Checks if there are world items in any of the four adjacent tiles to the player.
     * If there is an item, checks if it requires a key. If so, prints "Key Required..." to the event output. 
     * If no key is required, calls the onUse method on the world item.
     * @param event
     */
    @FXML
    void UseClick(ActionEvent event) {
    	int exists = 3;
    	for (int i = 0; i < worldItems.length; i++) {
		 	
			if (worldItems[i].checkSurroundings(getPlayer()) && (worldItems[i].getFloor() == application.GuiMain.getMap().getLevel()) && WorldItem.keyCheck(getInv(), worldItems[i])){
				eventOutput.setText(worldItems[i].onUse(getInv(), application.GuiMain.getMap(), getPlayer()));
			}
			
			else if ((worldItems[i].checkSurroundings(getPlayer()) && (worldItems[i].getFloor() == application.GuiMain.getMap().getLevel()) && !WorldItem.keyCheck(getInv(), worldItems[i]))){
				eventOutput.setText("Key Required...");
			}
			else {
				exists--;
			}
			
    	}
		if (exists == 0) {
			eventOutput.setText("Nothing to use...");
		}
		
		
		
    	direction = "use";	
    	refresh();
    }
    
    /**
     * Initialize method: Sets the button graphics and renders the initial map
     */
    @FXML
    void initialize() {
    	mapWindow.setEditable(false);
    	eventOutput.setEditable(false);
    	
    	Image img = new Image("resource/Arrow.png"); 
    	Image useimg = new Image("resource/UseButton.png");
    	UpButton.setGraphic(new ImageView(img));
    	DownButton.setGraphic(new ImageView(img));
    	LeftButton.setGraphic(new ImageView(img));
    	RightButton.setGraphic(new ImageView(img));
    	UseButton.setGraphic(new ImageView(useimg));
    	
    	String initmap = application.GuiMain.getRender(application.GuiMain.readMap());
    	mapWindow.setText(initmap);
    }
    
	/**
	 * refresh Method: Called on every button click. Checks if the player is on an enemy, has died,
	 * or has beaten the game, and displays the relevant screen. Otherwise, renders the next map based on button
	 * input.
	 */
    @Override
	public void refresh() {	
		if (getOnEnemy()) {
			try {
				FXMLLoader parentLoader = new FXMLLoader();
				parentLoader.setLocation(getClass().getResource("../view/Combat.fxml"));
				Parent root = parentLoader.load();
				Scene scene = new Scene(root,1200,800);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (getPlayer().getHp() <= 0) {
			try {
				FXMLLoader parentLoader = new FXMLLoader();
				parentLoader.setLocation(getClass().getResource("../view/Death.fxml"));
				Parent root = parentLoader.load();
				Scene scene = new Scene(root,1200,800);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (getPlayer().getKillCount() == 3) {
			try {
				FXMLLoader parentLoader = new FXMLLoader();
				parentLoader.setLocation(getClass().getResource("../view/Win.fxml"));
				Parent root = parentLoader.load();
				Scene scene = new Scene(root,1200,800);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		mapWindow.clear();
		String nextmap = application.GuiMain.getNextRender(direction);
		mapWindow.setText(nextmap);

	}
}


