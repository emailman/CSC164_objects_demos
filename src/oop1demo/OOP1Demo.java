package oop1demo;

public class OOP1Demo {

    public static void main(String[] args) {

        Balloon jill = new Balloon("blue");
        System.out.printf
                ("we now have %d balloons\n", Balloon.getBalloonCount());

        Balloon john = new Balloon("green");
        System.out.printf
                ("we now have %d balloons\n", Balloon.getBalloonCount());

        Balloon andy = new Balloon();
        System.out.printf
                ("we now have %d balloons\n", Balloon.getBalloonCount());


        System.out.println();
        System.out.println("Balloon inventory:");
        System.out.println("Color\tSize");
        System.out.println(jill.getColor() + "\t" + jill.diameter);
        System.out.println(john.getColor() + "\t" + john.diameter);
        System.out.println(andy.getColor() + "\t\t" + andy.diameter);
    }
}

class Balloon {
    // Attributes
    private String color;
    double diameter;
    private static int countBalloons = 0;

    // Custom constructor
    Balloon (String arg) {
        color = arg;
        diameter = 12;
        countBalloons++;
    }

    // Default constructor
    Balloon () {
        color = "red";
        diameter = 12;
        countBalloons++;
    }

    // Get the color of the balloon
    String getColor() {
        return color;
    }

    // Get the number of balloons made
    static int getBalloonCount() {
        return countBalloons;
    }
}