package day10_tasks;

import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        String ageGroup ="";

        boolean isValid = true;

        if(age < 0){
            isValid = false;
        } else if (age <= 1 ) {
            ageGroup = "Infant";
        } else if (age>=2 && age<=5) {
            ageGroup = "Toddler";
        } else if (age>=6 && age<=9)  {
            ageGroup = "Kid";
        } else if (age>=10 && age<=12) {
            ageGroup = "Pre-Teen";
        } else if (age>=13 && age<=17) {
            ageGroup = "Teen";
        } else if (age>=18 && age<=20) {
            ageGroup = "Young Adult";
        } else if (age>=21 && age<=35) {
            ageGroup = "Adult";
        } else if (age>=36 && age<=55) {
            ageGroup = "Middle-Aged Adult";
        } else if (age>=55 && age<=120) {
            ageGroup = "Senior Citizen";
        } else {
            isValid = false;
        }

        if(isValid) {
            System.out.println("Your age group is: " + ageGroup);
        } else {
            System.out.println("Please enter a valid age from 1 to 120");
        }


    }
}
