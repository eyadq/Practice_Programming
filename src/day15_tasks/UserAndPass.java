package day15_tasks;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        boolean isValid = true;
        if(password.length() < 5){
            System.out.println("Password must be at least 5 characters");
            isValid = false;
        }

        if(password.toLowerCase().contains(username.toLowerCase())){
            System.out.println("Invalid password, username should not be in it\nPassword has been reset to \"password\"");
            password = "password";
            isValid = false;
        }

        if(isValid){
            System.out.println("Valid password");
        }
    }
}
