package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import model.Inventory;
import model.Item;

public class InventoryController extends GameController{
	
	/**
	 * The method below is how the refresh method is called every second. It is designed by Homing Wat. It is a
	 * Genius creation that is responsible for all the code woring nicely together
	 */

	private ScheduledExecutorService executorService;
	
	/**
	 * For the next few hundred lines, the code initializes FXML document objects
	 */
	@FXML
    private Label DmgLabelSlot15;

    @FXML
    private Label DmgLabelSlot16;

    @FXML
    private Label DmgLabelSlot17;

    @FXML
    private Label DmgLabelSlot18;

    @FXML
    private Label DmgLabelSlot19;

    @FXML
    private Label DmgLabelSlot10;

    @FXML
    private Label DmgLabelSlot11;

    @FXML
    private Label DmgLabelSlot12;

    @FXML
    private Label DmgLabelSlot13;

    @FXML
    private Label DmgLabelSlot14;

    @FXML
    private Label DmgLabelSlot1;

    @FXML
    private Label DmgLabelSlot0;

    @FXML
    private Label DmgLabelSlot3;

    @FXML
    private Label DmgLabelSlot2;

    @FXML
    private Label DmgLabelSlot5;

    @FXML
    private Label DmgLabelSlot4;

    @FXML
    private Label DmgLabelSlot7;

    @FXML
    private Label DmgLabelSlot6;

    @FXML
    private Label DmgLabelSlot9;

    @FXML
    private Label DmgLabelSlot8;

	@FXML FlowPane parent;

    @FXML
    private VBox VboxSlot13;

    @FXML
    private Label DurSlot17;

    @FXML
    private VBox VboxSlot12;

    @FXML
    private Label DurSlot16;

    @FXML
    private VBox VboxSlot15;

    @FXML
    private Label DurSlot19;

    @FXML
    private VBox VboxSlot14;

    @FXML
    private Label DurSlot18;

    @FXML
    private Label DurSlot13;

    @FXML
    private Label DurSlot12;

    @FXML
    private VBox VboxSlot11;

    @FXML
    private Label DurSlot15;

    @FXML
    private VBox VboxSlot10;

    @FXML
    private Label DurSlot14;

    @FXML
    private Button Slot13;

    @FXML
    private Label DmgSlot03;

    @FXML
    private Button Slot14;

    @FXML
    private Label DmgSlot02;

    @FXML
    private Button Slot15;

    @FXML
    private Label DmgSlot01;

    @FXML
    private Button Slot16;

    @FXML
    private Button Slot17;

    @FXML
    private VBox VboxSlot17;

    @FXML
    private Button Slot18;

    @FXML
    private VBox VboxSlot16;

    @FXML
    private Button Slot19;

    @FXML
    private VBox VboxSlot19;

    @FXML
    private VBox VboxSlot18;

    @FXML
    private Button Slot2;

    @FXML
    private Button Slot3;

    @FXML
    private Button Slot4;

    @FXML
    private Button Slot5;

    @FXML
    private Button Slot0;

    @FXML
    private Button Slot1;

    @FXML
    private Button Slot6;

    @FXML
    private ProgressBar HealthBarProgressBar;

    @FXML
    private Button Slot7;

    @FXML
    private Button Slot8;

    @FXML
    private Button Slot9;

    @FXML
    private Label DurSlot06;

    @FXML
    private Label DurSlot05;

    @FXML
    private Label DurSlot08;

    @FXML
    private Label DurSlot07;

    @FXML
    private Label DurSlot02;

    @FXML
    private Label DurSlot01;

    @FXML
    private Label DurSlot04;

    @FXML
    private Label DurSlot03;

    @FXML
    private VBox VboxSlot5;

    @FXML
    private Label DurSlot09;

    @FXML
    private Label StaminaLeftLabel;

    @FXML
    private VBox VboxSlot1;

    @FXML
    private VBox VboxSlot2;

    @FXML
    private ListView<Item> ItemObjectListView;

    @FXML
    private VBox VboxSlot0;

    @FXML
    private Label HealthLabel;

    @FXML
    private Label DurSlot11;

    @FXML
    private Label DurSlot10;

    @FXML
    private ListView<String> StringEquippedListView;

    @FXML
    private Label DurSlot0;

    @FXML
    private VBox VboxSlot9;

    @FXML
    private VBox VboxSlot7;

    @FXML
    private VBox VboxSlot8;

    @FXML
    private VBox VboxSlot6;

    @FXML
    private VBox VboxSlot3;

    @FXML
    private VBox VboxSlot4;

    @FXML
    private Label DmgSlot19;

    @FXML
    private Label DmgSlot18;

    @FXML
    private Label MaxEquippedLabel;

    @FXML
    private Label DmgSlot17;

    @FXML
    private Label DmgSlot16;

    @FXML
    private Label DmgSlot15;

    @FXML
    private Label DmgSlot8;

    @FXML
    private Label HealthLeftLabel;

    @FXML
    private Label DmgSlot14;

    @FXML
    private Label DmgSlot13;

    @FXML
    private Label DmgSlot0;

    @FXML
    private Label DmgSlot12;

    @FXML
    private Label DmgSlot11;

    @FXML
    private Label DmgSlot10;

    @FXML
    private Label DmgSlot09;

    @FXML
    private Button Slot10;

    @FXML
    private Label DmgSlot06;

    @FXML
    private Button Slot11;

    @FXML
    private Label DmgSlot05;

    @FXML
    private Button Slot12;

    @FXML
    private Label DmgSlot04;
    
    @FXML
    private Label DmgSlot07;
    
    @FXML
    private Label DmgSlot08;
    
    @FXML
    private Label TotalHPLabel;
    
    @FXML ProgressBar StaminaProgressBar;
    
    @FXML
	private Button refreshButton;
    
    @FXML
    private Button UsePotionButton;
    
    @FXML
    private ImageView Slot0ImageView;
    
    @FXML
    private ImageView Slot1ImageView;

    @FXML
    private ImageView Slot2ImageView;
    
    @FXML
    private ImageView Slot3ImageView;
    
    @FXML
    private ImageView Slot4ImageView;
    
    @FXML
    private ImageView Slot5ImageView;
    
    @FXML
    private ImageView Slot6ImageView;

    @FXML
    private ImageView Slot7ImageView;
    
    @FXML
    private ImageView Slot8ImageView;
    
    @FXML
    private ImageView Slot9ImageView;
    
    @FXML
    private ImageView Slot10ImageView;
    
    @FXML
    private ImageView Slot11ImageView;
    
    @FXML
    private ImageView Slot12ImageView;
    
    @FXML
    private ImageView Slot13ImageView;
    
    @FXML
    private ImageView Slot14ImageView;
    
    @FXML
    private ImageView Slot15ImageView;
    
    @FXML
    private ImageView Slot16ImageView;
    
    @FXML
    private ImageView Slot17ImageView;
    
    @FXML
    private ImageView Slot18ImageView;
    
    @FXML
    private ImageView Slot19ImageView;
    
    @FXML
    void slotZeroSelected(MouseEvent event) {
        
    }

    @FXML
    void slotOneSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotTwoSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotThreeSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotFourSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotFiveSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotSixSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotSevenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotEightSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotNineSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotTenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotElevenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotTweleveSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotThirteenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotFourteenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotFifteenSelected(MouseEvent event) {
    	
    }
    @FXML
    void slot15drop(MouseEvent rClick) {
    	
    }

    @FXML
    void slotSixteenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotSeventeenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotEightteenSelected(MouseEvent event) {
    	
    }

    @FXML
    void slotNineteenSelected(MouseEvent event) {
    	
    }
    
    @FXML
    void equipListSelected(MouseEvent event) {

    }
    @FXML
    void refreshHandler(MouseEvent event) {
    	refresh();
    }
    
    @FXML
    void useButtonClicked(MouseEvent event) {
    	
    }
    /**
     * this method returns the hp points of the hp potion to add to players hp when a potion is used. 
     * The potion item is then dropped from the inventory using the dropFromInv method from the
     * Inventory class
     * @return
     */
    public int usePotionGui() {
    	int potionHp = getEquippedList()[3].getPotionHP();
    	getInv().dropFromInv(getEquippedList()[3]);
    	return potionHp;
    }
    private void initializeScheduler() {
		executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(this::loadData, 0, 1, TimeUnit.SECONDS);
		 
	}
    private void loadData() {
		
		Platform.runLater(() -> {;
		
		refresh();
		
		});
		
	}
    @FXML
    void initialize() {
    	refresh();
		initializeScheduler();
        assert HealthLeftLabel != null : "fx:id=\"HealthLeftLabel\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert TotalHPLabel != null : "fx:id=\"TotalHPLabel\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert StaminaLeftLabel != null : "fx:id=\"StaminaLeftLabel\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert MaxEquippedLabel != null : "fx:id=\"MaxEquippedLabel\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot13 != null : "fx:id=\"Slot13\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot14 != null : "fx:id=\"Slot14\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot15 != null : "fx:id=\"Slot15\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot16 != null : "fx:id=\"Slot16\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot17 != null : "fx:id=\"Slot17\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot18 != null : "fx:id=\"Slot18\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot19 != null : "fx:id=\"Slot19\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot2 != null : "fx:id=\"Slot2\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot3 != null : "fx:id=\"Slot3\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot4 != null : "fx:id=\"Slot4\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot5 != null : "fx:id=\"Slot5\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert ItemObjectListView != null : "fx:id=\"ItemObjectListView\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert StringEquippedListView != null : "fx:id=\"StringEquippedListView\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot10 != null : "fx:id=\"Slot10\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot0 != null : "fx:id=\"Slot0\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot11 != null : "fx:id=\"Slot11\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot1 != null : "fx:id=\"Slot1\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot12 != null : "fx:id=\"Slot12\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert HealthLabel != null : "fx:id=\"HealthLabel\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot6 != null : "fx:id=\"Slot6\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert HealthBarProgressBar != null : "fx:id=\"HealthBarProgressBar\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot7 != null : "fx:id=\"Slot7\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot8 != null : "fx:id=\"Slot8\" was not injected: check your FXML file 'Inventory.fxml'.";
        assert Slot9 != null : "fx:id=\"Slot9\" was not injected: check your FXML file 'Inventory.fxml'.";     
        assert StaminaProgressBar != null : "fx:id=\"StaminaProgressBar\" was not injected: check your FXML file 'Inventory.fxml'.";
        
    } 
    
