package day06_tasks;

public class KGToPounds {

    public static void main(String[] args) {

        double kilogramsToPoundsRatio = 2.20462;

        double amountInKilograms = 10;
        double  amountInPounds = amountInKilograms * kilogramsToPoundsRatio;

        System.out.println(amountInKilograms + " kilograms equals " + amountInPounds + " pounds.");
    }
}
