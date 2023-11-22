package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TargetWord {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(frequencyWord(list, "java"));
        System.out.println(frequencyWord2(list, "java"));


    }
    public static int frequencyWord(ArrayList<String> list, String word){
        int count = 0;
        for (String each: list) {
            if(each.equals(word)){
                count++;
            }
        }

        return count;
    }

    public static int frequencyWord2(ArrayList<String> list, String word){
        return Collections.frequency(list, word);
    }
}
