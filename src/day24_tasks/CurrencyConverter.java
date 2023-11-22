package day24_tasks;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount in USD: $");
        double amountUSD = input.nextDouble();
        System.out.println("Enter the currency you wish to convert your amount in to:");
        System.out.println("\t1. euro\n\t2. yen\n\t3. lira\n\t4. won\n\t5. rupee");
        System.out.print("Enter choice (please no typos): ");
        String curreny = input.next().toLowerCase();

        System.out.println("$" + amountUSD + " -> " + moneyConverter(amountUSD, curreny) + " " + curreny);
    }

    public static double moneyConverter(double amountUSD, String curreny){
        double ratio = 0;
        switch(curreny){
            case "euro":
                ratio = 0.91; //euro
                break;
            case "yen":
                ratio = 121.03; //yen
                break;
            case "lira":
                ratio = 14.85; //lira
                break;
            case "won":
                ratio = 1217.52; //won
                break;
            case "rupee":
                ratio = 181.45; //rupee
                break;
        }
        return amountUSD * ratio;
    }
}
