package day22_tasks;

import java.util.Scanner;

public class ConvertOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        char[] name = input.next().toCharArray();
        System.out.println("First and last letter of name: " + name[0] + name[name.length - 1]);

    }
}
