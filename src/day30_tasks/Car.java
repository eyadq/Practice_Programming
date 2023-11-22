package day30_tasks;

public class Car {

    String model;
    int year;
    String color;
    double fuelLevel;

    @Override
    public String toString() {
        return year + " " + model +
                "\n\tColor: " + color  +
                "\n\tFuel Level : " + fuelLevel;
    }

    public void drive(){
        System.out.println("Driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank(){
        System.out.println("Filling tank");
        fuelLevel = 100;
    }

    public boolean isLow(){
        return fuelLevel<=25;
    }
}
