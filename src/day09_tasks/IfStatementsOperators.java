package day09_tasks;
import java.util.Scanner;

public class IfStatementsOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a boolean value (true or false): ");
        boolean response = input.nextBoolean();
        System.out.println("Response was " + response + " but opposite is " + !response);


    }
}
