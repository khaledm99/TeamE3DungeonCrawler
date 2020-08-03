package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import model.Inventory;
import model.Item;
import model.Entity;

public class InventoryController extends GameController{
	
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
    void initialize() {
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
    	//the inventory set up here will be moved once we continue working on those classes
    	//So far I set up the inventory of "Xavier" and set his HP. Ideally this is done initially in Main.
    	String playerName;
    	Entity Xavier = new Entity();
    	Xavier.setHp(10);
    	Xavier.setName("Xavier");
    	playerName = Xavier.getName();
    	double healthBar = Xavier.getHp() / Double.valueOf(TotalHPLabel.getText());
    	HealthLeftLabel.setText(Xavier.getHp() + "");
    	HealthBarProgressBar.setProgress(healthBar);
    	
    	

    	
    	Inventory p1 = new Inventory(playerName);
    	p1.addToInv(p1, p1.getIronSword());
    	p1.addToInv(p1, p1.getFlamingSword());
    	p1.addToInv(p1, p1.getSilverSword());
    	p1.addToInv(p1, p1.getWoodenSword());
    	p1.addToInv(p1, p1.getIronSword());
    	p1.addToInv(p1, p1.getFlamingSword());
    	p1.addToInv(p1, p1.getSilverSword());
    	p1.addToInv(p1, p1.getWoodenSword());
    	p1.addToInv(p1, p1.getIronSword());
    	p1.addToInv(p1, p1.getFlamingSword());
    	p1.addToInv(p1, p1.getSilverSword());
    	p1.addToInv(p1, p1.getWoodenSword());
    	p1.addToInv(p1, p1.getSilverSword());
    	p1.addToInv(p1, p1.getWoodenSword());
    	p1.addToInv(p1, p1.getIronSword());
    	p1.addToInv(p1, p1.getFlamingSword());
    	p1.addToInv(p1, p1.getSilverSword());
    	p1.addToInv(p1, p1.getWoodenSword());
    	
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
        
        /*
         * The following code implements button presses and adds the type Item objects to 
         * two ListViews. One for the Item display names. The other to store the Item data and indices.
         * If the slot is labeled empty no Item will be added to the EquippedListView. Every time a button is 
         * pressed the ItemObjectListView must only have 3 or less items stored in it, otherwise
         * nothing will be added and a Label will become visible. From what I understand there is no way to make this code repeat less... 
         * Added mouse enter and exit functionality to allow user to check stats of Items
         * 
         */
        
        Slot0.setOnMouseClicked((event) -> {
        	if(Slot0.getText() != "Empty") {
        		if (ItemObjectListView.getItems().size() <5) {
        			ItemObjectListView.getItems().addAll(p1.getInvList()[0]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[0].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
    	
        Slot0.setOnMouseEntered((event) -> {
        	if (Slot0.getText() != "Empty") {
        		DmgSlot0.setText(String.valueOf(p1.getInvList()[0].getDamage()));
        		DurSlot0.setText(String.valueOf(p1.getInvList()[0].getDuribility()));
        		VboxSlot0.setOpacity(1);    
        	}
        });
        Slot0.setOnMouseExited((event) -> {
        	VboxSlot0.setOpacity(0);        	
        });
        
        
        
          Slot1.setOnAction((event) -> {
  	    	 if(Slot1.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[1]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[1].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot1.setOnMouseEntered((event) -> {
          	if (Slot1.getText() != "Empty") {
          		DmgSlot01.setText(String.valueOf(p1.getInvList()[1].getDamage()));
          		DurSlot01.setText(String.valueOf(p1.getInvList()[1].getDuribility()));
          		VboxSlot1.setOpacity(1);    
          	}
          });
          Slot1.setOnMouseExited((event) -> {
          	VboxSlot1.setOpacity(0);        	
          });         
         
          Slot2.setOnAction((event) -> {
  	    	 if(Slot2.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[2]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[2].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
           
          Slot2.setOnMouseEntered((event) -> {
            	if (Slot2.getText() != "Empty") {
            		DmgSlot02.setText(String.valueOf(p1.getInvList()[2].getDamage()));
            		DurSlot02.setText(String.valueOf(p1.getInvList()[2].getDuribility()));
            		VboxSlot2.setOpacity(1);    
            	}
            });
            Slot2.setOnMouseExited((event) -> {
            	VboxSlot2.setOpacity(0);        	
            });   
            
          Slot3.setOnAction((event) -> {
  	    	 if(Slot3.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[3]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[3].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot3.setOnMouseEntered((event) -> {
          	if (Slot3.getText() != "Empty") {
          		DmgSlot03.setText(String.valueOf(p1.getInvList()[3].getDamage()));
          		DurSlot03.setText(String.valueOf(p1.getInvList()[3].getDuribility()));
          		VboxSlot3.setOpacity(1);    
          	}
          });
          Slot3.setOnMouseExited((event) -> {
          	VboxSlot3.setOpacity(0);        	
          });
           
          Slot4.setOnAction((event) -> {
  	    	 if(Slot4.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[4]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[4].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot4.setOnMouseEntered((event) -> {
          	if (Slot4.getText() != "Empty") {
          		DmgSlot04.setText(String.valueOf(p1.getInvList()[4].getDamage()));
          		DurSlot04.setText(String.valueOf(p1.getInvList()[4].getDuribility()));
          		VboxSlot4.setOpacity(1);    
          	}
          });
          Slot4.setOnMouseExited((event) -> {
          	VboxSlot4.setOpacity(0);        	
          });
          
          Slot5.setOnAction((event) -> {
  	    	 if(Slot5.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[5]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[5].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
           
          Slot5.setOnMouseEntered((event) -> {
          	if (Slot5.getText() != "Empty") {
          		DmgSlot05.setText(String.valueOf(p1.getInvList()[5].getDamage()));
          		DurSlot05.setText(String.valueOf(p1.getInvList()[5].getDuribility()));
          		VboxSlot5.setOpacity(1);    
          	}
          });
          Slot5.setOnMouseExited((event) -> {
          	VboxSlot5.setOpacity(0);        	
          });
          
          Slot6.setOnAction((event) -> {
  	    	 if(Slot6.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[6]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[6].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
         
          Slot6.setOnMouseEntered((event) -> {
            	if (Slot6.getText() != "Empty") {
            		DmgSlot06.setText(String.valueOf(p1.getInvList()[6].getDamage()));
            		DurSlot06.setText(String.valueOf(p1.getInvList()[6].getDuribility()));
            		VboxSlot6.setOpacity(1);    
            	}
            });
            Slot6.setOnMouseExited((event) -> {
            	VboxSlot6.setOpacity(0);        	
            });
            
          Slot7.setOnAction((event) -> {
  	    	 if(Slot7.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[7]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[7].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
         
          Slot7.setOnMouseEntered((event) -> {
            	if (Slot7.getText() != "Empty") {
            		DmgSlot07.setText(String.valueOf(p1.getInvList()[7].getDamage()));
            		DurSlot07.setText(String.valueOf(p1.getInvList()[7].getDuribility()));
            		VboxSlot7.setOpacity(1);    
            	}
            });
            Slot7.setOnMouseExited((event) -> {
            	VboxSlot7.setOpacity(0);        	
            });
          Slot8.setOnAction((event) -> {
  	    	 if(Slot8.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[8]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[8].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot8.setOnMouseEntered((event) -> {
          	if (Slot8.getText() != "Empty") {
          		DmgSlot08.setText(String.valueOf(p1.getInvList()[8].getDamage()));
          		DurSlot08.setText(String.valueOf(p1.getInvList()[8].getDuribility()));
          		VboxSlot8.setOpacity(1);    
          	}
          });
          Slot8.setOnMouseExited((event) -> {
          	VboxSlot8.setOpacity(0);        	
          });
           
          Slot9.setOnAction((event) -> {
  	    	 if(Slot9.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[9]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[9].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
           
          Slot9.setOnMouseEntered((event) -> {
            	if (Slot9.getText() != "Empty") {
            		DmgSlot09.setText(String.valueOf(p1.getInvList()[9].getDamage()));
            		DurSlot09.setText(String.valueOf(p1.getInvList()[9].getDuribility()));
            		VboxSlot9.setOpacity(1);    
            	}
            });
            Slot9.setOnMouseExited((event) -> {
            	VboxSlot9.setOpacity(0);        	
            });
            
          Slot10.setOnAction((event) -> {
  	    	 if(Slot10.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[10]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[10].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          
          Slot10.setOnMouseEntered((event) -> {
            	if (Slot10.getText() != "Empty") {
            		DmgSlot10.setText(String.valueOf(p1.getInvList()[10].getDamage()));
            		DurSlot10.setText(String.valueOf(p1.getInvList()[10].getDuribility()));
            		VboxSlot10.setOpacity(1);    
            	}
            });
            Slot10.setOnMouseExited((event) -> {
            	VboxSlot10.setOpacity(0);        	
            });
          Slot11.setOnAction((event) -> {
  	    	 if(Slot11.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[11]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[11].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          Slot11.setOnMouseEntered((event) -> {
          	if (Slot11.getText() != "Empty") {
          		DmgSlot11.setText(String.valueOf(p1.getInvList()[11].getDamage()));
          		DurSlot11.setText(String.valueOf(p1.getInvList()[11].getDuribility()));
          		VboxSlot11.setOpacity(1);    
          	}
          });
          Slot11.setOnMouseExited((event) -> {
          	VboxSlot11.setOpacity(0);        	
          });
          
          Slot12.setOnAction((event) -> {
  	    	 if(Slot12.getText() != "Empty") {
  	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[12]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[12].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
  	    	 }
  	     });
          Slot12.setOnMouseEntered((event) -> {
          	if (Slot12.getText() != "Empty") {
          		DmgSlot12.setText(String.valueOf(p1.getInvList()[12].getDamage()));
          		DurSlot12.setText(String.valueOf(p1.getInvList()[12].getDuribility()));
          		VboxSlot12.setOpacity(1);    
          	}
          });
          Slot12.setOnMouseExited((event) -> {
          	VboxSlot12.setOpacity(0);        	
          });
          
          Slot13.setOnAction((event) -> {
   	    	 if(Slot13.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[13]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[13].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot13.setOnMouseEntered((event) -> {
          	if (Slot13.getText() != "Empty") {
          		DmgSlot13.setText(String.valueOf(p1.getInvList()[13].getDamage()));
          		DurSlot13.setText(String.valueOf(p1.getInvList()[13].getDuribility()));
          		VboxSlot13.setOpacity(1);    
          	}
          });
          Slot13.setOnMouseExited((event) -> {
          	VboxSlot13.setOpacity(0);        	
          });
          
          Slot14.setOnAction((event) -> {
   	    	 if(Slot14.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[14]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[14].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot14.setOnMouseEntered((event) -> {
          	if (Slot14.getText() != "Empty") {
          		DmgSlot14.setText(String.valueOf(p1.getInvList()[14].getDamage()));
          		DurSlot14.setText(String.valueOf(p1.getInvList()[14].getDuribility()));
          		VboxSlot14.setOpacity(1);    
          	}
          });
          Slot14.setOnMouseExited((event) -> {
          	VboxSlot14.setOpacity(0);        	
          });
          
          Slot15.setOnAction((event) -> {
   	    	 if(Slot15.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[15]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[15].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot15.setOnMouseEntered((event) -> {
          	if (Slot15.getText() != "Empty") {
          		DmgSlot15.setText(String.valueOf(p1.getInvList()[15].getDamage()));
          		DurSlot15.setText(String.valueOf(p1.getInvList()[15].getDuribility()));
          		VboxSlot15.setOpacity(1);    
          	}
          });
          Slot15.setOnMouseExited((event) -> {
          	VboxSlot15.setOpacity(0);        	
          });
          
          Slot16.setOnAction((event) -> {
   	    	 if(Slot16.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[16]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[16].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot16.setOnMouseEntered((event) -> {
          	if (Slot16.getText() != "Empty") {
          		DmgSlot16.setText(String.valueOf(p1.getInvList()[16].getDamage()));
          		DurSlot16.setText(String.valueOf(p1.getInvList()[16].getDuribility()));
          		VboxSlot16.setOpacity(1);    
          	}
          });
          Slot16.setOnMouseExited((event) -> {
          	VboxSlot16.setOpacity(0);        	
          });
          
          Slot17.setOnAction((event) -> {
   	    	 if(Slot17.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[17]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[17].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot17.setOnMouseEntered((event) -> {
          	if (Slot17.getText() != "Empty") {
          		DmgSlot17.setText(String.valueOf(p1.getInvList()[17].getDamage()));
          		DurSlot17.setText(String.valueOf(p1.getInvList()[17].getDuribility()));
          		VboxSlot17.setOpacity(1);    
          	}
          });
          Slot17.setOnMouseExited((event) -> {
          	VboxSlot17.setOpacity(0);        	
          });
          
          Slot18.setOnAction((event) -> {
   	    	 if(Slot18.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[18]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[18].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot18.setOnMouseEntered((event) -> {
          	if (Slot18.getText() != "Empty") {
          		DmgSlot18.setText(String.valueOf(p1.getInvList()[18].getDamage()));
          		DurSlot18.setText(String.valueOf(p1.getInvList()[18].getDuribility()));
          		VboxSlot18.setOpacity(1);    
          	}
          });
          Slot18.setOnMouseExited((event) -> {
          	VboxSlot18.setOpacity(0);        	
          });
          
          Slot19.setOnAction((event) -> {
   	    	 if(Slot19.getText() != "Empty") {
   	    		if (ItemObjectListView.getItems().size() <5) {
  	    		 	ItemObjectListView.getItems().addAll(p1.getInvList()[19]);
        			StringEquippedListView.getItems().addAll(p1.getInvList()[19].getName());
  	    		 }
        		else {MaxEquippedLabel.setOpacity(1);}
   	    	 }
   	     });
          Slot19.setOnMouseEntered((event) -> {
          	if (Slot19.getText() != "Empty") {
          		DmgSlot19.setText(String.valueOf(p1.getInvList()[19].getDamage()));
          		DurSlot19.setText(String.valueOf(p1.getInvList()[19].getDuribility()));
          		VboxSlot19.setOpacity(1);    
          	}
          });
          Slot19.setOnMouseExited((event) -> {
          	VboxSlot19.setOpacity(0);        	
          });
          
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
          });
         
    

    }     
}



