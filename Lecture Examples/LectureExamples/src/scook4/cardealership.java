package scook4;

import java.util.ArrayList;

public class cardealership{

    public static void main(String[] args) {
        // Corrected the constructor usage to match car.java
        car c1 = new car("Toyota", "Red", 2014, 120000, "Great");
        car c2 = new car("Rav4", "Blue", 2022, 80000, "Excellent");

        // Create an ArrayList to store car objects
        ArrayList<car> carList = new ArrayList<>();

        // Add cars to the list
        carList.add(c1);
        carList.add(c2);

        // Print car details
        for (car c : carList) {
            System.out.println(c);
        }
    }
}
