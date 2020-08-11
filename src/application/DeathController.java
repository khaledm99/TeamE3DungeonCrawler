package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DeathController extends GameController{

    @FXML
    private ImageView deathPane;
    
    @FXML
    private Button defeatButton;
    
    @FXML
    private void endGame(){
    	System.exit(0);
    	Stage stage = (Stage) defeatButton.getScene().getWindow();
    	stage.close();
    }
    @FXML
    void initialize() {
    Image img = new Image("resource/YOUDIED.png"); 
	deathPane.setImage(img);
    }
	@Override
	public void refresh() {		
	}

}
