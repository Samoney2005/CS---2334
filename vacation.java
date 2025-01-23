package scook4;

import java.util.Scanner;
public class vacation {
	
	public static void main(String[] args) {
	System.out.println("Enter your favorite vacation spot:");
	Scanner sc = new Scanner(System.in); // Create the Scanner object
	// Capture input
	String vacaySpot = sc.nextLine();
	System.out.println("You entered: " + vacaySpot);
	// Close the Scanner to prevent warnings
	sc.close();
	}
}


