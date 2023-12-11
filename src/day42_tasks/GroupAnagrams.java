package day42_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<String> listABT = new ArrayList<>();
        List<String> listAET = new ArrayList<>();
        List<String> listANT = new ArrayList<>();

        for (String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            if(Arrays.equals(arr, new char[]{'a', 'b', 't'})){
                listABT.add(word);
            } else if(Arrays.equals(arr, new char[]{'a', 'e', 't'})){
                listAET.add(word);
            } else if(Arrays.equals(arr, new char[]{'a', 'n', 't'})){
                listANT.add(word);
            }
        }

        System.out.println("listABT = " + listABT);
        System.out.println("listAET = " + listAET);
        System.out.println("listATN = " + listANT);
    }

}
