package scook4 ;
public class car { // Class name is lowercase, as per your request
    public String model;    
    public String color;
    public int year;
    public int miles;
    public String condition;
    public static int noWheel = 4; // Class variable, number of wheels is common to all cars

    // Constructor
    public car(String model, String color, int year, int miles, String condition) { 
        this.model = model;        
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.condition = condition;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    // Corrected toString method
    
    public String toString() {
        return model + " " + color + " " + year + " " + miles + " miles, Condition: " + condition;

    }

    // Main method to create a car instance and print it
    public static void main(String[] args) {
        car c1 = new car("Toyota", "Red", 2014, 120000, "Great"); 
        System.out.println(c1);
    }
}
