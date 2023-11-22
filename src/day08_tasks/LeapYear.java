package day08_tasks;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Year " + year + " is a leap year: " + (year%4==0));
    }
}