package day12_tasks;

import java.util.Scanner;

public class FieldTrip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade (from 1 to 6): ");
        int grade = input.nextInt();
        boolean isValid = true;

        if(grade < 1 || grade > 6){
            System.out.println("Grade must be between 1-6");
            isValid = false;
        }

        String location = "";
        int groups = 0;
        String teacher = "";

        if(isValid){
            switch (grade){
                case 1:
                    location = "Apple orchard";
                    groups = 3;
                    teacher = "Ms. Smith";
                case 2:
                    location = "Zoo";
                    groups = 4;
                    teacher = "Ms. Frank";
                case 3:
                    location = "Baseball game";
                    groups = 2;
                    teacher = "Mr. Simmons";
                case 4:
                    location = "Skating rink";
                    groups = 3;
                    teacher = "Ms. Griffon";
                case 5:
                    location = "Aquarium";
                    groups = 2;
                    teacher = "Mr. Boon";
                case 6:
                    location = "Beach";
                    groups = 1;
                    teacher = "Ms. Trev";
            }

            System.out.println("Data based on grade:");
            System.out.println("\tGrade: " + grade);
            System.out.println("\tLocation: " + location);
            System.out.println("\tNumber of groups: " + groups);
            System.out.println("\tTeacher in charge: " + teacher);
        }
    }
}
