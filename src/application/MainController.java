package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController extends GameController {

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
    void DownClick(ActionEvent event) {
    	direction = "down";
    	refresh();
    }

    @FXML
    void RightClick(ActionEvent event) {
    	direction = "right";
    	refresh();
    }

    @FXML
    void UpClick(ActionEvent event) {
    	direction = "up";
    	refresh();
    }

    @FXML
    void LeftClick(ActionEvent event) {
    	direction = "left";
    	refresh();
    }

    @FXML
    void UseClick(ActionEvent event) {

    }
    
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
    	
    	String initmap = application.GuiMain.getRender(application.GuiMain.getMap());
    	mapWindow.setText(initmap);
    }
    
	@Override
	public void refresh() {
		mapWindow.clear();
		String nextmap = application.GuiMain.getNextRender(direction);
		mapWindow.setText(nextmap);
	}

}
