package day34_tasks;

public class Developer extends Employee {

    private int numberOfFeaturesCreated;

    public Developer(String name, boolean isFullTime, double salary) {
        super(name, isFullTime, salary);
    }

    public void develop(){
        System.out.println("Creating more features");
    }

    public int getNumberOfFeaturesCreated() {
        return numberOfFeaturesCreated;
    }

    public void setNumberOfFeaturesCreated(int numberOfFeaturesCreated) {
        this.numberOfFeaturesCreated = numberOfFeaturesCreated;
    }

    @Override
    public String toString() {
        return "Employee" +
                "name: " + getName() +
                "\n\tIs Full Time: " + getIsFullTime() +
                "\n\tSalary: " + getSalary() +
                "\n\tNumber of Features Created: " + numberOfFeaturesCreated;
    }
}
