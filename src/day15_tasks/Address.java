package day15_tasks;

import java.util.Scanner;

public class Address {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an address: ");
        String address = input.nextLine();

        if(address.isEmpty() || address.isBlank()){
            System.out.println("No address found");
        } else {
            System.out.println(address.toUpperCase());
        }


        
    }
}
