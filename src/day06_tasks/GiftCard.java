package day06_tasks;

public class GiftCard {

    public static void main(String[] args) {

        double balance = 200;
        double priceItem1 = 40;
        double priceItem2 = 100;
        double remainingBalance = balance - priceItem1 - priceItem2;
        System.out.println("The gift card started with a balance of " + balance + " and after buying item1 for " +
        priceItem1 + " and item2 for " + priceItem2 +", the remaining balance of the gift card is " + remainingBalance);

    }
}
