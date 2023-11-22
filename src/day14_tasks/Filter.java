package day14_tasks;

import java.util.Scanner;

public class Filter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = input.nextLine().trim();
        String response = "";
        if(message.contains("java is bad") || message.contains("quit") || message.contains("have fun") ||
                message.contains("crying")){
            response = "message failed to send";
        } else {
            response = "\"" + message + "\"" + " sent";
        }
        System.out.println(response);
    }
}
