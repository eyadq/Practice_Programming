package day36_tasks;

import day36_tasks.Season;

public class Winter extends Season {

    public Winter(double highestAverageTemperture, double lowestAverageTemperture) {
        super("Winter", highestAverageTemperture, lowestAverageTemperture);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }
}
