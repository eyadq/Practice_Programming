package day12_tasks;

import java.util.Scanner;

public class SeasonFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month as a number from 1 to 12: ");
        int month = input.nextInt();
        String season = "";
        boolean isValidResponse = true;

        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                isValidResponse = false;

        }

        if(isValidResponse){
            System.out.println("Current season is: " + season);
        }
        else {
            System.out.println("There are only 12 months in a year. Please enter from 0 to 12");
        }
    }
}
