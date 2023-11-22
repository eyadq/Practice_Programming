package day16_tasks;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Enters numbers to sum. Enter negative number to quit: ");
        while (true){
            int num = input.nextInt();
            if(num > 0) {
                sum += num;
            } else {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
