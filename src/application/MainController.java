package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController extends GameController {

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
    void DownClick(ActionEvent event) {

    }

    @FXML
    void RightClick(ActionEvent event) {

    }

    @FXML
    void UpClick(ActionEvent event) {

    }

    @FXML
    void LeftClick(ActionEvent event) {

    }

    @FXML
    void UseClick(ActionEvent event) {

    }
    
    //need the @Initialize portion!!!
    @FXML
    void initialize() {
        assert DownButton != null : "fx:id=\"DownButton\" was not injected: check your FXML file 'MainScreen.fxml'.";
    }
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
