package day16_tasks;

import java.util.Random;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 5 numbers: ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        int num4 = input.nextInt();
//        int num5 = input.nextInt();

        //Get 5 random numbers
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        int num3 = rand.nextInt(100);
        int num4 = rand.nextInt(100);
        int num5 = rand.nextInt(100);


        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int count = 0;

        String numContainer = " " + num1 + " " + num2 + " " +  num3 + " " + num4 + " " + num5 + " ";

        while (numContainer.contains(" ")){
            int index = numContainer.indexOf(" "); //Gets index of " " closest to zero
            //Does not change length of String, just changes closest " " to "," so we get to next number on next iteration
            numContainer = numContainer.replaceFirst(" ", "*");
            //System.out.println(numContainer);
            
            if(numContainer.contains(" ")) {
                int currentNumber = Integer.parseInt(numContainer.substring(index + 1, numContainer.indexOf(" ")));
                if(currentNumber > biggest){
                    biggest = currentNumber;
                }
                if(currentNumber < smallest){
                    smallest = currentNumber;
                }
            }

        }

        System.out.println("My numbers: " + num1 + ", "+ num2 + ", "+ num3 + ", "+ num4 + ", "+ num5);
        System.out.println("biggest = " + biggest);
        System.out.println("smallest = " + smallest);


    }
}
