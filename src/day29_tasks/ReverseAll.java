package day29_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseElementsInList(list));

    }

    public static ArrayList<String> reverseElementsInList(ArrayList<String> list){
        ArrayList<String> reversedList = new ArrayList<>();

        for (String word: list){
            String str = my_utilities.StringUtil.reverseString(word);
            reversedList.add(str);
        }
        return reversedList;
    }
}
