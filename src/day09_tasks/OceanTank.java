package day09_tasks;

import java.util.Scanner;

public class OceanTank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter oxygen level: ");
        int oxygen = input.nextInt();

        if(oxygen>=90){
            System.out.println("Your tank is full");
        }
        if(oxygen>=80 && oxygen<90){
            System.out.println("Still okay");
        }
        if(oxygen>=70 && oxygen<80){
            System.out.println("Don't go too far");
        }
        if(oxygen>=60 && oxygen<70){
            System.out.println("Start to head back");
        }
        if(oxygen>=50 && oxygen<60){
            System.out.println("Be careful now you are at 50%");
        }
    }

}
