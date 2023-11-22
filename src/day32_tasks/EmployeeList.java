package day32_tasks;

import day31_tasks.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeList {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom Jerry", "CEO", 1, 250_000));
        employees.add(new Employee("Betty Boop", "Account Lead", 4, 120_000));
        employees.add(new Employee("Popeye", "Developer Lead", 7, 120_000));
        employees.add(new Employee("William MacMoran MacDougal", "Janitor", 10, 70_000));
        employees.add(new Employee("Pink Panther", "Investigator", 12, 150_000));
        employees.add(new Employee("Feyruz", "Test Lead", 16, 200_000));
        employees.add(new Employee("Mickey Mouse", "HR", 20, 100_000));
        employees.add(new Employee("Mickey Mouse", "HR", 20, 100_000));
        employees.add(new Employee("Spongebob Squarepants", "SDET", 22, 100_000));
        employees.add(new Employee("Jake The Dog", "SDET", 23, 100_000));
        employees.add(new Employee("Bob Belcher", "Developer", 26, 100_000));

        ArrayList<Employee> devsAndTesters = new ArrayList<>(employees);
        devsAndTesters.removeIf(each -> !each.jobTitle.equals("SDET") && !each.jobTitle.equals("Developer"));
        System.out.println(devsAndTesters);

        ArrayList<Employee> richPeople = new ArrayList<>(employees);
        devsAndTesters.removeIf(each -> each.salary < 100_000);
        System.out.println(richPeople);







    }

}
