package day08_tasks;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String product = input.nextLine();
        System.out.print("Enter price for " + product +": $");
        double price = input.nextDouble();
        System.out.print("Enter quantity of " + product +" that you would like to purchase: ");
        int quantity = input.nextInt();
        System.out.print("Enter the name of the purchaser: ");
        input.nextLine();
        String name = input.nextLine();
        String output = name + ", your order for " + quantity + " " + product + " has been placed.\n" +
                "Your total is: $" + price*quantity;
        System.out.println(output);
    }
    }
