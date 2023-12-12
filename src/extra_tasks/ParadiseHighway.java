package extra_tasks;

import java.util.Arrays;

public class ParadiseHighway {

    public static void main(String[] args) {

        int[] width = {2, 3, 1, 2, 3, 2, 3, 3};
        int[][] cases = {{0, 3}, {4, 6}, {6, 7},{3, 5},{0, 7}};
        System.out.println(Arrays.toString(getMaxCarWidth(width, cases)));
    }

    public static int[] getMaxCarWidth(int[] width, int[][] cases){
        int[] widths = new int[cases.length];


        for (int i = 0; i < cases.length; i++) {
            int indexLength = cases[i][1] - cases[i][0] + 1;
            int smallest = Integer.MAX_VALUE;
            for (int j = cases[i][0]; j < indexLength + cases[i][0]; j++) {
                if( width[j] < smallest ){
                    smallest = width[j];
                }
                widths[i] = smallest;
            }
        }

        return widths;
    }
}
