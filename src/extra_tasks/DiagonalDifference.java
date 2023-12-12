package extra_tasks;

public class DiagonalDifference {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };
        System.out.println(diagonalDifference(arr));

        int[][] arr2 = {
                {3, 0, 0, 0},
                {11, 2, 4, 0},
                {4, 5, 6, 0},
                {10, 8, -12, 0}
        };
        System.out.println(diagonalDifference(arr2));
    }

    public static int diagonalDifference(int[][] arr){
        int size = arr.length; //numbers of rows
        //int size2 = arr[0].length; //numbers of columns (or ints in first row), should be same number of rows in square anyways
        int sumOfTopLeftToBottomRight = 0;
        int sumOfTopRightToBottomLeft = 0;
        int indexRowLeftToRight = 0;
        int indexColLeftToRight = 0; //Want to start LeftToRight at [0][0]
        int indexRowRightToLeft = 0;
        int indexColRightToLeft = size - 1; //Want to start RightToLeft at [0][whatever is last here]

        for (int i = 0; i < size; i++) {
            sumOfTopLeftToBottomRight += arr[indexRowLeftToRight + i][indexColLeftToRight + i];
            sumOfTopRightToBottomLeft += arr[indexRowRightToLeft + i][indexColRightToLeft - i];
        }

        return (Math.abs(sumOfTopLeftToBottomRight - sumOfTopRightToBottomLeft));
    }
}
