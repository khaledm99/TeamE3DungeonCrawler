/**
 * Classname: Start
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Displays the start menu and opening crawl text
 *
 */
import java.util.Scanner;

public class Start {

	private Userinterface printer = new Userinterface();
	private Scanner choiceInput = new Scanner(System.in);
	
	// Displays start screen and asks user if they would like to play or not
	public void startScreen() {
		System.out.println("---------------------------");
		System.out.println("TOMB OF THE ABYSSWALKER");
		System.out.println("---------------------------");
		System.out.println("Would you like to embark (yes or no)? ");
		String choice = choiceInput.nextLine();
		
		while (!choice.equals("no") && !choice.equals("yes")) {
			System.out.println("Please input a valid choice");
			choice = choiceInput.nextLine();
		}
		
		if (choice.equals("no")) {
			System.out.println("Quitting...");
			System.out.println("Finished");
			System.exit(0);
		}
		
		else {
			// Opening crawl/exposition
			String embark = "You are the Chosen Undead, chosen to gather\n"
					+ "the lord souls and link the First Flame,\n"
					+ "thus extending the Age of Fire.\nIn order to do so, you must enter the\n"
					+ "     TOMB OF THE ABYSSWALKER\nand retrieve the profaned Ring of the Abysswalker.\n"
					+ "May the fire light your path... ";
			printer.slowPrint(embark);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
	
	
