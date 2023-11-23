package day37_tasks.person;

public abstract class Employee extends Person {

    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee" +
                "\n\tjobTitle: " + jobTitle +
                "\n\tsalary: " + salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
