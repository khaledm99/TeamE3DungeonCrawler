package application;
import model.Enemy;
import model.Inventory;
import model.Item;
import model.Map;
import model.Player;

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
	protected void setEquippedList(Item[] aList) {
		application.GuiMain.setEquippedList(aList);
	}
	protected Item[] getEquippedList() {
		return application.GuiMain.getEquippedList();
	}
	
	
	
}
