package day11_a_tasks;

import java.util.Scanner;

public class RealEstate {

   /* We are buying a house
    ask the user for their budget (single number, max)

    Find the area that the user's budget fits into and provide all the information of the neighborhood

    extra condition: if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget".
    If the budget is more than 300,000 print "Too much money for this agency"


    Data based on neighborhood name:
    name - Hills
    average price - 80,000 - 100,000
    rating - 4.0
    gated - no
    allow pets - yes

    name - Oaks
    average price - 55,000 - 75,000
    rating - 3.5
    gated - no
    allow pets - yes

    name - Highland
    average price - 120,000 - 150,000
    rating - 4.5
    gated - yes
    allow pets - no

    name - Canyon
    average price - 160,000 - 201,000
    rating - 4.8
    gated - yes
    allow pets - yes

    If the budget is no in any range print: "No available houses"*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your budget for a home.: ");
        double budget = input.nextDouble();

        String neighborhood = "";
        String range = "";
        double rating = -0.0;
        boolean isGated = true;
        boolean allowsPets = true;
        boolean isValid = true;

        //Take budget and put it in range.
        if(budget <0){
            isValid = false;
        } else if (budget >= 0 && budget < 55000){
            isValid = false;
        } else if (budget >= 55000 && budget <= 75000) {
            neighborhood = "Oaks";
            range = "55,000 - 75,000";
            rating = 4.5;
            isGated = true;
            allowsPets = false;
        } else if (budget >= 80000 && budget <= 100000) {
            neighborhood = "Hills";
            range = "80,000 - 100,000:";
            rating = 4.0;
            isGated = false;
            allowsPets = true;
        } else if (budget >= 120000 && budget <= 150000) {
            neighborhood = "Highland";
            range = "120,000 - 150,000";
            rating = 4.5;
            isGated = true;
            allowsPets = true;
        } else if (budget >= 160000 && budget <= 201000) {
            neighborhood = "Canyon";
            range = "160,000 - 201,000";
            rating = 4.8;
            isGated = true;
            allowsPets = true;
        } else {
            isValid = false;
        }

        if(isValid){
            System.out.println("Name: " + neighborhood);
            System.out.println("\t" + "Range: " + range);
            System.out.println("\t" +"Rating: " + rating);
            System.out.println("\t" + "Is gated: " + ((isGated)?"yes":"no"));
            System.out.println("\t" + "Allows pets: " + ((allowsPets)?"yes":"no"));

        } else {
            if(budget < 0){
                System.out.println("That is not a valid budget");
            } else if (budget > 300000){
                System.out.println("Too much money for this agency");
            } else {
                System.out.println("No available houses");
            }
        }
    }
}
