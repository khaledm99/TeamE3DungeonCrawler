package application;
import model.Entity;
import model.Item;

public abstract class GameController {
	private GuiMain app;
	
	public abstract void refresh();

	public void setPollTrackerApp(GuiMain app) {
		this.app = app;
		refresh();
	}
	
	protected Item[] getInvList() {
		return app.getP1Inv();
	}
	protected void setInvList(Item[] anInvList) {
		app.setP1Inv(anInvList);
	}
	
	protected Entity getPlayerName() {
		return app.getP1Name();
	}
	
	protected void setEquippedList(Item[] aList) {
		app.setEquippedList(aList);
	}
	protected Item[] getEquippedList() {
		return app.getEquippedList();
	}
	
	
}
