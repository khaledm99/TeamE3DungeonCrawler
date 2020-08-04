package application;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ItemInfoController {

    @FXML
    private Button nextButton;

    @FXML
    private Text itemName;

    @FXML
    private Button previousButton;

    @FXML
    private ImageView imageView;

    @FXML
    private TextArea itemDescription;
    
    
    EventHandler<ActionEvent> nextButtonEvent = new EventHandler<ActionEvent>() {
    	public void handle(ActionEvent e) {
    		Image image = new Image(getClass().getResource("FlamingSword.png").toExternalForm());
    		imageView.setImage(image);
    		System.out.println("Success");
    	}
    };
    
    
    @FXML 
    void initialize() {
    	Image image = new Image(getClass().getResource("WoodenSword.png").toExternalForm());
    	imageView.setImage(image);
    	itemName.setText("Wooden Sword");
    	itemDescription.setText("A wooden sword with 1 Damage and 10 Durability.");
        nextButton.setOnAction(nextButtonEvent);

    }

}
