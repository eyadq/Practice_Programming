package day29_tasks;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongStrings {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("one", "two", "three", "four", "five", "six"));

        System.out.println(removeLongStrings(list, 4));

    }

    public static ArrayList<String> removeLongStrings(ArrayList<String> list, int tooLarge){
        ArrayList<String> shorties = new ArrayList<>(list);
        shorties.removeIf(each -> each.length()>=tooLarge);
        return shorties;

    }
}
