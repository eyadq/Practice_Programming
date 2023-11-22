package day29_tasks;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class AllPalindrome {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));

        System.out.println(allPalindrome(words));
    }

    public static ArrayList<String> allPalindrome(ArrayList<String> lists){
        ArrayList<String> palindromes = new ArrayList<>();
        for (String word: lists){
            boolean isPalindrome = StringUtil.isPalindrome(word.toLowerCase());
            if(isPalindrome)
                palindromes.add(word);
        }
        return palindromes;

    }
}
