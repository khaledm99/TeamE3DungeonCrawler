package application;
import model.Entity;
import model.Inventory;
import model.Item;
import model.Player;

public abstract class GameController {
	private GuiMain app;
	
	public abstract void refresh();

	public void setGuiMainApp(GuiMain app) {
		this.app = app;
		refresh();
	}
	protected Inventory getInv() {
		return app.getP1Inv();
	}
	protected void setInvList(Inventory anInvList) {
		app.setP1Inv(anInvList);
	}
	protected Player getPlayer() {
		return app.getP1();
	}
	protected void setPlayer(Player aPlayer) {
		app.setP1(aPlayer);
	}
	protected void setEquippedList(Item[] aList) {
		app.setEquippedList(aList);
	}
	protected Item[] getEquippedList() {
		return app.getEquippedList();
	}
	
	
}
