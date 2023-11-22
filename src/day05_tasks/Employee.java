package day05_tasks;

public class Employee {

    public static void main(String[] args) {
        String nameFirst = "James";
        String nameLast= "Bond";
        String nameCompany = "MI6";
        boolean isFullTime = true;
        String titleJob = "Special Agent";
        int salary = 1000000;
        int startMonth = 9;
        int startDay = 8;
        int startYear = 2023;
        String address = "1234 W Spy Ave";

        String nameFull = nameFirst + " " + nameLast;
        String startDate = startMonth + "/" + startDay + "/" + startYear;
        String email = nameFirst + nameLast + startDay + "@" + nameCompany + ".com";
        int tripleSalary = 3 * salary;

        System.out.println("Employment information");
        System.out.println("Full name: \t\t\t\t\t" + nameFirst + " " + nameLast);
        System.out.println("Start Date: \t\t\t\t" + startDate);
        System.out.println("Email: \t\t\t\t\t\t" + email);
        System.out.println("Salary after three years: \t" + tripleSalary);
    }
}
