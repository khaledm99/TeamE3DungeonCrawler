/**
 * Classname: Start
 * 
 * Version: 0
 * 
 * Author: Khaled Mograbee
 * 
 * Description: Start screen for text version. Displays title, exposition text,
 * and allows the player to choose a name.
 *
 */
package application;
import java.util.Scanner;

import model.Userinterface;

public class Start {

	private String name = "Chosen Undead"; // Default name
	private Userinterface printer = new Userinterface(); // User interface object to handle the slow text print of the exposition
	private Scanner choiceInput = new Scanner(System.in); // User input scanner
	
	// When called, displays the start screen and runs through it's features.
	public String startScreen() {
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
			System.out.println("Enter your hero's name: ");
			choice = choiceInput.nextLine();
			if (!choice.equals(""))
				name = choice;
		
			String embark = "You are the Chosen Undead, chosen to gather\n"
					+ "the lord souls and link the First Flame,\n"
					+ "thus extending the Age of Fire.\nIn order to do so, you must enter the\n"
					+ "     TOMB OF THE ABYSSWALKER\nand retrieve the profaned Ring of the Abysswalker.\n"
					+ "May the fire light your path... ";
			printer.slowPrint(embark);
		}
		return name;
	}
}
	
	
