package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 3, 5, 1, 4, 5, 9));

        System.out.println(removeDuplicates(numbers));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> noDuplicates = new ArrayList<>(list);
        noDuplicates.removeIf(number -> Collections.frequency(noDuplicates, number)>1);
        return noDuplicates;
    }
}
