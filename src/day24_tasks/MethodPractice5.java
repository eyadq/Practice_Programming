package day24_tasks;

import java.util.Scanner;

public class MethodPractice5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = input.next();

        letterPrinter(userInput);
    }

    public static void letterPrinter(String userInput){
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }
    }
}
