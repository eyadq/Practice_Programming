package day23_tasks;

import java.util.Arrays;

public class NumRange {

    public static void main(String[] args) {

        int[][] result = new int[10][10];
        int count = 1;

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = count;
                count++;
            }

        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
