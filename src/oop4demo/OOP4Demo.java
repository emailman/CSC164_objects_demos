package oop4demo;

/*
 * Created by emailman on 2/16/2017.
 */

public class OOP4Demo {
    public static void main(String[] args) {
        Pet pet1 = new Cat("Ginger");
        System.out.println(pet1);

        Pet pet2 = new Boxer("Rover");
        System.out.println(pet2);

        Pet pet3 = new Greyhound("Sport");
        System.out.println(pet3);

        Pet pet4 = new Cat("Fluffy");
        System.out.println(pet4);

        System.out.println();
    }
}

abstract class Pet {
    // Attribute
    private String name;

    Pet () {
        System.out.printf
                ("\nYour new pet is ready to go home with you\n");
    }

    @Override
    public String toString() {
        return String.format("Welcome %s\n", name);
    }

    void setName(String n) {
        name = n;
    }
}

class Cat extends Pet {
    Cat(String arg) {
        super.setName(arg);
        System.out.println("Cats may meow a lot");
    }
}

abstract class Dog extends Pet{
    Dog () {
        System.out.println("Dogs may bark a lot");
    }
}

class Boxer extends Dog {
    Boxer (String arg) {
        super.setName(arg);
        System.out.println("Boxers may drool a lot");
    }
}

class Greyhound extends Dog {
    Greyhound (String arg) {
        super.setName(arg);
        System.out.println
                ("Greyhounds will need a lot of exercise");
    }
}
