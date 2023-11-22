package day06_tasks;

public class Pizza {

    public static void main(String[] args) {

        String pizza = "cheese";
        int totalSlices = 8;
        int numberOfPeople = 4;
        int slicesPerPerson = totalSlices / numberOfPeople;

        System.out.println("We ordered "+ pizza + " pizza with " + totalSlices + " slices, " + numberOfPeople +
                " people ate "+ slicesPerPerson + " slices each.");
    }
}
