package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Cat", "in", "the", "hat"));

        System.out.println(swappedWords(words));
    }

    public static ArrayList<String> swappedWords(ArrayList<String> list){
        ArrayList<String> swapped = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i%2==0){
                swapped.add(list.get(i+1));
                swapped.add(list.get(i));
            }
        }
        return swapped;
    }

    public static ArrayList<String> swappedWords2(ArrayList<String> list){
        ArrayList<String> swapped = new ArrayList<>();
        for (int i = 0; i < list.size(); i+=2) {
            swapped.add(list.get(i+1));
            swapped.add(list.get(i));
        }
        return swapped;
    }


}
