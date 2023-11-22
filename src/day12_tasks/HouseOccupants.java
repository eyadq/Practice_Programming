package day12_tasks;

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of the hose to see the max allowed occupants number: ");
        String houseType = input.nextLine();

        boolean isValidResponse = true;
        int occupants = 0;

        switch (houseType){
            case "Tree house":
                occupants = 1;
                break;
            case "Mobile home":
                occupants = 2;
                break;
            case "Apartment":
                occupants = 4;
                break;
            case "Town house":
                occupants = 6;
                break;
            case "Villa":
                occupants = 8;
                break;
            case "Mansion":
                occupants = 10;
                break;
            default:
                isValidResponse = false;

        }

        if(isValidResponse){
            System.out.println("There are " + occupants + " in the " + houseType);
        } else {
            System.out.println("Type of house inputed is invalid");
        }
    }
}
