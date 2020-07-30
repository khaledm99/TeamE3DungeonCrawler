package model;
import javax.sound.sampled.Clip;

public class Map {
	
	private int width;
	private int height;
	private String name;
	private String[][] layout = { {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".","#",".",".",".",".","#",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".","#",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".","#","#","#","#","#","#",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".",".","#"},
					      {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
	};
	
	private Enemy skeletonOne = new Enemy();
	private Combat combat;
	private void setSkeleton() {
		skeletonOne.setHp(10);
		skeletonOne.setName("Skeleton");
		skeletonOne.setDead(false);
		skeletonOne.setGivesXP(5);
		skeletonOne.setGivesCoin(10);
		skeletonOne.setXcoord(12);
		skeletonOne.setYcoord(3);
	}
	
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String[][] getLayout() {
		return this.layout;
	}
	
	public String render(Player player) {
		String mapStr = "";
		for (int index = 0; index < layout.length; index++) {
			for (int iindex = 0; iindex < layout[index].length; iindex++) {
				if ((player.getXcoord() == iindex) && (player.getYcoord() == index))
					mapStr += "@";
				else
					mapStr += layout[index][iindex];
			}
			mapStr+= "\n";
		}
		return mapStr;
		
	}
	
	public String renderNext(Player player, String direction) {
		this.setSkeleton();
		if (direction.equals("up")) {
			if (layout[player.getYcoord()-1][player.getXcoord()] != "#") {
				player.moveUp(1);
				if (player.getYcoord() == (skeletonOne.getYcoord()) && player.getXcoord() == (skeletonOne.getXcoord())){
					//audioHandler.stop(clip);
					//clip = audioHandler.loop("/combat.wav");
					combat = new Combat(skeletonOne, player);
					combat.combatInit();
					//audioHandler.stop(clip);
					//clip = audioHandler.loop("/dungeon.wav");
				}
			}
		}
		else if (direction.equals("down")) {
			if (layout[player.getYcoord()+1][player.getXcoord()] != "#") {
				player.moveDown(1);
				if (player.getYcoord() == (skeletonOne.getYcoord()) && player.getXcoord() == (skeletonOne.getXcoord())){
				//	audioHandler.stop(clip);
				//	clip = audioHandler.loop("/combat.wav");
					combat = new Combat(skeletonOne, player);
					combat.combatInit();
				//	audioHandler.stop(clip);
				//	clip = audioHandler.loop("/dungeon.wav");
				}	
			}
		}
		else if (direction.equals("left")) {
			if (layout[player.getYcoord()][player.getXcoord()-1] != "#") {
				player.moveLeft(1);
				if (player.getYcoord() == (skeletonOne.getYcoord()) && player.getXcoord() == (skeletonOne.getXcoord())){
				//	audioHandler.stop(clip);
				//	clip = audioHandler.loop("/combat.wav");
					combat = new Combat(skeletonOne, player);
					combat.combatInit();
				//	audioHandler.stop(clip);
				//	clip = audioHandler.loop("/dungeon.wav");
				}
			}
		}
		else if (direction.equals("right")) {
			if (layout[player.getYcoord()][player.getXcoord()+1] != "#") {
				player.moveRight(1);
				if (player.getYcoord() == (skeletonOne.getYcoord()) && player.getXcoord() == (skeletonOne.getXcoord())){
				//	audioHandler.stop(clip);
				//	clip = audioHandler.loop("/combat.wav");
					combat = new Combat(skeletonOne, player);
					combat.combatInit();
				//	audioHandler.stop(clip);
				//	clip = audioHandler.loop("/dungeon.wav");
				}
			}
		}
		else {
			return "Please input a valid direction";
		}


		String mapStr = "";
		for (int index = 0; index < layout.length; index++) {
			for (int iindex = 0; iindex < layout[index].length; iindex++) {
				
				if ((player.getXcoord() == iindex) && (player.getYcoord() == index)) {
					mapStr += "@";}
				else {

					mapStr += layout[index][iindex];
					}
			}
			mapStr += "\n";
		}
		return mapStr;
	}

}
