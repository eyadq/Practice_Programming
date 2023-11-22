package day29_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));

        System.out.println(removeBadPairs(list));

    }

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> list){{
        ArrayList<Integer> goodPairsOnly = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2) {
            if(list.get(i)<= list.get(i+1)){
                goodPairsOnly.add(list.get(i));
                goodPairsOnly.add(list.get(i+1));
            }
        }

        return goodPairsOnly;
    }

    }
}
