package day12_tasks;

import java.util.Scanner;

public class ClassHours {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = input.next();

        boolean isValidResponse = true;
        String output = "";

        switch (day){
            case "Monday":
                output = "Mentor Hours";
                break;
            case "Tuesday":
            case "Friday":
                output = "No class";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                output = "Java class";
                break;
            case "Sunday":
                output = "Soft skills";
            default:
                isValidResponse = false;

        }
        System.out.println((isValidResponse) ? output : "Invalid response");
    }
}
