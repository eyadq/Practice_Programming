package day10_tasks;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is larger than " + num2);
        } else if (num1 < num2){
            System.out.println(num2 + " is larger than " + num1);
        } else{
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
    }
}
