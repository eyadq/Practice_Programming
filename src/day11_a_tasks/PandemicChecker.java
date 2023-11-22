package day11_a_tasks;

import java.util.Scanner;

public class PandemicChecker {

//    Task:
//    Write a program that will read a number from the user. This number will be a year.
//    Use that given year to figure out if there was a pandemic in that year, and if there was which one.
//
//    Data to use:
//            1346-1353: The Black Death
//                    1665-1666: Great Plague of London
//                    1770-1772: Russian plague
//                    1889-1890: Flu pandemic
//                    1916: American polio epidemic
//                    1918-1920: Spanish Flu
//                    2009-2010: H1N1 Swine Flu pandemic
//                    2014-2016: West African Ebola epidemic
//                    2020-2022: COVID-19
//    Any year not in those ranges: No Pandemic

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String disease = "";
        if(year >= 1346 && year <= 1353) {
            disease = "The Black Death";
        } else if(year >= 1665 && year <= 1666) {
            disease = "Great Plague of London";
        } else if(year >= 1770 && year <= 1772) {
            disease = "Russian plague";
        } else if(year >= 1889 && year <= 1890) {
            disease = "Flu pandemic";
        } else if(year == 1916) {
            disease = "American polio epidemic";
        } else if(year >= 1918 && year <= 1920) {
            disease = "Spanish Flu";
        } else if(year >= 2014 && year <= 2016) {
            disease = "West African Ebola epidemic";
        } else if(year >= 2020 && year <= 2022) {
            disease = "COVID-19";
        } else {
            disease = "None";
        }

        if(!disease.equals("None")){ // disease != None
            System.out.println("The pandemic active during " + year + " was " + disease);
        } else
            System.out.println(year + "was pandemic free");
    }
}
