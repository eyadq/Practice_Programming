package day12_tasks;

import java.util.Scanner;

public class MorningOrNight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time: ");
        int hour = input.nextInt();

        String period = (hour >= 0 && hour <= 11) ? "Morning" : (hour >= 12 && hour <= 24) ? "Night" : "Invalid";

        if(period.equals("Invalid")) {
            System.out.println("Invalid input");
        } else {
            System.out.println(period);
        }
    }
}
