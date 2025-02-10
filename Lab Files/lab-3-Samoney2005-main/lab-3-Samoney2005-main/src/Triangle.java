import java.text.DecimalFormat;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constants
    public static final String POLYGONSHAPE = "Triangle";
    public static final double DEFAULT_SIDE = 1.0;

    // Constructors
    public Triangle() {
        this.sideA = DEFAULT_SIDE;
        this.sideB = DEFAULT_SIDE;
        this.sideC = DEFAULT_SIDE;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        if (isTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            this.sideA = DEFAULT_SIDE;
            this.sideB = DEFAULT_SIDE;
            this.sideC = DEFAULT_SIDE;
        }
    }

    public Triangle(double[] sides) {
        if (sides != null && sides.length == 3 && isTriangle(sides)) {
            this.sideA = sides[0];
            this.sideB = sides[1];
            this.sideC = sides[2];
        } else {
            this.sideA = DEFAULT_SIDE;
            this.sideB = DEFAULT_SIDE;
            this.sideC = DEFAULT_SIDE;
        }
    }

    public Triangle(Triangle triangle) {
        if (triangle == null) {
            this.sideA = DEFAULT_SIDE;
            this.sideB = DEFAULT_SIDE;
            this.sideC = DEFAULT_SIDE;
        } else {
            this.sideA = triangle.getSideA();
            this.sideB = triangle.getSideB();
            this.sideC = triangle.getSideC();
        }
    }

    // Side Getters
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double[] getSides() {
        return new double[]{sideA, sideB, sideC};
    }

    // Angle Getters
    public double getAngleA() {
        return Triangle.lawOfCosines(sideB, sideC, sideA); // Using static method call
    }

    public double getAngleB() {
        return Triangle.lawOfCosines(sideA, sideC, sideB); // Using static method call
    }

    public double getAngleC() {
        return Triangle.lawOfCosines(sideA, sideB, sideC); // Using static method call
    }

    public double[] getAngles() {
        return new double[]{getAngleA(), getAngleB(), getAngleC()};
    }

    // Side Setters
    public boolean setSideA(double sideA) {
        if (sideA > 0 && isTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            return true;
        }
        return false;
    }

    public boolean setSideB(double sideB) {
        if (sideB > 0 && isTriangle(sideA, sideB, sideC)) {
            this.sideB = sideB;
            return true;
        }
        return false;
    }

    public boolean setSideC(double sideC) {
        if (sideC > 0 && isTriangle(sideA, sideB, sideC)) {
            this.sideC = sideC;
            return true;
        }
        return false;
    }

    public boolean setSides(double[] sides) {
        if (sides != null && sides.length == 3 && isTriangle(sides)) {
            this.sideA = sides[0];
            this.sideB = sides[1];
            this.sideC = sides[2];
            return true;
        }
        return false;
    }

    // Helper Methods
    public static boolean isTriangle(double a, double b, double c) {
        // Ensure all sides are positive and satisfy the triangle inequality
        return (a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean isTriangle(double[] sides) {
        // Check if the array is null or has an invalid length (not exactly 3 sides)
        if (sides == null || sides.length != 3) {
            return false;
        }

        // Check if all sides are positive numbers
        for (double side : sides) {
            if (side <= 0) {
                return false; // Return false if any side is non-positive
            }
        }

        // If the array has exactly 3 valid sides, check if it satisfies the triangle inequality
        return isTriangle(sides[0], sides[1], sides[2]);
    }

    // Make this method static to avoid errors
    public static double lawOfCosines(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive.");
        }
        double numerator = a * a + b * b - c * c;
        double denominator = 2 * a * b;
        if (denominator == 0) {
            throw new IllegalArgumentException("Invalid triangle sides: division by zero.");
        }
        double cosValue = numerator / denominator;
        if (cosValue < -1 || cosValue > 1) {
            throw new IllegalArgumentException("Invalid triangle sides: cannot compute angle.");
        }
        return Math.toDegrees(Math.acos(cosValue));
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0000"); // Change the pattern to use 4 decimal places
        return "Triangle(" + df.format(sideA) + ", " + df.format(sideB) + ", " + df.format(sideC) + ")";
    }
}
