package day15_tasks;

import java.util.Scanner;

public class RemoveFirstAndLast {

    public static void main(String[] args) {
        String str = "apple banana";
        System.out.println(str.substring(1, str.indexOf(' ')));
        System.out.println(str.substring(str.indexOf(' ') + 1, str.length() - 1));
    }
}
