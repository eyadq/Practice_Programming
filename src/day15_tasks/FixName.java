package day15_tasks;

import java.util.Scanner;

public class FixName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String nameOne = input.nextLine();
        System.out.print("Enter last name: ");
        String nameTwo = input.nextLine();

        String name = ("" + nameOne.charAt(0)).toUpperCase() + nameOne.substring(1).toLowerCase() + " " +
                ("" + nameTwo.charAt(0)).toUpperCase() + nameTwo.substring(1).toLowerCase();

        System.out.println("Your full name: " + name);
    }
}
