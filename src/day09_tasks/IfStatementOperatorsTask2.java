package day09_tasks;
import java.util.Scanner;

public class IfStatementOperatorsTask2 {

//    Write a program that will accept your salary amount.
//    Then also ask the user if they are full time or not (boolean).
//    If they are fulltime add 20000 to their salary,
//    but if they are part time then subtract 5000.
//    Print the final salary.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a salary" );
        double salary = input.nextDouble();
        System.out.print("Full time? true or false: " );
        boolean isFullTime = input.nextBoolean();
        if(isFullTime){
            salary += 20000;
        } else {
            salary -= 5000;
        }

        System.out.println("Final salary is: $" + salary);

    }
}
