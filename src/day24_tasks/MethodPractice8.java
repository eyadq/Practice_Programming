package day24_tasks;

import java.util.Scanner;

public class MethodPractice8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a whole number for row " + i + " of array: ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter a whole number to check if it is in array: ");
        int toBeChecked = input.nextInt();

        System.out.println(toBeChecked + ((numberCheck(arr, toBeChecked)) ? " is in array" : " is not in array") );
    }

    public static boolean numberCheck(int[] arr, int toBeChecked){
        boolean isInArray = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == toBeChecked){
                isInArray = true;
            }
        }
        return isInArray;
    }
}
