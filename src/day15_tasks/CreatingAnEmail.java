package day15_tasks;

import java.util.Scanner;

public class CreatingAnEmail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String first = input.nextLine().toLowerCase();
        System.out.print("Enter another string: ");
        String second = input.nextLine().toLowerCase();

        boolean isValid = true;
        String username = "";

        if(first.length()<6 || second.length()<6){
            System.out.println("Invalid Data");
            isValid = false;
        }

        if(isValid){
            username += first.charAt(0) + "";
            username += first.charAt(1) + "";
            username += first.charAt(2) + "";
            username += first.charAt(3) + "";
            username += second.charAt(second.length()-3) + "";
            username += second.charAt(second.length()-2) + "";
            username += second.charAt(second.length()-1) + "";
            username += "@loopcamp.io";
            System.out.println(username);
        }


    }
}
