package day14_tasks;

import java.util.Scanner;

public class Website {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a url: ");
        String url = input.nextLine();
        boolean isValidStart = false;
        boolean isValidEnd = false;

        if(url.startsWith("www")){
            isValidStart = true;
        } else {
            System.out.println("Url should start with \"www\"");
        }

        if(url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net")){
            isValidEnd = true;
        } else {
            System.out.println("Url should end with a proper domain such as \".com\", \".edu\", \".gov\", or \".net\"");
        }

        if(isValidStart && isValidEnd){
            System.out.println("The Url is valid");
        }


    }
}
