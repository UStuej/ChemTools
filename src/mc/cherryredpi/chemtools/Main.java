package mc.cherryredpi.chemtools;

import java.util.Scanner;

import mc.cherryredpi.chemtools.tools.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("\nWhat tool would you like to use?" 
			+ "\n0 - Quit" 
			+ "\n1 - AtomInfo");

			try {

				switch (Short.parseShort(scanner.nextLine().strip())) { // Only check for lowercase cases to simulate String.equalsIgnoreCase method
				
					case 0:
						System.exit(0);
						// break not needed
					
					case 1:
						System.out.println("Running AtomInfo...");
						AtomInfo.run(scanner);
						break;
						
					default:
						System.err.println("Sorry, that tool isn't available.  Please try again...");
					
				}

			} catch (NumberFormatException e) {
				
				System.err.println("Sorry, that tool isn't available.  Please try again...");

			}

		}

	}

}
