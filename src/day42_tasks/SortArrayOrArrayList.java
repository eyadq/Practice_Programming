package day42_tasks;

import java.util.*;

public class SortArrayOrArrayList {

    public static void main(String[] args) {
        String str = "DC501GCCCA098911";

        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(Arrays.toString(sortCollection(arr)));
    }

    public static String[] sortCollection(String[] arr){
        return new String[0];
    }
}
