package day16_tasks;

import java.util.Scanner;

public class SmallTasks {

    public static void main(String[] args) {

        //Need to print from 'a' to 'z'
        int count = (int)'a';
        while (count <= (int)'z'){
            System.out.print((char)count + " ");
            count++;
        }

        //Need to print from 'A' to 'Z'
        count = (int)'A';
        System.out.println();
        while (count <= (int)'Z'){
            System.out.print("" + (char)count + " ");
            count++;
        }

        //Need to print from 'z' to 'a'
        count = (int)'z';
        System.out.println();
        while (count >= (int)'a'){
            System.out.print((char)count + " ");
            count--;
        }

        //Need to print from 'Z' to 'A'
        count = (int)'Z';
        System.out.println();
        while (count >= (int)'A'){
            System.out.print((char)count + " ");
            count--;
        }

        //FizzBuzz baby!
        count = 0;
        while(count <= 50){
            if( count%3==0 && count%5==0 ){
                System.out.println(count + " Fizzbuzz");
            } else if( count%3==0  ){
                System.out.println(count + " Fizz");
            } else if( count%5==0  ){
                System.out.println(count + " buzz");
            }

            count++;
        }

        Scanner input = new Scanner(System.in);
        count = 0;
        int sum = 0;
        System.out.println("Enter 5 numbers to add: ");
        while (count < 5){
            sum += input.nextInt();
            count++;
        }
        System.out.println("sum = " + sum);

    }
}
