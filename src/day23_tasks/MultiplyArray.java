package day23_tasks;

import java.util.Arrays;

public class MultiplyArray {

    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20},
        };

        int[][] arr2 = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };

        int[][] result = new int[arr1.length][arr1[1].length];

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
