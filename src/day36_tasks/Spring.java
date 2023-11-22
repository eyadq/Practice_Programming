package day36_tasks;

import day36_tasks.Season;

public class Spring extends Season {

    public Spring(double highestAverageTemperture, double lowestAverageTemperture) {
        super("Spring", highestAverageTemperture, lowestAverageTemperture);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }
}
