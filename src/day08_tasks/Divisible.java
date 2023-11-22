package day08_tasks;

import java.util.Scanner;

public class Divisible {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(number + " is divisible by 2: " + (number%2==0));
        System.out.println(number + " is divisible by 3: " + (number%3==0));
        System.out.println(number + " is divisible by 5: " + (number%5==0));
    }
}

