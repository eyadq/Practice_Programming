package day08_tasks;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(number + " is even: " + (number%2==0));
        System.out.println(number + " is odd: " + (number%2==1));
    }
}
