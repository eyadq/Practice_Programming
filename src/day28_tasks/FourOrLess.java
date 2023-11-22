package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        shortStringCheck(list);
        shortStringCheck2(list);
    }

    public static void shortStringCheck(ArrayList<String> list){
        ArrayList<String> words = new ArrayList<>();
        for (String word: list) {
            if(word.length()<=4){
                words.add(word);
            }
        }
        System.out.println(words);
    }

    public static void shortStringCheck2(ArrayList<String> list){
        ArrayList<String> words = new ArrayList<>(list);
        words.removeIf(word -> word.length()>4);

        System.out.println(words);
    }
}
