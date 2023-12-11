package day44_tasks.task1;

import java.util.Arrays;
import java.util.TreeSet;

public class UseCheck {

    public static void main(String[] args) {

        ArrayCheck equalChecker = new ArrayCheck() {
            @Override
            public boolean check(int[] arr1, int[] arr2) {
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                return Arrays.equals(arr1, arr2);
            }
        };

        int[] arrA = {3, 2, 1} ;
        int[] arrB = {1, 3, 2} ;

        boolean result = equalChecker.check(arrA, arrB);
        System.out.println(result);

        ArrayCheck containsChecker = new ArrayCheck() {
            @Override
            public boolean check(int[] arr1, int[] arr2) {
                Integer[] arr1Integer = new Integer[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    arr1Integer[i] = arr1[i];
                }
                Integer[] arr2Integer = new Integer[arr2.length];
                for (int i = 0; i < arr2.length; i++) {
                    arr2Integer[i] = arr2[i];
                }

                TreeSet<Integer> set1 = new TreeSet<>(Arrays.<Integer>asList(arr1Integer));
                TreeSet<Integer> set2 = new TreeSet<>(Arrays.<Integer>asList(arr2Integer));

                int matchCount = 0;

                for (Integer eachIn2 : set2){
                    for (Integer eachIn1 : set1){
                        if (eachIn1 == eachIn2){
                            matchCount++;
                        }
                    }
                }
                return matchCount == set2.size();
            }
        };

        int[] arrC = {1,2,3,4,5,6};
        int[] arrD = {7,8};

        System.out.println(containsChecker.check(arrC, arrD));

        int[] arrE = {4, 4, 6, 5};
        System.out.println(containsChecker.check(arrC, arrE));


    }
}
