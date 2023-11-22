package day21_tasks;

import java.util.Scanner;

public class GradebookOne {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the grading software system, how many students do you have information on: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter name of student and score as following format: \"FirstName LastName:QuizScore\": ");

        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        input.nextLine(); //going to be using input.nextLine() after using input.nextInt()
        for (int i = 0; i < numberOfStudents; i++) {
            String userInput = input.nextLine();
            String[] arr= userInput.split(":"); //splits user input into array: [name, score]
            names[i] = arr[0];
            scores [i] = Integer.parseInt(arr[1]);
        }

        char[] grades = new char[numberOfStudents];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if(score >= 85 ){
                grades[i] = 'A';
            } else if ( score>=75 ){
                grades[i] = 'B';
            } else if ( score>=65 ){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }
    }
}
