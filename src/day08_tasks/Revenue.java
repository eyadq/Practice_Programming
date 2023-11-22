package day08_tasks;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = input.nextDouble();
        System.out.print("Enter product quantity: ");
        double quantity = input.nextDouble();
        System.out.println("Revenue: $" + (price * quantity));
    }
}
