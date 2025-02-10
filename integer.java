package scook4;

import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter first integer:");
            int x = sc.nextInt();
            System.out.println("Enter second integer:");
            int y = sc.nextInt();

            // Check for division by zero
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = x / y;
            System.out.println("The result of division is: " + result);
            
            // Check for array size validity
            if (y < 0) {
                throw new IllegalArgumentException("Array size cannot be negative!");
            }

            int[] array = new int[y];  // Create array with size 'y'

            // Fill the array with values
            for (int i = 0; i < y; i++) {
                array[i] = i * 2;  // Example: storing even numbers
            }

            // Print the array contents
            System.out.print("Array contents: ");
            for (int i = 0; i < y; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Program finished.");
            sc.close();
        }
    }
}

		