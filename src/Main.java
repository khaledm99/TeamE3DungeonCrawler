import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map map = new Map();
		Player player = new Player();
		player.setXcoord(6);
		player.setYcoord(8);
		Scanner input = new Scanner(System.in);
		String direction = "";
		
		String testmap = map.render(player);
		System.out.println(testmap);
		System.out.println("What would you like to do? (up, down, left, right, quit) ");
		direction = input.nextLine();
		
		while (!direction.equals("quit")) {
			testmap = map.renderNext(player, direction); 
			System.out.println(testmap);
			direction = input.nextLine();
		}
		System.out.println("Finished...");
	}	
}