package application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ItemInfoController {
	
	
//	private String[] itemNames = new String[13];
//	itemNames[0] = "Wooden Sword";
//	itemNames[1] = "Iron Sword";
//	itemNames[2] = "Silver Sword";
//	itemNames[3] = "Flaming Sword";
//	itemNames[4] = "Rusty Sword";
//	itemNames[5] = "Leather Armor";
//	itemNames[6] = "Armor Scraps";
//	itemNames[7] = "Rusty Iron Armor";
//	itemNames[8] = "Shiny Iron Armor";
//	itemNames[9] = "Ultra HP Potion";
//	itemNames[10] = "HP Potion";
//	itemNames[11] = "Stamina Potion";
//	itemNames[12] = "Ultra Stamina Potion";
//	
//	private String[] itemDescr = new String[13];
//	itemDescr[0] = "This is a wooden sword. It has a damage of 1 and a durability of 10.";
//	itemDescr[1] = "This is an iron sword. It has a damage of 5 and a durability of 20.";
//	itemDescr[2] = "This is a silver sword. It has a damage of 1 and a durability of 10.";
//	itemDescr[3] = "This is a flaming sword. It has a damage of 1 and a durability of 10.";
//	itemDescr[4] = "This is a rusty sword. It has a damage of 1 and a durability of 10.";
//	itemDescr[5] = "This is leather armor. It has a damage of 1 and a durability of 10.";
//	itemDescr[6] = "This is armor scraps. It has a damage of 1 and a durability of 10.";
//	itemDescr[7] = "This is a rusty iron armor. It has a damage of 1 and a durability of 10.";
//	itemDescr[8] = "This is a shiny iron armor. It has a damage of 1 and a durability of 10.";
//	itemDescr[9] = "This is an  ultra HP potion. It has a damage of 1 and a durability of 10.";
	

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
