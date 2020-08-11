package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class WinController extends GameController{

    @FXML
    private ImageView winPane;
    
    @FXML
    private Button winButton;
    
    @FXML
    private void endGame(){
    	System.exit(0);
    	Stage stage = (Stage) winButton.getScene().getWindow();
    	stage.close();
    }
    @FXML
    void initialize() {
    Image img = new Image("resource/YOUWIN.png"); 
	winPane.setImage(img);
    }
	@Override
	public void refresh() {		
	}

}
