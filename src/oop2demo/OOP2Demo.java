package oop2demo;

public class OOP2Demo {

    public static void main(String[] args) {
        // Build an array to store Balloon objects
        Balloon[] kids = new Balloon[10];

        // Create balloons in three elements of the array
        kids[0] = new Balloon(); // This is the default
        kids[1] = new Balloon("monkey"); // not a valid color
        kids[2] = new Balloon("blue"); // valid color

        // Show the number of balloons created
        System.out.printf
                ("%d balloons were made\n", Balloon.getBalloonCount());

        // Go through the whole array
        for (Balloon each : kids) {
            // Has an object been defined in this element?
            if (each != null)
                // Yes, print the return value from toString()
                System.out.println(each);
        }
    }
}

class Balloon {
    // Attributes
    private String color;
    private int diameter;

    // Static variable
    private static int countBalloons = 0;

    // Global constants
    private final String DEFAULT_COLOR = "red";
    private final int DEFAULT_SIZE = 12;

    // Default constructor
    Balloon () {
        color = validColor(DEFAULT_COLOR);
        diameter = DEFAULT_SIZE;
        countBalloons++;
    }

    // Custom constructor
    Balloon (String c) {
        color = validColor(c);
        diameter = DEFAULT_SIZE;
        countBalloons++;
    }

    // Validate the color of the balloon from an array of valid colors
    private String validColor(String c) {
        String[] validColors = {"red", "blue", "green", "white"};
        for (String each : validColors)
            if (each.equals(c))
                return each;
        return DEFAULT_COLOR;
    }

    // Get the number of balloons made
    static int getBalloonCount() {
        return countBalloons;
    }

    @Override
    public String toString() {
        // Return a string of descriptive information about the balloon
        return String.format("Billy's party has a %s balloon: %d inches in diameter",
                color, diameter);
    }
}
