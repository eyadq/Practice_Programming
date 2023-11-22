package day09_tasks;
import java.util.Scanner;

public class TimInDay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hour of day (0 to 24): ");
        int hour = input.nextInt();

        if(hour<12){
            System.out.println("Good morning");
        }
        if(hour>12 && hour<3){
            System.out.println("Good afternoon");
        }
        if(hour>=3 && hour<=24){
            System.out.println("Good evening");
        }
        if(hour<0 || hour>24){
            System.out.println("Invalid input");
        }
    }
}
