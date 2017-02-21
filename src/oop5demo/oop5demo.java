package oop5demo;

import java.util.ArrayList;
import java.util.Scanner;

public class oop5demo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Put the course sections into an array list
        ArrayList<CourseSection> courseSections = new ArrayList<>();

        String id;

        do {
            System.out.print("Enter the course id, <Enter> to stop: ");
            id = input.nextLine().toUpperCase();
            if (!id.equals("")) {

                int sectionID = getValidSectionID();

                int numOfStudents = getValidNumOfStudents();

                // Everything is OK to add a new course section
                courseSections.add
                        (new CourseSection(id, sectionID, numOfStudents));

                input.nextLine(); // make sure the input buffer is empty
            }

        } while (!id.equals(""));

        System.out.println("\nList of course sections:");
        courseSections.forEach(System.out::println);
    }

    private static int getValidSectionID() {
        int id;
        do {
            System.out.print("Enter 3 digit section id: ");
            id = input.nextInt();
        } while (!CourseSection.isSectionValid(id));
        return id;
    }

    private static int getValidNumOfStudents() {
        int num;
        do {
            System.out.printf
                    ("Enter number of students in the section: %d max: ",
                            CourseSection.MAX_STUDENTS);
            num = input.nextInt();
        } while (!CourseSection.isNumberOfStudentsValid(num));
        return num;
    }
}

class CourseSection {
    // Attributes
    private String course;
    private int section;
    private int numOfStudents;

    // Static constant
    static final int MAX_STUDENTS = 18;

    CourseSection(String myCourse, int mySection, int myNumOfStudents) {
        course = myCourse;
        section = mySection;
        numOfStudents = myNumOfStudents;
    }

    public String toString() {
        return String.format("%s section %d: %d students",
                course, section, numOfStudents);
    }

    static Boolean isNumberOfStudentsValid(int s) {
        return (s > 0 && s <= MAX_STUDENTS);
    }

    static Boolean isSectionValid(int s) {
        return (s >= 100 && s<=999);
    }
}