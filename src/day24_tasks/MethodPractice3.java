package day24_tasks;

import java.util.Scanner;

public class MethodPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();;

        positiveOrNegative(num);
    }

    public static void positiveOrNegative(double num){
        if(num > 0){
            System.out.println("Positive");
        } else if(num < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
