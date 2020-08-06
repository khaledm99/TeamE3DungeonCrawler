package application;
import model.Inventory;
import model.Item;
import model.Player;
import model.Enemy;

public abstract class GameController {
	protected GuiMain app;
	
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
	
	protected Boolean getCombatScreen() {
		if (application.GuiMain.getOnEnemy()) {
			refresh();
		}
		return application.GuiMain.getOnEnemy();
	}

	
	
}
