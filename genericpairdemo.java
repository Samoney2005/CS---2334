package scook4;

import java.util.Scanner;

public class genericpairdemo {
    
    public static void main(String[] args) {
        pair<String, String> secret = new pair<>("Happy", "Day");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String f = sc.next();
        System.out.println("Enter second word: ");
        String s = sc.next();
        
        pair<String, String> guess = new pair<>(f, s);
        
        if (secret.getFirst().equals(guess.getFirst()) && secret.getSecond().equals(guess.getSecond())) {
            System.out.println("You guessed correct!");
        } else {
            System.out.println("Try again!");
        }
        
        sc.close();
    }
}
