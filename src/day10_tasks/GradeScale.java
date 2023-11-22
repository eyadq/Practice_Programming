package day10_tasks;

import java.util.Scanner;

public class GradeScale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        double score = input.nextDouble();
        char grade = 'F';
        boolean isValid = true;

        if(score > 100 || score < 0) {
            isValid = false;
        } else if(score >= 85) {
            grade = 'A';
        } else if(score >= 70) {
            grade = 'B';
        } else if(score >= 55) {
            grade = 'C';
        } else if(score >= 40) {
            grade = 'D';
        } else {
            isValid = false;
        }

        if(isValid) {
            System.out.println("Your grade is : " + grade);
        } else {
            if(score < 0) {
                System.out.println("Please enter a valid grade percentage.");
            } else
                System.out.println("Do better.");
        }
    }
}
