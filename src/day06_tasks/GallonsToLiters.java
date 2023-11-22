package day06_tasks;

public class GallonsToLiters {

    public static void main(String[] args) {

        double gallonsToLitersRatio = 3.78541;

        double amountInGallons = 10;
        double  amountInLiters = amountInGallons * gallonsToLitersRatio;

        System.out.println(amountInGallons + " gallons equals " + amountInLiters + " liters.");
    }
}
