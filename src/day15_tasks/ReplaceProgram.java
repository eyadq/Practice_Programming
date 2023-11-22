package day15_tasks;

import java.util.Scanner;

public class ReplaceProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = input.nextLine();
        System.out.print("Enter option: ");
        int option = input.nextInt();

        boolean isValid = true;
        char oldChar = '!';
        char newChar = '@';
        switch(option){
            case 1:
                oldChar = 'a';
                newChar = 'e';
                break;
            case 2:
                oldChar = 's';
                newChar = 'r';
                break;
            case 3:
                oldChar = 'o';
                newChar = 'z';
                break;
            default:
                isValid = false;
        }

        while(message.contains(oldChar + "")){
            message = message.replace(oldChar, newChar);
        }

        System.out.println(message);


    }
}
