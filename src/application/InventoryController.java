package application;

import java.io.File;
import java.util.ArrayList;
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
    void initialize() {
    	refresh();
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
        int potionCount = 0;
        
        
        /*
         * The following code implements button presses and adds the type Item objects to 
         * two ListViews. One for the Item display names. The other to store the Item data and indices.
         * If the slot is labeled empty no Item will be added to the EquippedListView. Every time a button is 
         * pressed the ItemObjectListView must only have 3 or less items stored in it, otherwise
         * nothing will be added and a Label will become visible. From what I understand there is no way to make this code repeat less... 
         * Added mouse enter and exit functionality to allow user to check stats of Items
         * 
         */
       Item Empty = p1.getEmpty();
        Slot0.setOnMouseClicked((event) -> {
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
    	
        Slot0.setOnMouseEntered((event) -> {
        	File file = new File(p1.getInvList()[0].getImagePath());
    		Image slot0Image = new Image(file.toURI().toString());
        	if (Slot0.getText() != "Empty") {
        		DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getDamage()));
        		DurSlot0.setText(String.valueOf(p1.getInvList()[0].getDuribility()));
        		Slot0ImageView.setImage(slot0Image);
        		VboxSlot0.setOpacity(1);    
        		if (p1.getInvList()[0].getItemType() == "Potion") {
          			DmgLabelSlot0.setText(" HP  ");
          			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getPotionHP()));
            		Slot0ImageView.setImage(slot0Image);

          		}
        		else if (p1.getInvList()[0].getItemType() == "Armor") {
          			DmgLabelSlot0.setText(" AP  ");
          			DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getArmorHP()));
            		Slot0ImageView.setImage(slot0Image);

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
        	File file = new File(p1.getInvList()[1].getImagePath());
      		Image slot1Image = new Image(file.toURI().toString());
          	if (Slot1.getText() != "Empty") {
          		DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getDamage()));
          		DurSlot01.setText(String.valueOf(p1.getInvList()[1].getDuribility()));
        		Slot1ImageView.setImage(slot1Image);
          		VboxSlot1.setOpacity(1);    
          		if (p1.getInvList()[1].getItemType() == "Potion") {
          			DmgLabelSlot1.setText(" HP  ");
          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getPotionHP()));
            		Slot1ImageView.setImage(slot1Image);
          		}
          		else if (p1.getInvList()[1].getItemType() == "Armor") {
          			DmgLabelSlot1.setText(" AP  ");
          			DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getArmorHP()));
            		Slot1ImageView.setImage(slot1Image);
          		}
          	}
          });
          Slot1.setOnMouseExited((event) -> {
          	VboxSlot1.setOpacity(0);        	
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
        	File file = new File(p1.getInvList()[2].getImagePath());
        	Image slot2Image = new Image(file.toURI().toString());
            	if (Slot2.getText() != "Empty") {
            		DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getDamage()));
            		DurSlot02.setText(String.valueOf(p1.getInvList()[2].getDuribility()));
            		Slot2ImageView.setImage(slot2Image);
            		VboxSlot2.setOpacity(1);    
            		if (p1.getInvList()[2].getItemType() == "Potion") {
              			DmgLabelSlot2.setText(" HP  ");
              			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getPotionHP()));
                		Slot2ImageView.setImage(slot2Image);
              		}
            		else if (p1.getInvList()[2].getItemType() == "Armor") {
              			DmgLabelSlot2.setText(" AP  ");
              			DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getArmorHP()));
                		Slot2ImageView.setImage(slot2Image);
              		}
            	}
            });
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
        	File file = new File(p1.getInvList()[3].getImagePath());
          	Image slot3Image = new Image(file.toURI().toString());
          	if (Slot3.getText() != "Empty") {
          		DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getDamage()));
          		DurSlot03.setText(String.valueOf(p1.getInvList()[3].getDuribility()));
