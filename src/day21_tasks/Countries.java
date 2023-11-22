package day21_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Countries {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines",
                "Armenia", "Colombia", "Honduras", "Indonesia", "United States"
        };

        System.out.println("First and last letter for each country in array");
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            System.out.println(country + ": " + country.charAt(0) + country.charAt(country.length() -1));
        }

        System.out.println("Countries in array that end with letter 'a': ");
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            if(country.charAt(country.length() - 1) == 'a'){
                System.out.println(country);
            }
        }

        String countryNameToCheck = "Canada";
        Arrays.sort(countries);
        int resultOfCheck = Arrays.binarySearch(countries, countryNameToCheck);

        System.out.println(countryNameToCheck + ((resultOfCheck >= 0) ? " is inside array" : " is not inside array"));


    }
}