    /**
     * the refresh method calls all the objects previously formatted from the FXML and assigns event on actions
     */
    @Override
    public void refresh() {
    	
    	//System.out.println("Inv refresh check");
    	//the inventory set up here will be moved once we continue working on those classes
    	//So far I set up the inventory of "Player" and set their HP.
        MaxEquippedLabel.setText("----Max Items Equipped----");
        MaxEquippedLabel.setOpacity(0);
        
    	double healthBar = getPlayer().getHp() / Double.valueOf(TotalHPLabel.getText());
    	HealthLeftLabel.setText(getPlayer().getHp() + "");
    	HealthBarProgressBar.setProgress(healthBar);
    	/**
    	 * sets up a standard inventory for every player
    	 */
    	Inventory p1 = getInv();
    	p1.setEquippedList(getEquippedList());
    	
    	/*
    	p1.addToInv(p1, p1.getLeatherArmor());
    	p1.addToInv(p1, p1.getHPPotion());
    	p1.addToInv(p1, p1.getIronSword());
    	p1.addToInv(p1, p1.getFlamingSword());
    	p1.addToInv(p1, p1.getSilverSword());
    	p1.addToInv(p1, p1.getWoodenSword());
    	p1.addToInv(p1, p1.getIronSword());
    	p1.addToInv(p1, p1.getFlamingSword());
    	*/
    	
    	
    	/*
    	 * The code below examines the current player's inventory and sets the button label
    	 * to whatever name an Item has at a specified slot in their inventory.
    	 */
    	
        Slot0.setText(p1.getInvList()[0].getName());
        Slot1.setText(p1.getInvList()[1].getName());
        Slot2.setText(p1.getInvList()[2].getName());
        Slot3.setText(p1.getInvList()[3].getName());
        Slot4.setText(p1.getInvList()[4].getName());
        Slot5.setText(p1.getInvList()[5].getName());
        Slot6.setText(p1.getInvList()[6].getName());
        Slot7.setText(p1.getInvList()[7].getName());
        Slot8.setText(p1.getInvList()[8].getName());
        Slot9.setText(p1.getInvList()[9].getName());
        Slot10.setText(p1.getInvList()[10].getName());
        Slot11.setText(p1.getInvList()[11].getName());
        Slot12.setText(p1.getInvList()[12].getName());
        Slot13.setText(p1.getInvList()[13].getName());
        Slot14.setText(p1.getInvList()[14].getName());
        Slot15.setText(p1.getInvList()[15].getName());
        Slot16.setText(p1.getInvList()[16].getName());
        Slot17.setText(p1.getInvList()[17].getName());
        Slot18.setText(p1.getInvList()[18].getName());
        Slot19.setText(p1.getInvList()[19].getName());
        
        //Counts being init for the following if methods
        int armorCount = 0;
        int weaponCount = 0;
        int HpPotionCount = 0;
        int StamPotionCount = 0;
        
        /*
         * The following code implements button presses and adds the type Item objects to 
         * two ListViews. One for the Item display names. The other to store the Item data and indices.
         * If the slot is labeled empty no Item will be added to the EquippedListView. Every time a button is 
         * pressed the ItemObjectListView must only have 5 or less items stored in it, otherwise
         * nothing will be added and a Label will become visible.
         * From what I understand there is no way to make this code repeat less... 
         * Added mouse enter and exit functionality to allow user to check stats of Items
         * 
         */
        
        
        
       Item Empty = p1.getEmpty();
       /**
        * if the players hp plus the potion is less than 20 the button sets the hp + usePotionGui.
        * Otherwise the hp is set to 20. The potion being used is unequipped and removed from 
        *the inventory list
        **/
       UsePotionButton.setOnMouseClicked((event) -> {  
	       	System.out.println(getEquippedList()[3].getName());
	       	if (getEquippedList()[3] != Empty) {
		        	if (getPlayer().getHp() +getEquippedList()[3].getPotionHP() <= 20) {
		        		getPlayer().setHp((getPlayer().getHp() + usePotionGui()));
		        	}
		        	else {
		        		getPlayer().setHp(20);
		        		usePotionGui();
		        	}
		        	StringEquippedListView.getItems().remove(3);
		        	ItemObjectListView.getItems().remove(3);		        	
	       	}
	       	refresh();
       });
       
        Slot0.setOnAction((event) -> {
        	if(Slot0.getText() != "Empty") {
        		if (ItemObjectListView.getItems().size() <6) {
        			if (p1.getInvList()[0].getItemType() == "Weapon") { 				
  	    					ItemObjectListView.getItems().add(0,p1.getInvList()[0]);
  	    					StringEquippedListView.getItems().add(0,p1.getInvList()[0].getName());
  	        			
        			}
    			else {
    			ItemObjectListView.getItems().addAll(p1.getInvList()[0]);
    			StringEquippedListView.getItems().addAll(p1.getInvList()[0].getName());
    			}
        	}
    		 
    		else {MaxEquippedLabel.setOpacity(1);}
        	}
        	refresh();
  	     });
        
        // Certain text and images pop up when mouse hovers over this area. This code is repeated for the different areas below. (Slots 0 to 19)
        Slot0.setOnMouseEntered((event) -> {
        	// Searches for the file name to see if it exists in the resource folder. If it doesn't exist, then it will use a default image file (question mark).
        	try {
        		File file = new File(p1.getInvList()[0].getImagePath());
        		boolean exists = file.isFile();
        		if (exists) {
        			Image slot0Image = new Image(file.toURI().toString());
                	if (Slot0.getText() != "Empty") {
                		DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getDamage()));
                		DurSlot0.setText(String.valueOf(p1.getInvList()[0].getDuribility()));
                		Slot0ImageView.setImage(slot0Image);
                		VboxSlot0.setOpacity(1);    
                		if (p1.getInvList()[0].getItemType() == "HP Potion") {
                  			DmgLabelSlot0.setText(" HP  ");
                  			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionHP()));
                    		Slot0ImageView.setImage(slot0Image);
                  		}
                		else if (p1.getInvList()[0].getItemType() == "Armor") {
                  			DmgLabelSlot0.setText(" AP  ");
                  			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getArmorHP()));
                    		Slot0ImageView.setImage(slot0Image);
                  		}
                		else if (p1.getInvList()[0].getItemType() == "Stam Potion") {
                  			DmgLabelSlot0.setText(" SP  ");
                  			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionStam()));
                    		Slot0ImageView.setImage(slot0Image);
                  		}
                		
                	}
        		} else {
        			throw new FileNotFoundException();
        		}
        		// If image file is null, it will catch this error and use default image file.
        	} catch (NullPointerException e) {
        		 
        		File file = new File("resource/defaultImage.png");
    			Image slot0Image = new Image(file.toURI().toString());
    				if (Slot0.getText() != "Empty") {
            		DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getDamage()));
            		DurSlot0.setText(String.valueOf(p1.getInvList()[0].getDuribility()));
            		Slot0ImageView.setImage(slot0Image);
            		VboxSlot0.setOpacity(1);    
            		if (p1.getInvList()[0].getItemType() == "HP Potion") {
              			DmgLabelSlot0.setText(" HP  ");
              			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionHP()));
                		Slot0ImageView.setImage(slot0Image);
              		}
            		else if (p1.getInvList()[0].getItemType() == "Armor") {
              			DmgLabelSlot0.setText(" AP  ");
              			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getArmorHP()));
                		Slot0ImageView.setImage(slot0Image);
              		}
            		else if (p1.getInvList()[0].getItemType() == "Stam Potion") {
              			DmgLabelSlot0.setText(" SP  ");
              			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionStam()));
                		Slot0ImageView.setImage(slot0Image);
              		}
            		
            	}

    				// If image file is misspelled or does not exist in the resource folder, it will catch this error and use default image file.
        	} catch (FileNotFoundException e) {
				 
				File file = new File("resource/defaultImage.png");
    			Image slot0Image = new Image(file.toURI().toString());
    				if (Slot0.getText() != "Empty") {
            		DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getDamage()));
            		DurSlot0.setText(String.valueOf(p1.getInvList()[0].getDuribility()));
            		Slot0ImageView.setImage(slot0Image);
            		VboxSlot0.setOpacity(1);    
            		if (p1.getInvList()[0].getItemType() == "HP Potion") {
              			DmgLabelSlot0.setText(" HP  ");
              			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionHP()));
                		Slot0ImageView.setImage(slot0Image);
              		}
            		else if (p1.getInvList()[0].getItemType() == "Armor") {
              			DmgLabelSlot0.setText(" AP  ");
              			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getArmorHP()));
                		Slot0ImageView.setImage(slot0Image);
              		}
            		else if (p1.getInvList()[0].getItemType() == "Stam Potion") {
              			DmgLabelSlot0.setText(" SP  ");
              			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionStam()));
                		Slot0ImageView.setImage(slot0Image);
              		}
            		
            	}
			}

        });
        
        Slot0.setOnMouseExited((event) -> {
        	VboxSlot0.setOpacity(0);        	
        });
          Slot1.setOnAction((event) -> {
  	    	 if(Slot1.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[1].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[1]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[1].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[1]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[1].getName());
  	    			}
        			
  	    		}
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	    	refresh();
  	     });
          
          Slot1.setOnMouseEntered((event) -> {
        	  try {
        		  File file = new File(p1.getInvList()[1].getImagePath());
        		  boolean exists = file.isFile();
        		  if (exists) {
        			  Image slot1Image = new Image(file.toURI().toString());
        			  if (Slot1.getText() != "Empty") {
        	          		DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getDamage()));
        	          		DurSlot01.setText(String.valueOf(p1.getInvList()[1].getDuribility()));
        	        		Slot1ImageView.setImage(slot1Image);
        	          		VboxSlot1.setOpacity(1);    
        	          		if (p1.getInvList()[1].getItemType() == "HP Potion") {
        	          			DmgLabelSlot1.setText(" HP  ");
        	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionHP()));
        	            		Slot1ImageView.setImage(slot1Image);
        	          		}
        	          		else if (p1.getInvList()[1].getItemType() == "Armor") {
        	          			DmgLabelSlot1.setText(" AP  ");
        	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getArmorHP()));
        	            		Slot1ImageView.setImage(slot1Image);
        	          		}
        	          		else if (p1.getInvList()[1].getItemType() == "Stam Potion") {
        	          			DmgLabelSlot1.setText(" SP  ");
        	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionStam()));
        	            		Slot1ImageView.setImage(slot1Image);
        	          		}
        	          	}
        		  } else {
        			  throw new FileNotFoundException();
        		  }
        	  } catch(NullPointerException e) {
          		  File file = new File("resource/defaultImage.png");
    			  Image slot1Image = new Image(file.toURI().toString());
    			  if (Slot1.getText() != "Empty") {
  	          		DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getDamage()));
  	          		DurSlot01.setText(String.valueOf(p1.getInvList()[1].getDuribility()));
  	        		Slot1ImageView.setImage(slot1Image);
  	          		VboxSlot1.setOpacity(1);    
  	          		if (p1.getInvList()[1].getItemType() == "HP Potion") {
  	          			DmgLabelSlot1.setText(" HP  ");
  	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionHP()));
  	            		Slot1ImageView.setImage(slot1Image);
  	          		}
  	          		else if (p1.getInvList()[1].getItemType() == "Armor") {
  	          			DmgLabelSlot1.setText(" AP  ");
  	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getArmorHP()));
  	            		Slot1ImageView.setImage(slot1Image);
  	          		}
  	          		else if (p1.getInvList()[1].getItemType() == "Stam Potion") {
  	          			DmgLabelSlot1.setText(" SP  ");
  	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionStam()));
  	            		Slot1ImageView.setImage(slot1Image);
  	          		}
  	          	}
        	  } catch (FileNotFoundException e) {
          		  File file = new File("resource/defaultImage.png");
    			  Image slot1Image = new Image(file.toURI().toString());
    			  if (Slot1.getText() != "Empty") {
    	          		DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getDamage()));
    	          		DurSlot01.setText(String.valueOf(p1.getInvList()[1].getDuribility()));
    	        		Slot1ImageView.setImage(slot1Image);
    	          		VboxSlot1.setOpacity(1);    
    	          		if (p1.getInvList()[1].getItemType() == "HP Potion") {
    	          			DmgLabelSlot1.setText(" HP  ");
    	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionHP()));
    	            		Slot1ImageView.setImage(slot1Image);
    	          		}
    	          		else if (p1.getInvList()[1].getItemType() == "Armor") {
    	          			DmgLabelSlot1.setText(" AP  ");
    	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getArmorHP()));
    	            		Slot1ImageView.setImage(slot1Image);
    	          		}
    	          		else if (p1.getInvList()[1].getItemType() == "Stam Potion") {
    	          			DmgLabelSlot1.setText(" SP  ");
    	          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionStam()));
    	            		Slot1ImageView.setImage(slot1Image);
    	          		}
    	          	}
        	  }
          	
          });
          Slot1.setOnMouseExited((event) -> {
          	VboxSlot1.setOpacity(0);        	
          });         
          Slot2.setOnContextMenuRequested((rClick) -> {
             	if (Slot15.getText() != "Empty") {
             		getInv().dropFromSlot(p1.getInvList()[2],2);
             		refresh();
             	}
            }); 
          Slot2.setOnAction((event) -> {
  	    	 if(Slot2.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[2].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[2]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[2].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[2]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[2].getName());
  	    			}
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	    	refresh();
  	     });
           
          Slot2.setOnMouseEntered((event) -> {
        	  try {
          		File file = new File(p1.getInvList()[2].getImagePath());
          		boolean exists = file.isFile();
          		if (exists) {
                  	Image slot2Image = new Image(file.toURI().toString());
                	if (Slot2.getText() != "Empty") {
                		DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getDamage()));
                		DurSlot02.setText(String.valueOf(p1.getInvList()[2].getDuribility()));
                		Slot2ImageView.setImage(slot2Image);
                		VboxSlot2.setOpacity(1);    
                		if (p1.getInvList()[2].getItemType() == "HP Potion") {
                  			DmgLabelSlot2.setText(" HP  ");
                  			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionHP()));
                    		Slot2ImageView.setImage(slot2Image);
                  		}
                		else if (p1.getInvList()[2].getItemType() == "Armor") {
                  			DmgLabelSlot2.setText(" AP  ");
                  			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getArmorHP()));
                    		Slot2ImageView.setImage(slot2Image);
                  		}
                		else if (p1.getInvList()[2].getItemType() == "Stam Potion") {
                  			DmgLabelSlot2.setText(" SP  ");
                  			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionStam()));
                    		Slot2ImageView.setImage(slot2Image);
                  		}
                	}	
          		} else {
          			throw new FileNotFoundException();
          		}
 
        	  } catch (NullPointerException e) {
        		   
          		  File file = new File("resource/defaultImage.png");
                  	Image slot2Image = new Image(file.toURI().toString());
                  	if (Slot2.getText() != "Empty") {
                		DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getDamage()));
                		DurSlot02.setText(String.valueOf(p1.getInvList()[2].getDuribility()));
                		Slot2ImageView.setImage(slot2Image);
                		VboxSlot2.setOpacity(1);    
                		if (p1.getInvList()[2].getItemType() == "HP Potion") {
                  			DmgLabelSlot2.setText(" HP  ");
                  			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionHP()));
                    		Slot2ImageView.setImage(slot2Image);
                  		}
                		else if (p1.getInvList()[2].getItemType() == "Armor") {
                  			DmgLabelSlot2.setText(" AP  ");
                  			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getArmorHP()));
                    		Slot2ImageView.setImage(slot2Image);
                  		}
                		else if (p1.getInvList()[2].getItemType() == "Stam Potion") {
                  			DmgLabelSlot2.setText(" SP  ");
                  			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionStam()));
                    		Slot2ImageView.setImage(slot2Image);
                  		}
                	}	
        	  } catch (FileNotFoundException e) {
        		   
          		  File file = new File("resource/defaultImage.png");
          		  Image slot2Image = new Image(file.toURI().toString());
          	if (Slot2.getText() != "Empty") {
        		DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getDamage()));
        		DurSlot02.setText(String.valueOf(p1.getInvList()[2].getDuribility()));
        		Slot2ImageView.setImage(slot2Image);
        		VboxSlot2.setOpacity(1);    
        		if (p1.getInvList()[2].getItemType() == "HP Potion") {
          			DmgLabelSlot2.setText(" HP  ");
          			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionHP()));
            		Slot2ImageView.setImage(slot2Image);
          		}
        		else if (p1.getInvList()[2].getItemType() == "Armor") {
          			DmgLabelSlot2.setText(" AP  ");
          			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getArmorHP()));
            		Slot2ImageView.setImage(slot2Image);
          		}
        		else if (p1.getInvList()[2].getItemType() == "Stam Potion") {
          			DmgLabelSlot2.setText(" SP  ");
          			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionStam()));
            		Slot2ImageView.setImage(slot2Image);
          		}
        	}	

            }});
            Slot2.setOnMouseExited((event) -> {
            	VboxSlot2.setOpacity(0);        	
            });   
            
          Slot3.setOnAction((event) -> {
  	    	 if(Slot3.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[3].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[3]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[3].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[3]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[3].getName());
  	    			}
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	    	refresh();
  	     });
          
          Slot3.setOnMouseEntered((event) -> {
        	try {
          		File file = new File(p1.getInvList()[3].getImagePath());
          		boolean exists = file.isFile();
          		if (exists) {
                  	Image slot3Image = new Image(file.toURI().toString());
                  	if (Slot3.getText() != "Empty") {
                  		DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getDamage()));
                  		DurSlot03.setText(String.valueOf(p1.getInvList()[3].getDuribility()));
                		Slot3ImageView.setImage(slot3Image);
                  		VboxSlot3.setOpacity(1);    
                  		if (p1.getInvList()[3].getItemType() == "HP Potion") {
                  			DmgLabelSlot3.setText(" HP  ");
                  			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionHP()));
                    		Slot3ImageView.setImage(slot3Image);
                  		}
                  		else if (p1.getInvList()[3].getItemType() == "Armor") {
                  			DmgLabelSlot3.setText(" AP  ");
                  			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getArmorHP()));
                    		Slot3ImageView.setImage(slot3Image);
                  		}
                  		else if (p1.getInvList()[3].getItemType() == "Stam Potion") {
                  			DmgLabelSlot3.setText(" SP  ");
                  			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionStam()));
                    		Slot3ImageView.setImage(slot3Image);
                  		}
                  	}
          		} else {
          			throw new FileNotFoundException();
          		}
        	} catch (NullPointerException e) {
        		   
        		  File file = new File("resource/defaultImage.png");
              	Image slot3Image = new Image(file.toURI().toString());
            	if (Slot3.getText() != "Empty") {
              		DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getDamage()));
              		DurSlot03.setText(String.valueOf(p1.getInvList()[3].getDuribility()));
            		Slot3ImageView.setImage(slot3Image);
              		VboxSlot3.setOpacity(1);    
              		if (p1.getInvList()[3].getItemType() == "HP Potion") {
              			DmgLabelSlot3.setText(" HP  ");
              			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionHP()));
                		Slot3ImageView.setImage(slot3Image);
              		}
              		else if (p1.getInvList()[3].getItemType() == "Armor") {
              			DmgLabelSlot3.setText(" AP  ");
              			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getArmorHP()));
                		Slot3ImageView.setImage(slot3Image);
              		}
              		else if (p1.getInvList()[3].getItemType() == "Stam Potion") {
              			DmgLabelSlot3.setText(" SP  ");
              			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionStam()));
                		Slot3ImageView.setImage(slot3Image);
              		}
              	}
        	} catch (FileNotFoundException e) {
        		   
        		  File file = new File("resource/defaultImage.png");
              	Image slot3Image = new Image(file.toURI().toString());
            	if (Slot3.getText() != "Empty") {
              		DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getDamage()));
              		DurSlot03.setText(String.valueOf(p1.getInvList()[3].getDuribility()));
            		Slot3ImageView.setImage(slot3Image);
              		VboxSlot3.setOpacity(1);    
              		if (p1.getInvList()[3].getItemType() == "HP Potion") {
              			DmgLabelSlot3.setText(" HP  ");
              			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionHP()));
                		Slot3ImageView.setImage(slot3Image);
              		}
              		else if (p1.getInvList()[3].getItemType() == "Armor") {
              			DmgLabelSlot3.setText(" AP  ");
              			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getArmorHP()));
                		Slot3ImageView.setImage(slot3Image);
              		}
              		else if (p1.getInvList()[3].getItemType() == "Stam Potion") {
              			DmgLabelSlot3.setText(" SP  ");
              			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionStam()));
                		Slot3ImageView.setImage(slot3Image);
              		}
              	}
        	}
          	
          });
          Slot3.setOnMouseExited((event) -> {
          	VboxSlot3.setOpacity(0);        	
          });
           
          Slot4.setOnAction((event) -> {
  	    	 if(Slot4.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[4].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[4]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[4].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[4]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[4].getName());
  	    			}
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	    	refresh();
  	     });
          
          Slot4.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[4].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot4Image = new Image(file.toURI().toString());
                      	if (Slot4.getText() != "Empty") {
                      		DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getDamage()));
                      		DurSlot04.setText(String.valueOf(p1.getInvList()[4].getDuribility()));
                    		Slot4ImageView.setImage(slot4Image);
                      		VboxSlot4.setOpacity(1);    
                      		if (p1.getInvList()[4].getItemType() == "HP Potion") {
                      			DmgLabelSlot4.setText(" HP  ");
                      			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionHP()));
                        		Slot4ImageView.setImage(slot4Image);
                      		}
                      		else if (p1.getInvList()[4].getItemType() == "Armor") {
                      			DmgLabelSlot4.setText(" AP  ");
                      			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getArmorHP()));
                        		Slot4ImageView.setImage(slot4Image);
                      		}
                      		else if (p1.getInvList()[4].getItemType() == "Stam Potion") {
                      			DmgLabelSlot4.setText(" SP  ");
                      			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionStam()));
                        		Slot4ImageView.setImage(slot4Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch(NullPointerException e) {
        		   
          		  File file = new File("resource/defaultImage.png");
              	Image slot4Image = new Image(file.toURI().toString());
              	if (Slot4.getText() != "Empty") {
              		DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getDamage()));
              		DurSlot04.setText(String.valueOf(p1.getInvList()[4].getDuribility()));
            		Slot4ImageView.setImage(slot4Image);
              		VboxSlot4.setOpacity(1);    
              		if (p1.getInvList()[4].getItemType() == "HP Potion") {
              			DmgLabelSlot4.setText(" HP  ");
              			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionHP()));
                		Slot4ImageView.setImage(slot4Image);
              		}
              		else if (p1.getInvList()[4].getItemType() == "Armor") {
              			DmgLabelSlot4.setText(" AP  ");
              			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getArmorHP()));
                		Slot4ImageView.setImage(slot4Image);
              		}
              		else if (p1.getInvList()[4].getItemType() == "Stam Potion") {
              			DmgLabelSlot4.setText(" SP  ");
              			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionStam()));
                		Slot4ImageView.setImage(slot4Image);
              		}
              	}
        	  } catch(FileNotFoundException e) {
        		   
          		  File file = new File("resource/defaultImage.png");
                	Image slot4Image = new Image(file.toURI().toString());
                	if (Slot4.getText() != "Empty") {
                		DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getDamage()));
                		DurSlot04.setText(String.valueOf(p1.getInvList()[4].getDuribility()));
              		Slot4ImageView.setImage(slot4Image);
                		VboxSlot4.setOpacity(1);    
                		if (p1.getInvList()[4].getItemType() == "HP Potion") {
                			DmgLabelSlot4.setText(" HP  ");
                			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionHP()));
                  		Slot4ImageView.setImage(slot4Image);
                		}
                		else if (p1.getInvList()[4].getItemType() == "Armor") {
                			DmgLabelSlot4.setText(" AP  ");
                			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getArmorHP()));
                  		Slot4ImageView.setImage(slot4Image);
                		}
                		else if (p1.getInvList()[4].getItemType() == "Stam Potion") {
                			DmgLabelSlot4.setText(" SP  ");
                			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionStam()));
                  		Slot4ImageView.setImage(slot4Image);
                		}
                	}
        	  }
          	
          });
          Slot4.setOnMouseExited((event) -> {
          	VboxSlot4.setOpacity(0);        	
          });
          
          Slot5.setOnAction((event) -> {
  	    	 if(Slot5.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[5].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[5]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[5].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[5]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[5].getName());
  	    			}
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	    	refresh();
  	     });
           
          Slot5.setOnMouseEntered((event) -> {            	
        	  try {
            		File file = new File(p1.getInvList()[5].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot5Image = new Image(file.toURI().toString());
                      	if (Slot5.getText() != "Empty") {
                      		DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getDamage()));
                      		DurSlot05.setText(String.valueOf(p1.getInvList()[5].getDuribility()));
                    		Slot5ImageView.setImage(slot5Image);
                      		VboxSlot5.setOpacity(1);    
                      		if (p1.getInvList()[5].getItemType() == "HP Potion") {
                      			DmgLabelSlot5.setText(" HP  ");
                      			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionHP()));
                        		Slot5ImageView.setImage(slot5Image);
                      		}
                      		else if (p1.getInvList()[5].getItemType() == "Armor") {
                      			DmgLabelSlot5.setText(" AP  ");
                      			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getArmorHP()));
                        		Slot5ImageView.setImage(slot5Image);
                      		}
                      		else if (p1.getInvList()[5].getItemType() == "Stam Potion") {
                      			DmgLabelSlot5.setText(" SP  ");
                      			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionStam()));
                        		Slot5ImageView.setImage(slot5Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  }  catch(NullPointerException e) {
        		   
          		  File file = new File("resource/defaultImage.png");
              	Image slot5Image = new Image(file.toURI().toString());
              	if (Slot5.getText() != "Empty") {
              		DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getDamage()));
              		DurSlot05.setText(String.valueOf(p1.getInvList()[5].getDuribility()));
            		Slot5ImageView.setImage(slot5Image);
              		VboxSlot5.setOpacity(1);    
              		if (p1.getInvList()[5].getItemType() == "HP Potion") {
              			DmgLabelSlot5.setText(" HP  ");
              			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionHP()));
                		Slot5ImageView.setImage(slot5Image);
              		}
              		else if (p1.getInvList()[5].getItemType() == "Armor") {
              			DmgLabelSlot5.setText(" AP  ");
              			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getArmorHP()));
                		Slot5ImageView.setImage(slot5Image);
              		}
              		else if (p1.getInvList()[5].getItemType() == "Stam Potion") {
              			DmgLabelSlot5.setText(" SP  ");
              			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionStam()));
                		Slot5ImageView.setImage(slot5Image);
              		}
              	}
        	  } catch (FileNotFoundException e) {
        		   
          		  File file = new File("resource/defaultImage.png");
                	Image slot5Image = new Image(file.toURI().toString());
                	if (Slot5.getText() != "Empty") {
                		DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getDamage()));
                		DurSlot05.setText(String.valueOf(p1.getInvList()[5].getDuribility()));
              		Slot5ImageView.setImage(slot5Image);
                		VboxSlot5.setOpacity(1);    
                		if (p1.getInvList()[5].getItemType() == "HP Potion") {
                			DmgLabelSlot5.setText(" HP  ");
                			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionHP()));
                  		Slot5ImageView.setImage(slot5Image);
                		}
                		else if (p1.getInvList()[5].getItemType() == "Armor") {
                			DmgLabelSlot5.setText(" AP  ");
                			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getArmorHP()));
                  		Slot5ImageView.setImage(slot5Image);
                		}
                		else if (p1.getInvList()[5].getItemType() == "Stam Potion") {
                			DmgLabelSlot5.setText(" SP  ");
                			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionStam()));
                  		Slot5ImageView.setImage(slot5Image);
                		}
                	}
        	  }
          	
          });
          Slot5.setOnMouseExited((event) -> {
          	VboxSlot5.setOpacity(0);        	
          });
          
          Slot6.setOnAction((event) -> {
  	    	 if(Slot6.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[6].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[6]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[6].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[6]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[6].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
         
          Slot6.setOnMouseEntered((event) -> {
        	  try {
          		File file = new File(p1.getInvList()[6].getImagePath());
          		boolean exists = file.isFile();
          		if (exists) {
                  	Image slot6Image = new Image(file.toURI().toString());
                  	if (Slot6.getText() != "Empty") {
                		DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getDamage()));
                		DurSlot06.setText(String.valueOf(p1.getInvList()[6].getDuribility()));
                		Slot6ImageView.setImage(slot6Image);
                		VboxSlot6.setOpacity(1);    
                		if (p1.getInvList()[6].getItemType() == "HP Potion") {
                  			DmgLabelSlot6.setText(" HP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionHP()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                  		else if (p1.getInvList()[6].getItemType() == "Armor") {
                  			DmgLabelSlot6.setText(" AP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getArmorHP()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                  		else if (p1.getInvList()[6].getItemType() == "Stam Potion") {
                  			DmgLabelSlot6.setText(" SP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionStam()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                	}
          		} else {
          			throw new FileNotFoundException();
          		}
        	  } catch (NullPointerException e) {
        		   
          		  	File file = new File("resource/defaultImage.png");
                  	Image slot6Image = new Image(file.toURI().toString());
                  	if (Slot6.getText() != "Empty") {
                		DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getDamage()));
                		DurSlot06.setText(String.valueOf(p1.getInvList()[6].getDuribility()));
                		Slot6ImageView.setImage(slot6Image);
                		VboxSlot6.setOpacity(1);    
                		if (p1.getInvList()[6].getItemType() == "HP Potion") {
                  			DmgLabelSlot6.setText(" HP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionHP()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                  		else if (p1.getInvList()[6].getItemType() == "Armor") {
                  			DmgLabelSlot6.setText(" AP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getArmorHP()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                  		else if (p1.getInvList()[6].getItemType() == "Stam Potion") {
                  			DmgLabelSlot6.setText(" SP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionStam()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                	}
        	  } catch (FileNotFoundException e) {
        		   
        		  	File file = new File("resource/defaultImage.png");
                  	Image slot6Image = new Image(file.toURI().toString());
                  	if (Slot6.getText() != "Empty") {
                		DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getDamage()));
                		DurSlot06.setText(String.valueOf(p1.getInvList()[6].getDuribility()));
                		Slot6ImageView.setImage(slot6Image);
                		VboxSlot6.setOpacity(1);    
                		if (p1.getInvList()[6].getItemType() == "HP Potion") {
                  			DmgLabelSlot6.setText(" HP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionHP()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                  		else if (p1.getInvList()[6].getItemType() == "Armor") {
                  			DmgLabelSlot6.setText(" AP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getArmorHP()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                  		else if (p1.getInvList()[6].getItemType() == "Stam Potion") {
                  			DmgLabelSlot6.setText(" SP  ");
                  			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionStam()));
                  			Slot6ImageView.setImage(slot6Image);
                  		}
                	}
        	  }
            });
            Slot6.setOnMouseExited((event) -> {
            	VboxSlot6.setOpacity(0);        	
            });
            
          Slot7.setOnAction((event) -> {
  	    	 if(Slot7.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[7].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[7]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[7].getName());
  	    			}
  	    			
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[7]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[7].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
         
          Slot7.setOnMouseEntered((event) -> {
        	  try {
          		File file = new File(p1.getInvList()[7].getImagePath());
          		boolean exists = file.isFile();
          		if (exists) {
                  	Image slot7Image = new Image(file.toURI().toString());
                  	if (Slot7.getText() != "Empty") {
                		DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getDamage()));
                		DurSlot07.setText(String.valueOf(p1.getInvList()[7].getDuribility()));
                		Slot7ImageView.setImage(slot7Image);
                		VboxSlot7.setOpacity(1);    
                		if (p1.getInvList()[7].getItemType() == "HP Potion") {
                  			DmgLabelSlot7.setText(" HP  ");
                  			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionHP()));
                  			Slot7ImageView.setImage(slot7Image);
                  		}
                  		else if (p1.getInvList()[7].getItemType() == "Armor") {
                  			DmgLabelSlot7.setText(" AP  ");
                  			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getArmorHP()));
                  			Slot7ImageView.setImage(slot7Image);
                  		}
                  		else if (p1.getInvList()[7].getItemType() == "Stam Potion") {
                  			DmgLabelSlot7.setText(" SP  ");
                  			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionStam()));
                  			Slot7ImageView.setImage(slot7Image);
                  		}
                	}
          		} else {
          			throw new FileNotFoundException();
          		}
        	  } catch (NullPointerException e) {
        		   
      		  	File file = new File("resource/defaultImage.png");
                  	Image slot7Image = new Image(file.toURI().toString());
                  	if (Slot7.getText() != "Empty") {
                		DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getDamage()));
                		DurSlot07.setText(String.valueOf(p1.getInvList()[7].getDuribility()));
                		Slot7ImageView.setImage(slot7Image);
                		VboxSlot7.setOpacity(1);    
                		if (p1.getInvList()[7].getItemType() == "HP Potion") {
                  			DmgLabelSlot7.setText(" HP  ");
                  			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionHP()));
                  			Slot7ImageView.setImage(slot7Image);
                  		}
                  		else if (p1.getInvList()[7].getItemType() == "Armor") {
                  			DmgLabelSlot7.setText(" AP  ");
                  			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getArmorHP()));
                  			Slot7ImageView.setImage(slot7Image);
                  		}
                  		else if (p1.getInvList()[7].getItemType() == "Stam Potion") {
                  			DmgLabelSlot7.setText(" SP  ");
                  			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionStam()));
                  			Slot7ImageView.setImage(slot7Image);
                  		}
                	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	File file = new File("resource/defaultImage.png");
              	Image slot7Image = new Image(file.toURI().toString());
              	if (Slot7.getText() != "Empty") {
            		DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getDamage()));
            		DurSlot07.setText(String.valueOf(p1.getInvList()[7].getDuribility()));
            		Slot7ImageView.setImage(slot7Image);
            		VboxSlot7.setOpacity(1);    
            		if (p1.getInvList()[7].getItemType() == "HP Potion") {
              			DmgLabelSlot7.setText(" HP  ");
              			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionHP()));
              			Slot7ImageView.setImage(slot7Image);
              		}
              		else if (p1.getInvList()[7].getItemType() == "Armor") {
              			DmgLabelSlot7.setText(" AP  ");
              			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getArmorHP()));
              			Slot7ImageView.setImage(slot7Image);
              		}
              		else if (p1.getInvList()[7].getItemType() == "Stam Potion") {
              			DmgLabelSlot7.setText(" SP  ");
              			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionStam()));
              			Slot7ImageView.setImage(slot7Image);
              		}
            	}
        	  }
            	
            });
            Slot7.setOnMouseExited((event) -> {
            	VboxSlot7.setOpacity(0);        	
            });
          Slot8.setOnAction((event) -> {
  	    	 if(Slot8.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[8].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[8]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[8].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[8]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[8].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot8.setOnMouseEntered((event) -> {
        	  try {
            	File file = new File(p1.getInvList()[8].getImagePath());
            	boolean exists = file.isFile();
            	if (exists) {
                  	Image slot8Image = new Image(file.toURI().toString());
                  	if (Slot8.getText() != "Empty") {
                  		DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getDamage()));
                  		DurSlot08.setText(String.valueOf(p1.getInvList()[8].getDuribility()));
                      	Slot8ImageView.setImage(slot8Image);
                  		VboxSlot8.setOpacity(1);  
                  		if (p1.getInvList()[8].getItemType() == "HP Potion") {
                  			DmgLabelSlot8.setText(" HP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionHP()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  		else if (p1.getInvList()[8].getItemType() == "Armor") {
                  			DmgLabelSlot8.setText(" AP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getArmorHP()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  		else if (p1.getInvList()[8].getItemType() == "Stam Potion") {
                  			DmgLabelSlot8.setText(" SP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionStam()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  	}
            	} else {
            		throw new FileNotFoundException();
            	}
        	  } catch (NullPointerException e) {
        		   
      		  	File file = new File("resource/defaultImage.png");
        		  Image slot8Image = new Image(file.toURI().toString());
                	if (Slot8.getText() != "Empty") {
                  		DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getDamage()));
                  		DurSlot08.setText(String.valueOf(p1.getInvList()[8].getDuribility()));
                      	Slot8ImageView.setImage(slot8Image);
                  		VboxSlot8.setOpacity(1);  
                  		if (p1.getInvList()[8].getItemType() == "HP Potion") {
                  			DmgLabelSlot8.setText(" HP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionHP()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  		else if (p1.getInvList()[8].getItemType() == "Armor") {
                  			DmgLabelSlot8.setText(" AP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getArmorHP()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  		else if (p1.getInvList()[8].getItemType() == "Stam Potion") {
                  			DmgLabelSlot8.setText(" SP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionStam()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	File file = new File("resource/defaultImage.png");
        		  Image slot8Image = new Image(file.toURI().toString());
                	if (Slot8.getText() != "Empty") {
                  		DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getDamage()));
                  		DurSlot08.setText(String.valueOf(p1.getInvList()[8].getDuribility()));
                      	Slot8ImageView.setImage(slot8Image);
                  		VboxSlot8.setOpacity(1);  
                  		if (p1.getInvList()[8].getItemType() == "HP Potion") {
                  			DmgLabelSlot8.setText(" HP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionHP()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  		else if (p1.getInvList()[8].getItemType() == "Armor") {
                  			DmgLabelSlot8.setText(" AP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getArmorHP()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  		else if (p1.getInvList()[8].getItemType() == "Stam Potion") {
                  			DmgLabelSlot8.setText(" SP  ");
                  			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionStam()));
                  			Slot8ImageView.setImage(slot8Image);
                  		}
                  	} 
        	  }
          	
          });
          Slot8.setOnMouseExited((event) -> {
          	VboxSlot8.setOpacity(0);        	
          });
           
          Slot9.setOnAction((event) -> {
  	    	 if(Slot9.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[9].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[9]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[9].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[9]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[9].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
           
          Slot9.setOnMouseEntered((event) -> {
        	  try {
          		File file = new File(p1.getInvList()[9].getImagePath());
          		boolean exists = file.isFile();
          		if (exists) {
                  	Image slot9Image = new Image(file.toURI().toString());
                  	if (Slot9.getText() != "Empty") {
                		DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getDamage()));
                		DurSlot09.setText(String.valueOf(p1.getInvList()[9].getDuribility()));
                		Slot9ImageView.setImage(slot9Image);
                		VboxSlot9.setOpacity(1);    
                		if (p1.getInvList()[9].getItemType() == "HP Potion") {
                  			DmgLabelSlot9.setText(" HP  ");
                  			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionHP()));
                  			Slot9ImageView.setImage(slot9Image);
                  		}
                  		else if (p1.getInvList()[9].getItemType() == "Armor") {
                  			DmgLabelSlot9.setText(" AP  ");
                  			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getArmorHP()));
                  			Slot9ImageView.setImage(slot9Image);
                  		}
                  		else if (p1.getInvList()[9].getItemType() == "Stam Potion") {
                  			DmgLabelSlot9.setText(" SP  ");
                  			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionStam()));
                  			Slot9ImageView.setImage(slot9Image);
                  		}
                	}
          		} else {
          			throw new FileNotFoundException();
          		}
        	  } catch (NullPointerException e) {
        		   
        		  	File file = new File("resource/defaultImage.png");
                	Image slot9Image = new Image(file.toURI().toString());
                	if (Slot9.getText() != "Empty") {
                		DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getDamage()));
                		DurSlot09.setText(String.valueOf(p1.getInvList()[9].getDuribility()));
                		Slot9ImageView.setImage(slot9Image);
                		VboxSlot9.setOpacity(1);    
                		if (p1.getInvList()[9].getItemType() == "HP Potion") {
                  			DmgLabelSlot9.setText(" HP  ");
                  			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionHP()));
                  			Slot9ImageView.setImage(slot9Image);
                  		}
                  		else if (p1.getInvList()[9].getItemType() == "Armor") {
                  			DmgLabelSlot9.setText(" AP  ");
                  			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getArmorHP()));
                  			Slot9ImageView.setImage(slot9Image);
                  		}
                  		else if (p1.getInvList()[9].getItemType() == "Stam Potion") {
                  			DmgLabelSlot9.setText(" SP  ");
                  			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionStam()));
                  			Slot9ImageView.setImage(slot9Image);
                  		}
                	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	File file = new File("resource/defaultImage.png");
              	Image slot9Image = new Image(file.toURI().toString());
              	if (Slot9.getText() != "Empty") {
              		DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getDamage()));
              		DurSlot09.setText(String.valueOf(p1.getInvList()[9].getDuribility()));
              		Slot9ImageView.setImage(slot9Image);
              		VboxSlot9.setOpacity(1);    
              		if (p1.getInvList()[9].getItemType() == "HP Potion") {
                			DmgLabelSlot9.setText(" HP  ");
                			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionHP()));
                			Slot9ImageView.setImage(slot9Image);
                		}
                		else if (p1.getInvList()[9].getItemType() == "Armor") {
                			DmgLabelSlot9.setText(" AP  ");
                			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getArmorHP()));
                			Slot9ImageView.setImage(slot9Image);
                		}
                		else if (p1.getInvList()[9].getItemType() == "Stam Potion") {
                			DmgLabelSlot9.setText(" SP  ");
                			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionStam()));
                			Slot9ImageView.setImage(slot9Image);
                		}
              	}
        	  }
            	
            });
            Slot9.setOnMouseExited((event) -> {
            	VboxSlot9.setOpacity(0);        	
            });
            
          Slot10.setOnAction((event) -> {
  	    	 if(Slot10.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[10].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[10]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[10].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[10]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[10].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot10.setOnMouseEntered((event) -> {
        	  try {
          		File file = new File(p1.getInvList()[10].getImagePath());
          		boolean exists = file.isFile();
          		if (exists) {
                  	Image slot10Image = new Image(file.toURI().toString());
                  	if (Slot10.getText() != "Empty") {
                		DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getDamage()));
                		DurSlot10.setText(String.valueOf(p1.getInvList()[10].getDuribility()));
                		Slot10ImageView.setImage(slot10Image);
                		VboxSlot10.setOpacity(1);  
                		if (p1.getInvList()[10].getItemType() == "HP Potion") {
                  			DmgLabelSlot10.setText(" HP  ");
                  			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionHP()));
                  			Slot10ImageView.setImage(slot10Image);
                  		}
                  		else if (p1.getInvList()[10].getItemType() == "Armor") {
                  			DmgLabelSlot10.setText(" AP  ");
                  			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getArmorHP()));
                  			Slot10ImageView.setImage(slot10Image);
                  		}
                  		else if (p1.getInvList()[10].getItemType() == "Stam Potion") {
                  			DmgLabelSlot10.setText(" SP  ");
                  			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionStam()));
                  			Slot10ImageView.setImage(slot10Image);
                  		}
                	}
          		} else {
          			throw new FileNotFoundException();
          		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	  Image slot10Image = new Image(file.toURI().toString());
      		  	if (Slot10.getText() != "Empty") {
            		DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getDamage()));
            		DurSlot10.setText(String.valueOf(p1.getInvList()[10].getDuribility()));
            		Slot10ImageView.setImage(slot10Image);
            		VboxSlot10.setOpacity(1);  
            		if (p1.getInvList()[10].getItemType() == "HP Potion") {
              			DmgLabelSlot10.setText(" HP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionHP()));
              			Slot10ImageView.setImage(slot10Image);
              		}
              		else if (p1.getInvList()[10].getItemType() == "Armor") {
              			DmgLabelSlot10.setText(" AP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getArmorHP()));
              			Slot10ImageView.setImage(slot10Image);
              		}
              		else if (p1.getInvList()[10].getItemType() == "Stam Potion") {
              			DmgLabelSlot10.setText(" SP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionStam()));
              			Slot10ImageView.setImage(slot10Image);
              		}
            	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	  Image slot10Image = new Image(file.toURI().toString());
      		  	if (Slot10.getText() != "Empty") {
            		DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getDamage()));
            		DurSlot10.setText(String.valueOf(p1.getInvList()[10].getDuribility()));
            		Slot10ImageView.setImage(slot10Image);
            		VboxSlot10.setOpacity(1);  
            		if (p1.getInvList()[10].getItemType() == "HP Potion") {
              			DmgLabelSlot10.setText(" HP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionHP()));
              			Slot10ImageView.setImage(slot10Image);
              		}
              		else if (p1.getInvList()[10].getItemType() == "Armor") {
              			DmgLabelSlot10.setText(" AP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getArmorHP()));
              			Slot10ImageView.setImage(slot10Image);
              		}
              		else if (p1.getInvList()[10].getItemType() == "Stam Potion") {
              			DmgLabelSlot10.setText(" SP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionStam()));
              			Slot10ImageView.setImage(slot10Image);
              		}
            	}
        	  }
            	
            });
            Slot10.setOnMouseExited((event) -> {
            	VboxSlot10.setOpacity(0);        	
            });
          Slot11.setOnAction((event) -> {
  	    	 if(Slot11.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[11].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[11]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[11].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[11]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[11].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          Slot11.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[11].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot11Image = new Image(file.toURI().toString());
                      	if (Slot11.getText() != "Empty") {
                      		DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getDamage()));
                      		DurSlot11.setText(String.valueOf(p1.getInvList()[11].getDuribility()));
                        	Slot11ImageView.setImage(slot11Image);
                      		VboxSlot11.setOpacity(1);  
                      		if (p1.getInvList()[11].getItemType() == "HP Potion") {
                      			DmgLabelSlot11.setText(" HP  ");
                      			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionHP()));
                      			Slot11ImageView.setImage(slot11Image);
                      		}
                      		else if (p1.getInvList()[11].getItemType() == "Armor") {
                      			DmgLabelSlot11.setText(" AP  ");
                      			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getArmorHP()));
                      			Slot11ImageView.setImage(slot11Image);
                      		}
                      		else if (p1.getInvList()[11].getItemType() == "Stam Potion") {
                      			DmgLabelSlot11.setText(" SP  ");
                      			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionStam()));
                      			Slot11ImageView.setImage(slot11Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
                	Image slot11Image = new Image(file.toURI().toString());
                	if (Slot11.getText() != "Empty") {
                  		DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getDamage()));
                  		DurSlot11.setText(String.valueOf(p1.getInvList()[11].getDuribility()));
                    	Slot11ImageView.setImage(slot11Image);
                  		VboxSlot11.setOpacity(1);  
                  		if (p1.getInvList()[11].getItemType() == "HP Potion") {
                  			DmgLabelSlot11.setText(" HP  ");
                  			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionHP()));
                  			Slot11ImageView.setImage(slot11Image);
                  		}
                  		else if (p1.getInvList()[11].getItemType() == "Armor") {
                  			DmgLabelSlot11.setText(" AP  ");
                  			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getArmorHP()));
                  			Slot11ImageView.setImage(slot11Image);
                  		}
                  		else if (p1.getInvList()[11].getItemType() == "Stam Potion") {
                  			DmgLabelSlot11.setText(" SP  ");
                  			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionStam()));
                  			Slot11ImageView.setImage(slot11Image);
                  		}
                  	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
                	Image slot11Image = new Image(file.toURI().toString());
                	if (Slot11.getText() != "Empty") {
                  		DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getDamage()));
                  		DurSlot11.setText(String.valueOf(p1.getInvList()[11].getDuribility()));
                    	Slot11ImageView.setImage(slot11Image);
                  		VboxSlot11.setOpacity(1);  
                  		if (p1.getInvList()[11].getItemType() == "HP Potion") {
                  			DmgLabelSlot11.setText(" HP  ");
                  			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionHP()));
                  			Slot11ImageView.setImage(slot11Image);
                  		}
                  		else if (p1.getInvList()[11].getItemType() == "Armor") {
                  			DmgLabelSlot11.setText(" AP  ");
                  			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getArmorHP()));
                  			Slot11ImageView.setImage(slot11Image);
                  		}
                  		else if (p1.getInvList()[11].getItemType() == "Stam Potion") {
                  			DmgLabelSlot11.setText(" SP  ");
                  			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionStam()));
                  			Slot11ImageView.setImage(slot11Image);
                  		}
                  	}
        	  }
          	
          });
          Slot11.setOnMouseExited((event) -> {
          	VboxSlot11.setOpacity(0);        	
          });
          
          Slot12.setOnAction((event) -> {
  	    	 if(Slot12.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <6) {
  	    			if (p1.getInvList()[12].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[12]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[12].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[12]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[12].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          Slot12.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[12].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot12Image = new Image(file.toURI().toString());
                      	if (Slot12.getText() != "Empty") {
                        	Slot12ImageView.setImage(slot12Image);
                      		DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getDamage()));
                      		DurSlot12.setText(String.valueOf(p1.getInvList()[12].getDuribility()));
                        	Slot12ImageView.setImage(slot12Image);
                      		VboxSlot12.setOpacity(1);    
                      		if (p1.getInvList()[12].getItemType() == "HP Potion") {
                      			DmgLabelSlot12.setText(" HP  ");
                      			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionHP()));
                      			Slot12ImageView.setImage(slot12Image);
                      		}
                      		else if (p1.getInvList()[12].getItemType() == "Armor") {
                      			DmgLabelSlot12.setText(" AP  ");
                      			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getArmorHP()));
                      			Slot12ImageView.setImage(slot12Image);
                      		}
                      		else if (p1.getInvList()[12].getItemType() == "Stam Potion") {
                      			DmgLabelSlot12.setText(" SP  ");
                      			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionStam()));
                      			Slot12ImageView.setImage(slot12Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
                	Image slot12Image = new Image(file.toURI().toString());
                	if (Slot12.getText() != "Empty") {
                  	Slot12ImageView.setImage(slot12Image);
                		DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getDamage()));
                		DurSlot12.setText(String.valueOf(p1.getInvList()[12].getDuribility()));
                  	Slot12ImageView.setImage(slot12Image);
                		VboxSlot12.setOpacity(1);    
                		if (p1.getInvList()[12].getItemType() == "HP Potion") {
                			DmgLabelSlot12.setText(" HP  ");
                			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionHP()));
                			Slot12ImageView.setImage(slot12Image);
                		}
                		else if (p1.getInvList()[12].getItemType() == "Armor") {
                			DmgLabelSlot12.setText(" AP  ");
                			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getArmorHP()));
                			Slot12ImageView.setImage(slot12Image);
                		}
                		else if (p1.getInvList()[12].getItemType() == "Stam Potion") {
                			DmgLabelSlot12.setText(" SP  ");
                			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionStam()));
                			Slot12ImageView.setImage(slot12Image);
                		}
                	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
                	Image slot12Image = new Image(file.toURI().toString());
                	if (Slot12.getText() != "Empty") {
                  	Slot12ImageView.setImage(slot12Image);
                		DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getDamage()));
                		DurSlot12.setText(String.valueOf(p1.getInvList()[12].getDuribility()));
                  	Slot12ImageView.setImage(slot12Image);
                		VboxSlot12.setOpacity(1);    
                		if (p1.getInvList()[12].getItemType() == "HP Potion") {
                			DmgLabelSlot12.setText(" HP  ");
                			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionHP()));
                			Slot12ImageView.setImage(slot12Image);
                		}
                		else if (p1.getInvList()[12].getItemType() == "Armor") {
                			DmgLabelSlot12.setText(" AP  ");
                			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getArmorHP()));
                			Slot12ImageView.setImage(slot12Image);
                		}
                		else if (p1.getInvList()[12].getItemType() == "Stam Potion") {
                			DmgLabelSlot12.setText(" SP  ");
                			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionStam()));
                			Slot12ImageView.setImage(slot12Image);
                		}
                	}
        	  }
          	
          });
          Slot12.setOnMouseExited((event) -> {
          	VboxSlot12.setOpacity(0);        	
          });
          
          Slot13.setOnAction((event) -> {
   	    	 if(Slot13.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[13].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[13]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[13].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[13]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[13].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot13.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[13].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot13Image = new Image(file.toURI().toString());
                      	if (Slot13.getText() != "Empty") {
                      		DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getDamage()));
                      		DurSlot13.setText(String.valueOf(p1.getInvList()[13].getDuribility()));
                        	Slot13ImageView.setImage(slot13Image);
                      		VboxSlot13.setOpacity(1);    
                      		if (p1.getInvList()[13].getItemType() == "HP Potion") {
                      			DmgLabelSlot13.setText(" HP  ");
                      			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionHP()));
                      			Slot13ImageView.setImage(slot13Image);
                      		}
                      		else if (p1.getInvList()[13].getItemType() == "Armor") {
                      			DmgLabelSlot13.setText(" AP  ");
                      			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getArmorHP()));
                      			Slot13ImageView.setImage(slot13Image);
                      		}
                      		else if (p1.getInvList()[13].getItemType() == "Stam Potion") {
                      			DmgLabelSlot13.setText(" SP  ");
                      			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionStam()));
                      			Slot13ImageView.setImage(slot13Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot13Image = new Image(file.toURI().toString());
              	if (Slot13.getText() != "Empty") {
              		DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getDamage()));
              		DurSlot13.setText(String.valueOf(p1.getInvList()[13].getDuribility()));
                	Slot13ImageView.setImage(slot13Image);
              		VboxSlot13.setOpacity(1);    
              		if (p1.getInvList()[13].getItemType() == "HP Potion") {
              			DmgLabelSlot13.setText(" HP  ");
              			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionHP()));
              			Slot13ImageView.setImage(slot13Image);
              		}
              		else if (p1.getInvList()[13].getItemType() == "Armor") {
              			DmgLabelSlot13.setText(" AP  ");
              			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getArmorHP()));
              			Slot13ImageView.setImage(slot13Image);
              		}
              		else if (p1.getInvList()[13].getItemType() == "Stam Potion") {
              			DmgLabelSlot13.setText(" SP  ");
              			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionStam()));
              			Slot13ImageView.setImage(slot13Image);
              		}
              	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot13Image = new Image(file.toURI().toString());
              	if (Slot13.getText() != "Empty") {
              		DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getDamage()));
              		DurSlot13.setText(String.valueOf(p1.getInvList()[13].getDuribility()));
                	Slot13ImageView.setImage(slot13Image);
              		VboxSlot13.setOpacity(1);    
              		if (p1.getInvList()[13].getItemType() == "HP Potion") {
              			DmgLabelSlot13.setText(" HP  ");
              			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionHP()));
              			Slot13ImageView.setImage(slot13Image);
              		}
              		else if (p1.getInvList()[13].getItemType() == "Armor") {
              			DmgLabelSlot13.setText(" AP  ");
              			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getArmorHP()));
              			Slot13ImageView.setImage(slot13Image);
              		}
              		else if (p1.getInvList()[13].getItemType() == "Stam Potion") {
              			DmgLabelSlot13.setText(" SP  ");
              			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionStam()));
              			Slot13ImageView.setImage(slot13Image);
              		}
              	}
        	  }
          	
          });
          Slot13.setOnMouseExited((event) -> {
          	VboxSlot13.setOpacity(0);        	
          });
          
          Slot14.setOnAction((event) -> {
   	    	 if(Slot14.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[14].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[14]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[14].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[14]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[14].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot14.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[14].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot14Image = new Image(file.toURI().toString());
                      	if (Slot14.getText() != "Empty") {
                      		DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getDamage()));
                      		DurSlot14.setText(String.valueOf(p1.getInvList()[14].getDuribility()));
                        	Slot14ImageView.setImage(slot14Image);
                      		VboxSlot14.setOpacity(1);    
                      		if (p1.getInvList()[14].getItemType() == "HP Potion") {
                      			DmgLabelSlot14.setText(" HP  ");
                      			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionHP()));
                      			Slot14ImageView.setImage(slot14Image);
                      		}
                      		else if (p1.getInvList()[14].getItemType() == "Armor") {
                      			DmgLabelSlot14.setText(" AP  ");
                      			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getArmorHP()));
                      			Slot14ImageView.setImage(slot14Image);
                      		}
                      		else if (p1.getInvList()[14].getItemType() == "Stam Potion") {
                      			DmgLabelSlot14.setText(" SP  ");
                      			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionStam()));
                      			Slot14ImageView.setImage(slot14Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot14Image = new Image(file.toURI().toString());
              	if (Slot14.getText() != "Empty") {
              		DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getDamage()));
              		DurSlot14.setText(String.valueOf(p1.getInvList()[14].getDuribility()));
                	Slot14ImageView.setImage(slot14Image);
              		VboxSlot14.setOpacity(1);    
              		if (p1.getInvList()[14].getItemType() == "HP Potion") {
              			DmgLabelSlot14.setText(" HP  ");
              			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionHP()));
              			Slot14ImageView.setImage(slot14Image);
              		}
              		else if (p1.getInvList()[14].getItemType() == "Armor") {
              			DmgLabelSlot14.setText(" AP  ");
              			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getArmorHP()));
              			Slot14ImageView.setImage(slot14Image);
              		}
              		else if (p1.getInvList()[14].getItemType() == "Stam Potion") {
              			DmgLabelSlot14.setText(" SP  ");
              			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionStam()));
              			Slot14ImageView.setImage(slot14Image);
              		}
              	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot14Image = new Image(file.toURI().toString());
              	if (Slot14.getText() != "Empty") {
              		DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getDamage()));
              		DurSlot14.setText(String.valueOf(p1.getInvList()[14].getDuribility()));
                	Slot14ImageView.setImage(slot14Image);
              		VboxSlot14.setOpacity(1);    
              		if (p1.getInvList()[14].getItemType() == "HP Potion") {
              			DmgLabelSlot14.setText(" HP  ");
              			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionHP()));
              			Slot14ImageView.setImage(slot14Image);
              		}
              		else if (p1.getInvList()[14].getItemType() == "Armor") {
              			DmgLabelSlot14.setText(" AP  ");
              			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getArmorHP()));
              			Slot14ImageView.setImage(slot14Image);
              		}
              		else if (p1.getInvList()[14].getItemType() == "Stam Potion") {
              			DmgLabelSlot14.setText(" SP  ");
              			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionStam()));
              			Slot14ImageView.setImage(slot14Image);
              		}
              	}
        	  }
          	
          });
          Slot14.setOnMouseExited((event) -> {
          	VboxSlot14.setOpacity(0);        	
          });
          
          Slot15.setOnAction((event) -> {
   	    	 if(Slot15.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[15].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[15]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[15].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[15]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[15].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot15.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[15].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot15Image = new Image(file.toURI().toString());
                      	if (Slot15.getText() != "Empty") {
                      		DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getDamage()));
                      		DurSlot15.setText(String.valueOf(p1.getInvList()[15].getDuribility()));
                        	Slot15ImageView.setImage(slot15Image);
                      		VboxSlot15.setOpacity(1);    
                      		if (p1.getInvList()[15].getItemType() == "HP Potion") {
                      			DmgLabelSlot15.setText(" HP  ");
                      			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionHP()));
                      			Slot15ImageView.setImage(slot15Image);
                      		}
                      		else if (p1.getInvList()[15].getItemType() == "Armor") {
                      			DmgLabelSlot15.setText(" AP  ");
                      			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getArmorHP()));
                      			Slot15ImageView.setImage(slot15Image);
                      		}
                      		else if (p1.getInvList()[15].getItemType() == "Stam Potion") {
                      			DmgLabelSlot15.setText(" SP  ");
                      			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionStam()));
                      			Slot15ImageView.setImage(slot15Image);
                      		}
                      	}	
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot15Image = new Image(file.toURI().toString());
              	if (Slot15.getText() != "Empty") {
              		DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getDamage()));
              		DurSlot15.setText(String.valueOf(p1.getInvList()[15].getDuribility()));
                	Slot15ImageView.setImage(slot15Image);
              		VboxSlot15.setOpacity(1);    
              		if (p1.getInvList()[15].getItemType() == "HP Potion") {
              			DmgLabelSlot15.setText(" HP  ");
              			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionHP()));
              			Slot15ImageView.setImage(slot15Image);
              		}
              		else if (p1.getInvList()[15].getItemType() == "Armor") {
              			DmgLabelSlot15.setText(" AP  ");
              			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getArmorHP()));
              			Slot15ImageView.setImage(slot15Image);
              		}
              		else if (p1.getInvList()[15].getItemType() == "Stam Potion") {
              			DmgLabelSlot15.setText(" SP  ");
              			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionStam()));
              			Slot15ImageView.setImage(slot15Image);
              		}
              	}	
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot15Image = new Image(file.toURI().toString());
              	if (Slot15.getText() != "Empty") {
              		DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getDamage()));
              		DurSlot15.setText(String.valueOf(p1.getInvList()[15].getDuribility()));
                	Slot15ImageView.setImage(slot15Image);
              		VboxSlot15.setOpacity(1);    
              		if (p1.getInvList()[15].getItemType() == "HP Potion") {
              			DmgLabelSlot15.setText(" HP  ");
              			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionHP()));
              			Slot15ImageView.setImage(slot15Image);
              		}
              		else if (p1.getInvList()[15].getItemType() == "Armor") {
              			DmgLabelSlot15.setText(" AP  ");
              			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getArmorHP()));
              			Slot15ImageView.setImage(slot15Image);
              		}
              		else if (p1.getInvList()[15].getItemType() == "Stam Potion") {
              			DmgLabelSlot15.setText(" SP  ");
              			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionStam()));
              			Slot15ImageView.setImage(slot15Image);
              		}
              	}	
        	  }


          });
          Slot15.setOnMouseExited((event) -> {
          	VboxSlot15.setOpacity(0);        	
          });
          
         Slot15.setOnContextMenuRequested((rClick) -> {
           	if (Slot15.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[15],15);
           		refresh();
           	}
          });
          Slot16.setOnAction((event) -> {
   	    	 if(Slot16.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[16].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[16]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[16].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[16]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[16].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot16.setOnMouseEntered((event) -> {
        	  try {
            		File file = new File(p1.getInvList()[16].getImagePath());
            		boolean exists = file.isFile();
            		if (exists) {
                      	Image slot16Image = new Image(file.toURI().toString());
                      	if (Slot16.getText() != "Empty") {
                      		DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getDamage()));
                      		DurSlot16.setText(String.valueOf(p1.getInvList()[16].getDuribility()));
                        	Slot16ImageView.setImage(slot16Image);
                      		VboxSlot16.setOpacity(1);    
                      		if (p1.getInvList()[16].getItemType() == "HP Potion") {
                      			DmgLabelSlot16.setText(" HP  ");
                      			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionHP()));
                      			Slot16ImageView.setImage(slot16Image);
                      		}
                      		else if (p1.getInvList()[16].getItemType() == "Armor") {
                      			DmgLabelSlot16.setText(" AP  ");
                      			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getArmorHP()));
                      			Slot16ImageView.setImage(slot16Image);
                      		}
                      		else if (p1.getInvList()[16].getItemType() == "Stam Potion") {
                      			DmgLabelSlot16.setText(" SP  ");
                      			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionStam()));
                      			Slot16ImageView.setImage(slot16Image);
                      		}
                      	}
            		} else {
            			throw new FileNotFoundException();
            		}
        	  } catch (NullPointerException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot16Image = new Image(file.toURI().toString());
              	if (Slot16.getText() != "Empty") {
              		DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getDamage()));
              		DurSlot16.setText(String.valueOf(p1.getInvList()[16].getDuribility()));
                	Slot16ImageView.setImage(slot16Image);
              		VboxSlot16.setOpacity(1);    
              		if (p1.getInvList()[16].getItemType() == "HP Potion") {
              			DmgLabelSlot16.setText(" HP  ");
              			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionHP()));
              			Slot16ImageView.setImage(slot16Image);
              		}
              		else if (p1.getInvList()[16].getItemType() == "Armor") {
              			DmgLabelSlot16.setText(" AP  ");
              			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getArmorHP()));
              			Slot16ImageView.setImage(slot16Image);
              		}
              		else if (p1.getInvList()[16].getItemType() == "Stam Potion") {
              			DmgLabelSlot16.setText(" SP  ");
              			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionStam()));
              			Slot16ImageView.setImage(slot16Image);
              		}
              	}
        	  } catch (FileNotFoundException e) {
        		   
      		  	  File file = new File("resource/defaultImage.png");
      		  	Image slot16Image = new Image(file.toURI().toString());
              	if (Slot16.getText() != "Empty") {
              		DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getDamage()));
              		DurSlot16.setText(String.valueOf(p1.getInvList()[16].getDuribility()));
                	Slot16ImageView.setImage(slot16Image);
              		VboxSlot16.setOpacity(1);    
              		if (p1.getInvList()[16].getItemType() == "HP Potion") {
              			DmgLabelSlot16.setText(" HP  ");
              			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionHP()));
              			Slot16ImageView.setImage(slot16Image);
              		}
              		else if (p1.getInvList()[16].getItemType() == "Armor") {
              			DmgLabelSlot16.setText(" AP  ");
              			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getArmorHP()));
              			Slot16ImageView.setImage(slot16Image);
              		}
              		else if (p1.getInvList()[16].getItemType() == "Stam Potion") {
              			DmgLabelSlot16.setText(" SP  ");
              			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionStam()));
              			Slot16ImageView.setImage(slot16Image);
              		}
        	  }
        	  }
          	
          });
          Slot16.setOnMouseExited((event) -> {
          	VboxSlot16.setOpacity(0);        	
          });
          
          Slot17.setOnAction((event) -> {
   	    	 if(Slot17.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[17].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[17]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[17].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[17]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[17].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot17.setOnMouseEntered((event) -> {
          	if (Slot17.getText() != "Empty") {
          		File file = new File(p1.getInvList()[17].getImagePath());
              	Image slot17Image = new Image(file.toURI().toString());
            	Slot17ImageView.setImage(slot17Image);
          		DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getDamage()));
          		DurSlot17.setText(String.valueOf(p1.getInvList()[17].getDuribility()));
          		VboxSlot17.setOpacity(1);   
          		if (p1.getInvList()[17].getItemType() == "HP Potion") {
          			DmgLabelSlot17.setText(" HP  ");
          			DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getPotionHP()));
          		}
          		else if (p1.getInvList()[17].getItemType() == "Armor") {
          			DmgLabelSlot17.setText(" AP  ");
          			DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getArmorHP()));
          		}
          		else if (p1.getInvList()[17].getItemType() == "Stam Potion") {
          			DmgLabelSlot17.setText(" SP  ");
          			DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getPotionStam()));
          		}
          	}
          });
          Slot17.setOnMouseExited((event) -> {
          	VboxSlot17.setOpacity(0);        	
          });
          
          Slot18.setOnAction((event) -> {
   	    	 if(Slot18.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[18].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[18]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[18].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[18]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[18].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot18.setOnMouseEntered((event) -> {
          	if (Slot18.getText() != "Empty") {
          		File file = new File(p1.getInvList()[18].getImagePath());
              	Image slot18Image = new Image(file.toURI().toString());
          		DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getDamage()));
          		DurSlot18.setText(String.valueOf(p1.getInvList()[18].getDuribility()));
            	Slot18ImageView.setImage(slot18Image);
          		VboxSlot18.setOpacity(1);
          		if (p1.getInvList()[18].getItemType() == "HP Potion") {
          			DmgLabelSlot18.setText(" HP  ");
          			DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getPotionHP()));
          		}
          		else if (p1.getInvList()[18].getItemType() == "Armor") {
          			DmgLabelSlot18.setText(" AP  ");
          			DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getArmorHP()));
          		}
          		else if (p1.getInvList()[18].getItemType() == "Stam Potion") {
          			DmgLabelSlot18.setText(" SP  ");
          			DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getPotionStam()));
          		}
          	}
          });
          Slot18.setOnMouseExited((event) -> {
          	VboxSlot18.setOpacity(0);        	
          });
          
          Slot19.setOnAction((event) -> {
   	    	 if(Slot19.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <6) {
   	    			if (p1.getInvList()[19].getItemType() == "Weapon") {
  	    				ItemObjectListView.getItems().add(0,p1.getInvList()[19]);
  	        			StringEquippedListView.getItems().add(0,p1.getInvList()[19].getName());
  	    			}
  	    			else {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[19]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[19].getName());
  	    			}
        			refresh();
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot19.setOnMouseEntered((event) -> {
          	if (Slot19.getText() != "Empty") {
          		File file = new File(p1.getInvList()[19].getImagePath());
              	Image slot19Image = new Image(file.toURI().toString());
            	Slot19ImageView.setImage(slot19Image);
          		DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getDamage()));
          		DurSlot19.setText(String.valueOf(p1.getInvList()[19].getDuribility()));
          		VboxSlot19.setOpacity(1);
          		if (p1.getInvList()[19].getItemType() == "HP Potion") {
          			DmgLabelSlot19.setText(" HP  ");
          			DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getPotionHP()));
          		}
          		else if (p1.getInvList()[19].getItemType() == "Armor") {
          			DmgLabelSlot19.setText(" AP  ");
          			DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getArmorHP()));
          		}
          		else if (p1.getInvList()[19].getItemType() == "Stam Potion") {
          			DmgLabelSlot19.setText(" SP  ");
          			DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getPotionStam()));
          		}
          	}
          });
          Slot19.setOnMouseExited((event) -> {
          	VboxSlot19.setOpacity(0);        	
          });
          
          /**
           * Dropping items from inv by using right click
           */
          Slot0.setOnContextMenuRequested((rClick) -> {
         	if (Slot0.getText() != "Empty") {
         		getInv().dropFromSlot(p1.getInvList()[0],0);
         		refresh();
         	}
          });  
          Slot1.setOnContextMenuRequested((rClick) -> {
         	if (Slot1.getText() != "Empty") {
         		getInv().dropFromSlot(p1.getInvList()[1],1);
         		refresh();
             	}
          });
          Slot2.setOnContextMenuRequested((rClick) -> {
           	if (Slot2.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[2],2);
           		refresh();
           	}
          });
          Slot3.setOnContextMenuRequested((rClick) -> {
           	if (Slot3.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[3],3);
           		refresh();
           	}
          });
          Slot4.setOnContextMenuRequested((rClick) -> {
           	if (Slot4.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[4],4);
           		refresh();
           	}
          });
          Slot5.setOnContextMenuRequested((rClick) -> {
           	if (Slot5.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[5],5);
           		refresh();
           	}
          });
          Slot6.setOnContextMenuRequested((rClick) -> {
           	if (Slot6.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[6],6);
           		refresh();
           	}
          });
          Slot7.setOnContextMenuRequested((rClick) -> {
           	if (Slot7.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[7],7);
           		refresh();
           	}
          });
          Slot8.setOnContextMenuRequested((rClick) -> {
           	if (Slot8.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[8],8);
           		refresh();
           	}
          });
          Slot9.setOnContextMenuRequested((rClick) -> {
           	if (Slot9.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[9],9);
           		refresh();
           	}
          });
          Slot10.setOnContextMenuRequested((rClick) -> {
           	if (Slot10.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[10],10);
           		refresh();
           	}
          });
          Slot11.setOnContextMenuRequested((rClick) -> {
           	if (Slot11.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[11],11);
           		refresh();
           	}
          });
          Slot12.setOnContextMenuRequested((rClick) -> {
           	if (Slot12.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[12],12);
           		refresh();
           	}
          });
          Slot13.setOnContextMenuRequested((rClick) -> {
           	if (Slot13.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[13],13);
           		refresh();
           	}
          });
          Slot14.setOnContextMenuRequested((rClick) -> {
           	if (Slot14.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[14],14);
           		refresh();
           	}
          });
          Slot15.setOnContextMenuRequested((rClick) -> {
           	if (Slot15.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[15],15);
           		refresh();
           	}
          });
          Slot16.setOnContextMenuRequested((rClick) -> {
           	if (Slot16.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[16],16);
           		refresh();
           	}
          });
          Slot17.setOnContextMenuRequested((rClick) -> {
           	if (Slot17.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[17],17);
           		refresh();
           	}
          });
          Slot18.setOnContextMenuRequested((rClick) -> {
           	if (Slot18.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[18],18);
           		refresh();
           	}
          });
          Slot19.setOnContextMenuRequested((rClick) -> {
           	if (Slot19.getText() != "Empty") {
           		getInv().dropFromSlot(p1.getInvList()[19],19);
           		refresh();
           	}
          });
   
          /**
           * This is part of the organized display list. It counts how many weapons, armor, and potions are equipped
           * and ensures only one unique item can be equipped. If there are too many items equipped 
           * of a specific type the last added item is removed.
           */
          for(int i = 0; i < ItemObjectListView.getItems().size(); i++) {
        	  if (ItemObjectListView.getItems().get(i).getItemType() == "Weapon") {
        		  if (weaponCount < 2) {
        		  weaponCount++;
        		  }
        		  else {
        			  MaxEquippedLabel.setText("Too many Weapons! Replaced Slot 1");
        			  MaxEquippedLabel.setOpacity(1);
        			  weaponCount--;
        			  ItemObjectListView.getItems().remove(i);
        			  StringEquippedListView.getItems().remove(i);
        			  
        		  }
        	  }
        	  else if (ItemObjectListView.getItems().get(i).getItemType() == "Armor") {
        		  if (armorCount < 1) {
        			  armorCount++;
        		  }
        		  else {
        			  MaxEquippedLabel.setText("Too much Armor");
        			  MaxEquippedLabel.setOpacity(1);
        			  ItemObjectListView.getItems().remove(i);
        			  StringEquippedListView.getItems().remove(i);
        		  }
        	  }
        	  else if (ItemObjectListView.getItems().get(i).getItemType() == "HP Potion") {
        		  if (HpPotionCount < 1) {
        			  HpPotionCount++;
        		  }
        		  else {
        			  MaxEquippedLabel.setText("Too many HP Potions");
        			  MaxEquippedLabel.setOpacity(1);
        			  ItemObjectListView.getItems().remove(i);
        			  StringEquippedListView.getItems().remove(i);
        		  	
        		 }
        	  }
        	  else if (ItemObjectListView.getItems().get(i).getItemType() == "Stam Potion") {
        		  if (StamPotionCount < 1) {
        			  StamPotionCount++;
        		  }
        		  else {
        			  MaxEquippedLabel.setText("Too many Stam Potions");
        			  MaxEquippedLabel.setOpacity(1);
        			  ItemObjectListView.getItems().remove(i);
        			  StringEquippedListView.getItems().remove(i);	  	
        		 }
        	  }
          }
          
        //Listview "un-equipping"
          /**
           * this code unequips items that are clicked on in the displayed list. Whichever index is clicked is removed
           * from the string and item object list views. The label is then set to opacity
           * 0 if it was displayed
           */
          StringEquippedListView.setOnMouseClicked((event) ->  {
        	  int unEquipIndex = StringEquippedListView.getSelectionModel().getSelectedIndex();
        	  if (unEquipIndex != -1) {
        		  StringEquippedListView.getItems().remove(unEquipIndex);
        		  ItemObjectListView.getItems().remove(unEquipIndex);
        	  }
        	  if (MaxEquippedLabel.getOpacity() == 1) {
        		  MaxEquippedLabel.setOpacity(0);
        	  }
        	  refresh();
          });
          
          /**
           * sets up an ArrayList filled with 5 "empty" slots
           */
          ArrayList<Item> EquippedArrayList = new ArrayList<Item>();
          for(int i = 0; i < 5;i++) {
          	EquippedArrayList.add(Empty);
          }
          
          /**
           * The code below rearranges the string and item object list views. This is for formatting the arrayList 
           * later. This is important for setting the equippedList for other controller classes.
           */
          for(int i = 0; i < ItemObjectListView.getItems().size();i++) {
          	if (ItemObjectListView.getItems().get(i).getItemType() == "Armor") {
          		if (EquippedArrayList.get(2) == Empty && EquippedArrayList.get(2) != ItemObjectListView.getItems().get(i)) {
          			EquippedArrayList.set(2, ItemObjectListView.getItems().get(i));
          		}
          		else {
          			EquippedArrayList.add(2, ItemObjectListView.getItems().get(i));
          		}
          	}
          	else if (ItemObjectListView.getItems().get(i).getItemType() == "Weapon" 
          			|| ItemObjectListView.getItems().get(i).getItemType() == "Key") {
          		if (EquippedArrayList.get(0) == Empty && EquippedArrayList.get(0) != ItemObjectListView.getItems().get(i)) {
          			EquippedArrayList.set(0,ItemObjectListView.getItems().get(i));
          		}
          		else if (EquippedArrayList.get(1) != ItemObjectListView.getItems().get(i) 
          				&& EquippedArrayList.get(0) != ItemObjectListView.getItems().get(i)){
          			EquippedArrayList.set(1,ItemObjectListView.getItems().get(i));
          		}
          	}
          	else if (ItemObjectListView.getItems().get(i).getItemType() == "HP Potion") {
          		if (EquippedArrayList.get(3) == Empty && EquippedArrayList.get(3) != ItemObjectListView.getItems().get(i)) {
          		EquippedArrayList.set(3,ItemObjectListView.getItems().get(i));
          		}
          	}
      		else if (ItemObjectListView.getItems().get(i).getItemType() == "Stam Potion") {
          		if (EquippedArrayList.get(4) == Empty && EquippedArrayList.get(4) != ItemObjectListView.getItems().get(i)) {
          		EquippedArrayList.set(4,ItemObjectListView.getItems().get(i));
          		}
          	}
          }
          //this code removes an item from the equipped list and inventory list when durability reaches 0 after battle
          for(int i = 0; i < 5; i++) {
  	    	if (ItemObjectListView.getItems().size() > i) {
  	    		if(EquippedArrayList.get(i).getItemType() != "Empty" && 
  	    				EquippedArrayList.get(i).getDuribility() <=0) {
  	    			StringEquippedListView.getItems().remove(i);
      	    		ItemObjectListView.getItems().remove(i);
      	    		getInv().dropFromInv(EquippedArrayList.get(i));
      	    		EquippedArrayList.remove(i);
  	    		}      	    		
  	    		  	    		
  	    	}
          }
          StringEquippedListView.getItems().clear();
          ItemObjectListView.getItems().clear();
          Item[] EquippedArray = new Item[5];
          for(int i = 0; i < 5; i++) {
          	StringEquippedListView.getItems().addAll(EquippedArrayList.get(i).getName());
          	ItemObjectListView.getItems().addAll(EquippedArrayList.get(i));
            //Changing arraylist into normal array for setEquippedList method
          	EquippedArray[i] = EquippedArrayList.get(i);
          	}
          setEquippedList(EquippedArray);
          
         if (getEquippedList()[3].getItemType() == "HP Potion") {
      		UsePotionButton.setOpacity(1);
      		UsePotionButton.setMouseTransparent(false);
      	 }
      	 else {
      		 UsePotionButton.setOpacity(0);
      		 UsePotionButton.setMouseTransparent(true);
      	 }
   }	
}