//        		Slot3ImageView.setImage(slot3Image);
          		VboxSlot3.setOpacity(1);    
          		if (p1.getInvList()[3].getItemType() == "Potion") {
          			DmgLabelSlot3.setText(" HP  ");
          			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getPotionHP()));
            		Slot3ImageView.setImage(slot3Image);
          		}
          		else if (p1.getInvList()[3].getItemType() == "Armor") {
          			DmgLabelSlot3.setText(" AP  ");
          			DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getArmorHP()));
            		Slot3ImageView.setImage(slot3Image);
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
          	File file = new File(p1.getInvList()[4].getImagePath());
          	Image slot4Image = new Image(file.toURI().toString());
          	if (Slot4.getText() != "Empty") {
          		DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getDamage()));
          		DurSlot04.setText(String.valueOf(p1.getInvList()[4].getDuribility()));
        		Slot4ImageView.setImage(slot4Image);
          		VboxSlot4.setOpacity(1);    
          		if (p1.getInvList()[4].getItemType() == "Potion") {
          			DmgLabelSlot4.setText(" HP  ");
          			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getPotionHP()));
            		Slot4ImageView.setImage(slot4Image);
          		}
          		else if (p1.getInvList()[4].getItemType() == "Armor") {
          			DmgLabelSlot4.setText(" AP  ");
          			DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getArmorHP()));
            		Slot4ImageView.setImage(slot4Image);
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
        	File file = new File(p1.getInvList()[5].getImagePath());
            Image slot5Image = new Image(file.toURI().toString());
          	if (Slot5.getText() != "Empty") {
          		DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getDamage()));
          		DurSlot05.setText(String.valueOf(p1.getInvList()[5].getDuribility()));
        		Slot5ImageView.setImage(slot5Image);
          		VboxSlot5.setOpacity(1);    
          		if (p1.getInvList()[5].getItemType() == "Potion") {
          			DmgLabelSlot5.setText(" HP  ");
          			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getPotionHP()));
            		Slot5ImageView.setImage(slot5Image);
          		}
          		else if (p1.getInvList()[5].getItemType() == "Armor") {
          			DmgLabelSlot5.setText(" AP  ");
          			DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getArmorHP()));
            		Slot5ImageView.setImage(slot5Image);
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
          	File file = new File(p1.getInvList()[6].getImagePath());
            Image slot6Image = new Image(file.toURI().toString());
            	if (Slot6.getText() != "Empty") {
            		DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getDamage()));
            		DurSlot06.setText(String.valueOf(p1.getInvList()[6].getDuribility()));
            		Slot6ImageView.setImage(slot6Image);
            		VboxSlot6.setOpacity(1);    
            		if (p1.getInvList()[6].getItemType() == "Potion") {
              			DmgLabelSlot6.setText(" HP  ");
              			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getPotionHP()));
                		Slot6ImageView.setImage(slot6Image);
              		}
              		else if (p1.getInvList()[6].getItemType() == "Armor") {
              			DmgLabelSlot6.setText(" AP  ");
              			DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getArmorHP()));
                		Slot6ImageView.setImage(slot6Image);
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
        	  File file = new File(p1.getInvList()[7].getImagePath());
              Image slot7Image = new Image(file.toURI().toString());
            	if (Slot7.getText() != "Empty") {
            		DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getDamage()));
            		DurSlot07.setText(String.valueOf(p1.getInvList()[7].getDuribility()));
            		Slot7ImageView.setImage(slot7Image);
            		VboxSlot7.setOpacity(1);    
            		if (p1.getInvList()[7].getItemType() == "Potion") {
              			DmgLabelSlot7.setText(" HP  ");
              			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getPotionHP()));
                		Slot7ImageView.setImage(slot7Image);
              		}
              		else if (p1.getInvList()[7].getItemType() == "Armor") {
              			DmgLabelSlot7.setText(" AP  ");
              			DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getArmorHP()));
                		Slot7ImageView.setImage(slot7Image);
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
        	  File file = new File(p1.getInvList()[8].getImagePath());
              Image slot8Image = new Image(file.toURI().toString());
          	if (Slot8.getText() != "Empty") {
          		DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getDamage()));
          		DurSlot08.setText(String.valueOf(p1.getInvList()[8].getDuribility()));
        		Slot8ImageView.setImage(slot8Image);
          		VboxSlot8.setOpacity(1);  
          		if (p1.getInvList()[8].getItemType() == "Potion") {
          			DmgLabelSlot8.setText(" HP  ");
          			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getPotionHP()));
            		Slot8ImageView.setImage(slot8Image);
          		}
          		else if (p1.getInvList()[8].getItemType() == "Armor") {
          			DmgLabelSlot8.setText(" AP  ");
          			DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getArmorHP()));
            		Slot8ImageView.setImage(slot8Image);
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
        	  File file = new File(p1.getInvList()[9].getImagePath());
              Image slot9Image = new Image(file.toURI().toString());
            	if (Slot9.getText() != "Empty") {
            		DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getDamage()));
            		DurSlot09.setText(String.valueOf(p1.getInvList()[9].getDuribility()));
            		Slot9ImageView.setImage(slot9Image);
            		VboxSlot9.setOpacity(1);    
            		if (p1.getInvList()[9].getItemType() == "Potion") {
              			DmgLabelSlot9.setText(" HP  ");
              			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getPotionHP()));
                		Slot9ImageView.setImage(slot9Image);
              		}
              		else if (p1.getInvList()[9].getItemType() == "Armor") {
              			DmgLabelSlot9.setText(" AP  ");
              			DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getArmorHP()));
                		Slot9ImageView.setImage(slot9Image);
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
        	  File file = new File(p1.getInvList()[10].getImagePath());
              Image slot10Image = new Image(file.toURI().toString());
            	if (Slot10.getText() != "Empty") {
            		DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getDamage()));
            		DurSlot10.setText(String.valueOf(p1.getInvList()[10].getDuribility()));
            		Slot10ImageView.setImage(slot10Image);
            		VboxSlot10.setOpacity(1);  
            		if (p1.getInvList()[10].getItemType() == "Potion") {
              			DmgLabelSlot10.setText(" HP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getPotionHP()));
                		Slot10ImageView.setImage(slot10Image);
              		}
              		else if (p1.getInvList()[10].getItemType() == "Armor") {
              			DmgLabelSlot10.setText(" AP  ");
              			DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getArmorHP()));
                		Slot10ImageView.setImage(slot10Image);
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
        	  File file = new File(p1.getInvList()[11].getImagePath());
              Image slot11Image = new Image(file.toURI().toString());
          	if (Slot11.getText() != "Empty") {
          		DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getDamage()));
          		DurSlot11.setText(String.valueOf(p1.getInvList()[11].getDuribility()));
        		Slot11ImageView.setImage(slot11Image);
          		VboxSlot11.setOpacity(1);  
          		if (p1.getInvList()[11].getItemType() == "Potion") {
          			DmgLabelSlot11.setText(" HP  ");
          			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getPotionHP()));
            		Slot11ImageView.setImage(slot11Image);
          		}
          		else if (p1.getInvList()[11].getItemType() == "Armor") {
          			DmgLabelSlot11.setText(" AP  ");
          			DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getArmorHP()));
            		Slot11ImageView.setImage(slot11Image);
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
        	  File file = new File(p1.getInvList()[12].getImagePath());
              Image slot12Image = new Image(file.toURI().toString());
          	if (Slot12.getText() != "Empty") {
          		DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getDamage()));
          		DurSlot12.setText(String.valueOf(p1.getInvList()[12].getDuribility()));
        		Slot12ImageView.setImage(slot12Image);
          		VboxSlot12.setOpacity(1);    
          		if (p1.getInvList()[12].getItemType() == "Potion") {
          			DmgLabelSlot12.setText(" HP  ");
          			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getPotionHP()));
            		Slot12ImageView.setImage(slot12Image);
          		}
          		else if (p1.getInvList()[12].getItemType() == "Armor") {
          			DmgLabelSlot12.setText(" AP  ");
          			DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getArmorHP()));
            		Slot12ImageView.setImage(slot12Image);
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
        	  File file = new File(p1.getInvList()[13].getImagePath());
              Image slot13Image = new Image(file.toURI().toString());
          	if (Slot13.getText() != "Empty") {
          		DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getDamage()));
          		DurSlot13.setText(String.valueOf(p1.getInvList()[13].getDuribility()));
        		Slot13ImageView.setImage(slot13Image);
          		VboxSlot13.setOpacity(1);    
          		if (p1.getInvList()[13].getItemType() == "Potion") {
          			DmgLabelSlot13.setText(" HP  ");
          			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getPotionHP()));
            		Slot13ImageView.setImage(slot13Image);
          		}
          		else if (p1.getInvList()[13].getItemType() == "Armor") {
          			DmgLabelSlot13.setText(" AP  ");
          			DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getArmorHP()));
            		Slot13ImageView.setImage(slot13Image);
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
        	  File file = new File(p1.getInvList()[14].getImagePath());
              Image slot14Image = new Image(file.toURI().toString());
          	if (Slot14.getText() != "Empty") {
          		DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getDamage()));
          		DurSlot14.setText(String.valueOf(p1.getInvList()[14].getDuribility()));
          		Slot14ImageView.setImage(slot14Image);
          		VboxSlot14.setOpacity(1);    
          		if (p1.getInvList()[14].getItemType() == "Potion") {
          			DmgLabelSlot14.setText(" HP  ");
          			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getPotionHP()));
              		Slot14ImageView.setImage(slot14Image);
          		}
          		else if (p1.getInvList()[14].getItemType() == "Armor") {
          			DmgLabelSlot14.setText(" AP  ");
          			DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getArmorHP()));
              		Slot14ImageView.setImage(slot14Image);
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
        	  File file = new File(p1.getInvList()[15].getImagePath());
              Image slot15Image = new Image(file.toURI().toString());
          	if (Slot15.getText() != "Empty") {
          		DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getDamage()));
          		DurSlot15.setText(String.valueOf(p1.getInvList()[15].getDuribility()));
          		Slot15ImageView.setImage(slot15Image);
          		VboxSlot15.setOpacity(1);    
          		if (p1.getInvList()[15].getItemType() == "Potion") {
          			DmgLabelSlot15.setText(" HP  ");
          			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getPotionHP()));
              		Slot15ImageView.setImage(slot15Image);
          		}
          		else if (p1.getInvList()[15].getItemType() == "Armor") {
          			DmgLabelSlot15.setText(" AP  ");
          			DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getArmorHP()));
              		Slot15ImageView.setImage(slot15Image);
          		}
          	}
          });
          Slot15.setOnMouseExited((event) -> {
          	VboxSlot15.setOpacity(0);        	
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
        	  File file = new File(p1.getInvList()[16].getImagePath());
              Image slot16Image = new Image(file.toURI().toString());
          	if (Slot16.getText() != "Empty") {
          		DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getDamage()));
          		DurSlot16.setText(String.valueOf(p1.getInvList()[16].getDuribility()));
          		Slot16ImageView.setImage(slot16Image);
          		VboxSlot16.setOpacity(1);    
          		if (p1.getInvList()[16].getItemType() == "Potion") {
          			DmgLabelSlot16.setText(" HP  ");
          			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getPotionHP()));
              		Slot16ImageView.setImage(slot16Image);
          		}
          		else if (p1.getInvList()[16].getItemType() == "Armor") {
          			DmgLabelSlot16.setText(" AP  ");
          			DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getArmorHP()));
              		Slot16ImageView.setImage(slot16Image);
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
          		DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getDamage()));
          		DurSlot17.setText(String.valueOf(p1.getInvList()[17].getDuribility()));
          		VboxSlot17.setOpacity(1);   
          		if (p1.getInvList()[17].getItemType() == "Potion") {
          			DmgLabelSlot17.setText(" HP  ");
          			DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getPotionHP()));
          		}
          		else if (p1.getInvList()[17].getItemType() == "Armor") {
          			DmgLabelSlot17.setText(" AP  ");
          			DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getArmorHP()));
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
          		DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getDamage()));
          		DurSlot18.setText(String.valueOf(p1.getInvList()[18].getDuribility()));
          		VboxSlot18.setOpacity(1);
          		if (p1.getInvList()[18].getItemType() == "Potion") {
          			DmgLabelSlot18.setText(" HP  ");
          			DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getPotionHP()));
          		}
          		else if (p1.getInvList()[18].getItemType() == "Armor") {
          			DmgLabelSlot18.setText(" AP  ");
          			DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getArmorHP()));
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
          		DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getDamage()));
          		DurSlot19.setText(String.valueOf(p1.getInvList()[19].getDuribility()));
          		VboxSlot19.setOpacity(1);
          		if (p1.getInvList()[19].getItemType() == "Potion") {
          			DmgLabelSlot19.setText(" HP  ");
          			DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getPotionHP()));
          		}
          		else if (p1.getInvList()[19].getItemType() == "Armor") {
          			DmgLabelSlot19.setText(" AP  ");
          			DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getArmorHP()));
          		}
          	}
          });
          Slot19.setOnMouseExited((event) -> {
          	VboxSlot19.setOpacity(0);        	
          });
   
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
        	  else if (ItemObjectListView.getItems().get(i).getItemType() == "Potion") {
        		  if (potionCount < 2) {
        			  potionCount++;
        		  }
        		  else {
        			  MaxEquippedLabel.setText("Too many Potions");
        			  MaxEquippedLabel.setOpacity(1);
        			  ItemObjectListView.getItems().remove(i);
        			  StringEquippedListView.getItems().remove(i);
        		  	
        		 }
        	  }
          }
          
        //Listview "un-equipping"
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
          
          
          ArrayList<Item> EquippedArrayList = new ArrayList<Item>();
          for(int i = 0; i < 5;i++) {
          	EquippedArrayList.add(Empty);
          }
          for(int i = 0; i < ItemObjectListView.getItems().size();i++) {
          	if (ItemObjectListView.getItems().get(i).getItemType() == "Armor") {
          		if (EquippedArrayList.get(2) == Empty && EquippedArrayList.get(2) != ItemObjectListView.getItems().get(i)) {
          			EquippedArrayList.set(2, ItemObjectListView.getItems().get(i));
          		}
          		else {
          			EquippedArrayList.add(2, ItemObjectListView.getItems().get(i));
          		}
          	}
          	else if (ItemObjectListView.getItems().get(i).getItemType() == "Weapon") {
          		if (EquippedArrayList.get(0) == Empty && EquippedArrayList.get(0) != ItemObjectListView.getItems().get(i)) {
          			EquippedArrayList.set(0,ItemObjectListView.getItems().get(i));
          		}
          		else if (EquippedArrayList.get(1) != ItemObjectListView.getItems().get(i) 
          				&& EquippedArrayList.get(0) != ItemObjectListView.getItems().get(i)){
          			EquippedArrayList.set(1,ItemObjectListView.getItems().get(i));
          		}
          	}
          	else if (ItemObjectListView.getItems().get(i).getItemType() == "Potion") {
          		if (EquippedArrayList.get(3) == Empty && EquippedArrayList.get(3) != ItemObjectListView.getItems().get(i)) {
          		EquippedArrayList.set(3,ItemObjectListView.getItems().get(i));
          		}
          		else if (EquippedArrayList.get(4) != ItemObjectListView.getItems().get(i)
          				&& EquippedArrayList.get(3) != ItemObjectListView.getItems().get(i)) {
              		EquippedArrayList.set(4,ItemObjectListView.getItems().get(i));
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
          

          
          
        
    }
    
	
	
	
}



