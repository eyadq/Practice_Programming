package day29_tasks;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countLetters(words, 'a'));
    }

    public static int countLetters(ArrayList<String> words, char letter) {
        int count = 0;
        for (String word: words) {
            count += StringUtil.countInString(word, letter);
        }
        return count;
    }
}
