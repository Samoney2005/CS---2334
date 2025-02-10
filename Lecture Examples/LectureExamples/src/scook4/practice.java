package scook4;

import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception implements java.io.Serializable {
    // Serial version UID to ensure version consistency during serialization
    private static final long serialVersionUID = 1L;

    // Constructor that accepts a message and passes it to the parent class Exception
    public InvalidAgeException(String message) {
        super(message);  // Calls the constructor of Exception class
    }
}

public class practice {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);  // Check the age and throw exception if necessary
        } catch (InvalidAgeException e) {
            // Print the exception details
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();  // Close the scanner resource
        }
    }
}
