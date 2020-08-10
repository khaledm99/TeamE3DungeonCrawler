package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StartController extends GameController{

    private String name = "Chosen Undead";
    
    public String getName() {
    	return this.name;
    }
    
	@FXML
    private Button startButton;

    @FXML
    private Button quitButton;

    @FXML
    private TextField nameField;

    @FXML
    void setName(ActionEvent event) {
    	if (!nameField.getText().equals("")) {
    		name = nameField.getText();
    	}
    }

    @FXML
    void startClick(ActionEvent event) {
    	
    }

    @FXML
    void quitClick(ActionEvent event) {

    }

	@Override
	public void refresh() {
		
		
	}

}
