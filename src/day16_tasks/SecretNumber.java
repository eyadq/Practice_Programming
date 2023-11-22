package day16_tasks;

import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(1000); //Creates random number from 0 to 1000

        Scanner input = new Scanner(System.in);
        System.out.print("Try to guess secret number: ");
        int attempt = input.nextInt();

        boolean isNotGuessed = true;

        if(attempt == secretNumber){
            isNotGuessed = false;
            System.out.println("Congrats, you guessed secret number");
        } else {
            if (attempt > secretNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too Low");
            }
        }


        while (isNotGuessed){
            System.out.print("Sorry, try again or type negative number to quit: ");
            if(attempt < 0){
                System.out.println("I understand, game is over");
                break;
            }
            attempt = input.nextInt();

            if(attempt == secretNumber){
                isNotGuessed = false;
                System.out.println("Congrats, you guessed secret number");
            } else {
                if(attempt > secretNumber){
                    System.out.println("Too high");
                } else {
                    System.out.println("Too Low");
                }
            }

        }
    }
}
