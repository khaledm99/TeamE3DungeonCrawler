package application;
import model.Inventory;
import model.Item;
import model.Map;
import model.Player;
import model.Combat;
import model.Enemy;

public abstract class GameController {
	protected GuiMain app;
	protected InventoryController inv;
	
	public abstract void refresh();

	public void setGuiMainApp(GuiMain app) {
		this.app = app;
		refresh();
	}
	protected Inventory getInv() {
		return application.GuiMain.getP1Inv();
	}
	protected void setInvList(Inventory anInvList) {
		application.GuiMain.setP1Inv(anInvList);
	}
	protected Player getPlayer() {
		return application.GuiMain.getP1();
	}
	protected void setPlayer(Player aPlayer) {
		application.GuiMain.setP1(aPlayer);
	}
	protected Enemy getEnemy() {
		return application.GuiMain.getEnemy();
	}
	protected void setEquippedList(Item[] aList) {
		application.GuiMain.setEquippedList(aList);
	}
	protected Item[] getEquippedList() {
		return application.GuiMain.getEquippedList();
	}
	protected Boolean getOnEnemy() {
		return application.GuiMain.getOnEnemy();
	}
	public void setInvCon(InventoryController inv) {
		this.inv = inv;
		refresh();
	}
	
	//protected Combat getCombatScreen() {
	//	return application.GuiMain.get;
	
	//}

	
	
}
