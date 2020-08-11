/**
 * Classname: StartController
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Controls start screen in GUI version. Has animated intro and allows
 * player to enter a name.
 *
 */
package application;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Transition;

public class StartController extends GameController{

    private static String name = "Chosen Undead"; // Default name
    
    // Name getter
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
    private ImageView bonfire;
    
    @FXML
    private ImageView titleImage;
    
    @FXML
    private Label enterLabel;
    
    // Sets name using text entered in nameField TextField
    @FXML
    void setName(KeyEvent event) { 
    	if (!nameField.getText().equals("")) {
    		name = nameField.getText();
    	}
    }

    // Starts the game
    @FXML
    void startClick(ActionEvent event) { 
    	startPane.setOpacity(0);
    	startPane.setMouseTransparent(true);
    }
    
    // Quits the game
    @FXML
    void quitClick(ActionEvent event) { 
    	System.exit(0);
    	Stage stage= (Stage)startPane.getScene().getWindow();
    	stage.close();
    }
    
    // Sets the opacity of label, TextField, and buttons to 100%. For use in intro animation
    private void setOpacity() {
    	startButton.setOpacity(1);
    	quitButton.setOpacity(1);
    	nameField.setOpacity(1);
    	enterLabel.setOpacity(1);
    }
    
    /**
     * initialize method: Sets all elements to 0% opacity and fades in the title and bonfire animation.
     * After the fade is completed, the label, TextField and buttons pop in. Bonfire animation
     * loops indefinitely.
     */
    @FXML
    void initialize() {
    	startButton.setOpacity(0);
    	quitButton.setOpacity(0);
    	nameField.setOpacity(0);
    	enterLabel.setOpacity(0);
    	
    	PauseTransition p = new PauseTransition(Duration.millis(5000));
    	PauseTransition p2 = new PauseTransition(Duration.millis(10000));
    	
    	FadeTransition ft = new FadeTransition();
    	ft.setDuration(Duration.millis(5000));
    	ft.setCycleCount(1);
    	ft.setAutoReverse(false);
    	ft.setFromValue(0.0);
    	ft.setToValue(1.0);
    	
    	FadeTransition ft2 = new FadeTransition();
    	ft2.setDuration(Duration.millis(5000));
    	ft2.setCycleCount(1);
    	ft2.setAutoReverse(false);
    	ft2.setFromValue(0.0);
    	ft2.setToValue(1.0);
    	ft2.setNode(titleImage);
    	
    	titleImage.setImage(new Image("resource/TOMBTEXT.png"));
    	titleImage.setOpacity(0);
    	bonfire.setImage(new Image("resource/BonfireANIM.png"));
    	bonfire.setViewport(new Rectangle2D(0, 0, 800, 800));
    	ft.setNode(bonfire);
    	ft.play();
    	p.setOnFinished(e -> ft2.play());
    	p.play();
    	
    	p2.setOnFinished(e -> setOpacity());
    	p2.play();
    	
    	//ft2.play();
    	Animation animation = new SpriteAnimation(bonfire, Duration.millis(1000), 5, 5, 0, 0, 800, 800);
    	animation.setCycleCount(Animation.INDEFINITE);
    	animation.play();
    }
    
    
	@Override
	public void refresh() {
		
	}

}
