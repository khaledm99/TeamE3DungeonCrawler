package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StartController extends GameController{

    private static String name = "Chosen Undead";
    
    public static String getName() {
    	return name;
    }    

    @FXML
    private StackPane startPane;
    
	@FXML
    private Button startButton;

    @FXML
    private Button quitButton;

    @FXML
    private TextField nameField;

    @FXML
    void setName(KeyEvent event) {
    	if (!nameField.getText().equals("")) {
    		name = nameField.getText();
    	}
    }

    @FXML
    void startClick(ActionEvent event) {
    	startPane.setOpacity(0);
    	startPane.setMouseTransparent(true);
    }

    @FXML
    void quitClick(ActionEvent event) {
    	System.exit(0);
    	Stage stage= (Stage)startPane.getScene().getWindow();
    	stage.close();
    }

	@Override
	public void refresh() {
		
		
	}

}
