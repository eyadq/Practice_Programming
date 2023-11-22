package day12_tasks;

import java.util.Random;

public class SoccerGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int minutesLeft =rand.nextInt(100);;
        boolean isValid = true;

        if (minutesLeft < 0){
            System.out.println("Minutes left cannot be negative number");
            isValid = false;
        } else if (minutesLeft == 0){
            System.out.println("Game is over");
        } else if (minutesLeft > 0 && minutesLeft <= 29){
            System.out.println("The end of the game is approaching");
        } else if (minutesLeft >= 30 && minutesLeft <= 53){
            System.out.println("Middle of the game is going great");
        } else if (minutesLeft >= 60 && minutesLeft <= 74){
            System.out.println("Players are doing their best");
        } else if (minutesLeft >= 75 && minutesLeft <= 90){
            System.out.println("Game is just getting started");
        } else {
            System.out.println("Minutes left cannot be greater than 90");
            isValid = false;
        }


    }
}
