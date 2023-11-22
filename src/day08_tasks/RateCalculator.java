package day08_tasks;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a salary: ");
        double salary = input.nextDouble();
        double hourRate = salary / 52 / 40;
        System.out.println("Hourly rate of employee: $" + hourRate);

    }
}
