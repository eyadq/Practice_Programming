package day29_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersToSum {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("123", "34", "513"));
        System.out.println(numbersToSum(list));

    }

    public static ArrayList<Integer> numbersToSum(ArrayList<String> list){
        ArrayList<Integer> sums = new ArrayList<>();
        for (String numbers: list) {
            int sum = 0;
            for (int i = 0; i < numbers.length(); i++) {
                sum += Integer.parseInt("" + numbers.charAt(i));
            }
            sums.add(sum);
        }
        return sums;
    }
}
