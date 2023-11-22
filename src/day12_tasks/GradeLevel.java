package day12_tasks;

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade level from 1 to 16: ");
        int gradeLevel = input.nextInt();
        String schoolLevel = "";
        boolean isValidResponse = true;

        switch (gradeLevel){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                schoolLevel = "Elementary school";
                break;
            case 6:
            case 7:
            case 8:
                schoolLevel = "Middle School";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                schoolLevel = "High School";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                schoolLevel = "College";
                break;
            case 17:
            case 18:
                schoolLevel = "Grad school";
                break;
            default:
                isValidResponse = false;

        }
        if(isValidResponse){
            System.out.println(schoolLevel);
        } else {
            System.out.println("Invalid grade level");
        }
    }
}
