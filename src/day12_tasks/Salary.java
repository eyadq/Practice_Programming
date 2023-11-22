package day12_tasks;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = true;

        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter hours worked per week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter amount of weeks worked per year: ");
        double weeksWorked = input.nextDouble();
        double overtimeHours = 0;
        if(hoursWorked > 40){
            overtimeHours = hoursWorked - 40;
            hoursWorked = 40;
        }

        if(hourlyRate <= 0){
            System.out.println("Hourly rate cannot be negative or zero");
            isValid = false;
        }
        if(hoursWorked < 1 || hoursWorked > 65){
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            isValid = false;
        }
        if(weeksWorked < 0){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
            isValid = false;
        }

        if(isValid){
            double salary = (hourlyRate * hoursWorked) + (hourlyRate * overtimeHours * 1.5);
            salary *= weeksWorked;
            System.out.println("Salary: $" + salary);
        }



    }
}
