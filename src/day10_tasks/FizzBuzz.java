package day10_tasks;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        double number = input.nextDouble();
        boolean isDiv3 = number%3 == 0;
        boolean isDiv5 = number%5 == 0;
        String result;

        if(isDiv3 && isDiv5){
            result = "FizzBuzz";
        } else if(isDiv3){
            result = "Fizz";
        } else if (isDiv5) {
            result = "Buzz";
        } else {
            result = "" + number;
        }
        System.out.println(result);
        
    }
}
