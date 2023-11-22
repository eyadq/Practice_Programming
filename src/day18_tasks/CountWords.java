package day18_tasks;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first sentence: ");
        String str = input.nextLine();
        System.out.println("Enter first sentence: ");
        String str2 = input.nextLine();

        boolean isVaild = true;
        if(str.length() < 6 && str2.length() < 6){
            System.out.println("Invalid data");
            isVaild = false;
        }

        String email = "";
        if(isVaild){
            email = str.substring(0,4) + str2.substring(str2.length() -3, str2.length()) + "@loopcamp.io";
            System.out.println("email = " + email);
        }
    }


}
