package day24_tasks;

import java.util.Locale;
import java.util.Scanner;

public class MethodPractice6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next().toLowerCase(Locale.ROOT);

        System.out.println(word + (isPalindrome(word) ? " is a palindrome" : " is not a palindrome") );
    }

    public static boolean isPalindrome(String word){
        String reversed = "";
        for (int i = word.length() -1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return (reversed.equals(word))? true : false;
    }
}
