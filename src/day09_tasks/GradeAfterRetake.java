package day09_tasks;

import java.util.Scanner;
public class GradeAfterRetake {

//    Task:
//    Write a program that will give the grade after the retake.
//    The program should read a score of the test and which attempt it was.
//    If its the first attempt -> subtract 10%
//    If its the second attempt -> subtract 20%
//    If its the third attempt -> subtract 35%
//
//    Note: Use Scanner class
//
//    Example Output:
//    Put your score:
//            70
//    Which attempt is this to retake the test?
//            2
//    After the second retake attempt, your score is: score

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter test score: ");
        int score = input.nextInt();
        System.out.print("Which attempt is this to retake the test: ");
        int attempt = input.nextInt();
        if(attempt == 1){
            score -= 10;
            System.out.println("After first attempt, your score is " + score + "%.");
        }
        if(attempt == 2){
            score -= 20;
            System.out.println("After second attempt, your score is " + score + "%.");
        }
        if(attempt == 3){
            score -= 35;
            System.out.println("After third attempt, your score is " + score + "%.");
        }


    }
}
