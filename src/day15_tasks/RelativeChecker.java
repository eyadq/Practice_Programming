package day15_tasks;

import java.util.Scanner;

public class RelativeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String nameOne = input.nextLine();
        System.out.print("Enter first name: ");
        String nameTwo = input.nextLine();

        if(nameOne.substring(nameOne.indexOf(' ')).equals(nameTwo.substring(nameTwo.indexOf(' ')))){
            System.out.println("Related");
        } else {
            System.out.println("Not related");
        }
    }
}
