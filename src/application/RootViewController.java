package application;
import java.awt.Button;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;        

public class RootViewController extends GameController {
	
	@FXML
	private Parent view;
	
	@FXML
	private Pane mainScreen;
	
	@FXML
	private Pane inventory;
	
	@FXML
	private Pane ui;
	
	@FXML 
	private TabPane rootTabPane = new TabPane(
			new Tab("inv", inventory),
			new Tab("ui", ui)
			);
	@FXML
    private static StackPane combatStack;
	
	@FXML
	private Pane combat;
	
	@FXML
	private InventoryController inventoryController;
	
	@FXML
	private MainController mainController; 
	
	@FXML
	private UserInterfaceController uiController;
	
	@FXML 
	private CombatController combatController;
	
	@FXML
	void initialize() {
		Font.loadFont(getClass().getResourceAsStream("../resource/Early GameBoy.ttf"),1);
		Font.loadFont(getClass().getResourceAsStream("../resource/icomoon.ttf"),1);
	}
	
	/*static void combatStart() {
		System.out.println("in rootview controller combatStart()");
		if (getCombatScreen() == true) {
			combatStack.setOpacity(1);
			combatStack.setMouseTransparent(false);
		}
	}*/
	public Parent getView() {
	     return view;
	}
	
	
	@Override
	public void refresh() {
		
	}

}
		

	
