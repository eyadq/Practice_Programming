package day30_tasks;

public class UsingCar {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2019;
        car1.color = "Blue";
        car1.fuelLevel = 30;

        System.out.println(car1.fuelLevel);
        car1.drive();
        car1.drive();
        System.out.println("Running low on gas: " + car1.isLow());
        System.out.println(car1.fuelLevel);
        car1.fillTank();
        System.out.println(car1.fuelLevel);

        System.out.println(car1);

    }
}
