package day36_tasks;

import day36_tasks.Season;

public class Summer extends Season {

    public Summer(double highestAverageTemperture, double lowestAverageTemperture) {
        super("Summer", highestAverageTemperture, lowestAverageTemperture);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
