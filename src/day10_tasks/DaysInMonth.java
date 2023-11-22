package day10_tasks;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (as integer from 1 to 12): ");
        int month = input.nextInt();
        int numOfDays = 0;
        boolean isValid = true;

        if(month == 2) {
            numOfDays = 28;
        } else if(month==4 || month == 6 || month ==9 || month == 11) {
            numOfDays = 30;
        } else if(month==1 || month == 3 || month ==5 || month == 7 || month==8 || month == 10 || month ==12){
            numOfDays = 31;
        } else {
            isValid = false;
        }

        if(isValid){
            System.out.println("There are " + numOfDays + " in the inputed month");
        } else {
            System.out.println("The input was not valid");
        }

        System.out.print("Enter the name of a month: ");
        String monthString = input.next();
        switch(monthString){
            case "February":
                numOfDays = 28;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                numOfDays = 30;
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                numOfDays = 31;
                break;
            default:
                isValid = false;
        }
        if(isValid){
            System.out.println("There are " + numOfDays + " days in " + monthString);
        } else {
            System.out.println("The input was not valid");
        }


    }
}
