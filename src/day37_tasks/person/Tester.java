package day37_tasks.person;

public class Tester extends Employee {
    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void hobby(){
        System.out.println("Relaxing on a beach");
    }

    @Override
    public void work(){
        System.out.println("Running test cases");
    }


}
