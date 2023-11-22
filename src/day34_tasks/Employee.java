package day34_tasks;

public class Employee {

    private String name;
    private boolean isFullTime;
    private double salary;

    public Employee(String name, boolean isFullTime, double salary) {
        setName(name);
        setIsFullTime(isFullTime);
        setSalary(salary);
    }

    public void work(){
        System.out.println(name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee" +
                "name: " + name +
                "\n\tIs Full Time: " + isFullTime +
                "\n\tSalary: " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsFullTime() {
        return isFullTime;
    }

    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
