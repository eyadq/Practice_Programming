package day12_tasks;

import java.util.Scanner;

public class CharUpperCaseLowerCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char c = input.next().charAt(0);
        boolean isUpperCase = c >= 'A' && c <= 'Z';
        boolean isLowerCase = c >= 'a' && c <= 'z';

        if(isUpperCase){
            int lowercase = c + 32;
            System.out.println(c + " has been converted to lowercase: " + (char)lowercase);
        }
        if(isLowerCase) {
            int uppercase = c - 32;
            System.out.println(c + " has been converted to uppercase: " + (char)uppercase);
        }
    }
}
