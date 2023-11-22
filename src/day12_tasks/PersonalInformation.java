package day12_tasks;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.next();


        System.out.print("How many people do you live with?: ");
        int occupants = input.nextInt();
        String residents = name + " ";
        switch (occupants){
            case 0:
                residents = "Lives alone";
                break;
            case 1:
            case 2:
                residents = "Lives with 2 or less than 2 people";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                residents = "Lives with 3 -6 people";
                break;
            default:
                residents = "Livea with more than 6 people";
        }
        System.out.println(residents);


        System.out.print("What city do you live in?:  ");
        input.nextLine();
        String city = input.nextLine();


        System.out.print("Do you live in downtown of " + city + " ? (yes or no): ");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")){
            System.out.println("Have you thought about moving to the suburbs? (yes or no): ");
            String response2 = input.nextLine();
            switch (response2){
                case "yes":
                    System.out.println("Do it its great");
                    break;
                case "no":
                    System.out.println("You should think about it");
                    break;
                default:
                    System.out.println("I did not understand your response. ");
            }

        } else if(response.equalsIgnoreCase("no")){
            System.out.println("There are a lot of nice places outside of downtown");
        } else {
            System.out.println("I did not understand your response. ");
        }



        System.out.print("What is your favorite animal?: ");
        String animal = input.nextLine();
        System.out.println("Wow " + animal + " is great animal.");
        System.out.print("How many " + animal + "s would you like have?: ");
        int numberofAnimals = input.nextInt();
        System.out.println("Interesting, you want " + numberofAnimals + " " + animal + "s");

    }
}
