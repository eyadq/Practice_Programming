package day36_tasks;

public class Season {

    private String name;
    private double highestAverageTemperture;
    private double lowestAverageTemperture;

    public Season(String name, double highestAverageTemperture, double lowestAverageTemperture) {
        setName(name);
        setHighestAverageTemperture(highestAverageTemperture);
        setLowestAverageTemperture(lowestAverageTemperture);
    }

    public void activity(){
        System.out.println("I need to be overridden in sub class");
    }

    @Override
    public String toString() {
        return "Season " + name +
                "\n\thighestAverageTemperture: " + highestAverageTemperture +
                "\n\tlowestAverageTemperture: " + lowestAverageTemperture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHighestAverageTemperture() {
        return highestAverageTemperture;
    }

    public void setHighestAverageTemperture(double highestAverageTemperture) {
        this.highestAverageTemperture = highestAverageTemperture;
    }

    public double getLowestAverageTemperture() {
        return lowestAverageTemperture;
    }

    public void setLowestAverageTemperture(double lowestAverageTemperture) {
        this.lowestAverageTemperture = lowestAverageTemperture;
    }
}
