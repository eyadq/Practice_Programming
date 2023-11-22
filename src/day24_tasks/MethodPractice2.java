package day24_tasks;

import java.util.Scanner;

public class MethodPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Can vote: " + canVote(age));
    }

    public static boolean canVote(int age){
        return (age >= 18) ? true : false;
    }


}
