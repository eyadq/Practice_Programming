package day10_tasks;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {

        String blanket = "blanket";
        String charger = "Charger";
        String hat = "Hat";
        String headphones = "Headphones";
        String laptop = "Laptop";
        String pants = "Pants";
        String pillow = "Pillow";
        String smartphone = "Smartphone";
        String socks = "Socks";
        String usbCable = "USB cable";
        double price = 0;
        double balance = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("What item would you like to purchase? ");
        String item = input.next();

        switch (item){
            case "Blanket": price = 60;
                            break;
            case "Charger": price = 25;
                            break;
            case "Hat": price = 25;
                            break;
            case "Headphones": price = 30;
                            break;
            case "Laptop": price = 200;
                            break;
            case "Pants": price = 50;
                            break;
            case "Pillow": price = 40;
                            break;
            case "Smartphone": price = 1000;
                            break;
            case "Socks": price = 5;
                break;
            case "USB cable": price = 10;
                break;
            default:
                System.out.println("Invalid item!");
        }

        if( price != 0) {
            if(balance >= price){
                System.out.println("Thank you for your purchase!\nYour current balance is: $" + (balance - price));
            }else{
                System.out.println("Sorry, not enough funds on your gift card!");
            }
        }

    }
}
