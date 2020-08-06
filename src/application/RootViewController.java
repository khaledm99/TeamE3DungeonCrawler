package application;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;        

public class RootViewController extends GameController {
	
	@FXML
	private Parent view;
	
	@FXML
	private Pane mainScreen;
	
	@FXML
	private TabPane inventory;
	
	@FXML
	private InventoryController inventoryController;
	
	@FXML
	private MainController mainController; 
	
	@FXML
	void initialize() {
		Font.loadFont(getClass().getResourceAsStream("../resource/Early GameBoy.ttf"),1);
		Font.loadFont(getClass().getResourceAsStream("../resource/icomoon.ttf"),1);


	}
	
	public Parent getView() {
	     return view;
	}
	
	@Override
	public void refresh() {}
		
}
	
