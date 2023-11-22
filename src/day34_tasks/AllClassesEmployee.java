package day34_tasks;

public class AllClassesEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee("Mickey Mouse", false, 400_234);
        employee.work();
        System.out.println(employee);

        Tester tester = new Tester("Tom Jerry", true, 120_000);
        tester.work();
        tester.test();
        tester.setNumberOfBugsFound(6);
        System.out.println(tester);

        Developer developer = new Developer("Betty Boop", true, 120_001);
        developer.work();
        developer.setNumberOfFeaturesCreated(7);
        System.out.println(developer);


    }
}
