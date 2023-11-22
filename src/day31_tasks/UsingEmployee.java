package day31_tasks;

public class UsingEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", "Officer");
        Employee employee2 = new Employee("John", "SDET", 1, 120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("Ha John isn't getting payed!");
    }


}
