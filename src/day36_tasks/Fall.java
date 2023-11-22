package day36_tasks;

import day36_tasks.Season;

public class Fall extends Season {

    public Fall(double highestAverageTemperture, double lowestAverageTemperture) {
        super("Fall", highestAverageTemperture, lowestAverageTemperture);
    }

    @Override
    public void activity() {
        System.out.println("Read A Book");
    }
}
