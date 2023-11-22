package day09_tasks;

import java.util.Scanner;

public class PrintGreatest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();

        int a1;
        int a2;
        int a3;

        if (first > second){
            if(first > third){
                System.out.println("The greatest number from " + first + ", " + second + ", " + third + " : " + first);
            } else {
                System.out.println("The greatest number from " + first + ", " + second + ", " + third + " : " + third);
            }
        }

        if (second > third){
            if(second > third){
                System.out.println("The greatest number from " + first + ", " + second + ", " + third + " : " + second);
            } else {
                System.out.println("The greatest number from " + first + ", " + second + ", " + third + " : " + third);
            }
        }

        if (third > first){
            if(third > second){
                System.out.println("The greatest number from " + first + ", " + second + ", " + third + " : " + third);
            } else {
                System.out.println("The greatest number from " + first + ", " + second + ", " + third + " : " + first);
            }
        }

    }
}
