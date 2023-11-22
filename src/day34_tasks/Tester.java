package day34_tasks;

public class Tester extends  Employee{

    private int numberOfBugsFound;

    public Tester(String name, boolean isFullTime, double salary) {
        super(name, isFullTime, salary);
    }

    public void test(){
        System.out.println("Running the regression");
    }

    @Override
    public String toString() {
        return "Employee" +
                "name: " + getName() +
                "\n\tIs Full Time: " + getIsFullTime() +
                "\n\tSalary: " + getSalary() +
                "\n\tNumber of Bugs Found: " + numberOfBugsFound;
    }

    public int getNumberOfBugsFound() {
        return numberOfBugsFound;
    }

    public void setNumberOfBugsFound(int numberOfBugsFound) {
        this.numberOfBugsFound = numberOfBugsFound;
    }
}
