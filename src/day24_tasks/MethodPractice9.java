package day24_tasks;

import java.util.Arrays;

public class MethodPractice9 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2};

        arrayChecker(arr);
    }

    public static void arrayChecker(int[] arr){
        int[] result = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                result[0]++;
            } else {
                result[1]++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
