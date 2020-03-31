package mc.cherryredpi.chemtools.tools;

import java.util.Scanner;

public class AtomInfo {
	
	public static void run(Scanner scanner) {
		
		System.out.println("\nEnter the number of protons, neutrons, and electrons (P,N,E):");
		String[] stringValues = scanner.nextLine().split(",");
		
		if (stringValues.length != 3) {
			
			System.err.println("An unexpected error has occured.  Please try again...");
			run(scanner);
			
		}
		
		short[] values = new short[3];
		
		try {
			
			for (byte i = 0; i<3; i++) {
				
				String valueStripped = stringValues[i].strip();
				values[i] = Short.parseShort(valueStripped);
				
			}
			
		} catch (NumberFormatException e) {
			
			System.err.println("The csv string entered is not valid.  Please try again...");
			run(scanner);
			
		}
		
		short mass = (short) (values[0] + values[1]);
		String charge;
		
		if (values[0] < values[2]) {
			
			charge = String.format("Anion -%d", values[2] - values[0]);
			
		} else if (values[0] > values[2]) {
			
			charge = String.format("Cation +%d", values[0] - values[2]);
			
		} else {
			
			charge = "Neutral";
			
		}
		
		System.out.println(String.format("Atomic Mass:  %d\nCharge:  %s", mass, charge));
		
	}

}
