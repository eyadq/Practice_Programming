package day23_tasks;

public class AverageOfEach {

    public static void main(String[] args) {

        int[][] arr = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double sumTotal = 0;
        double sumInnerArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumInnerArray = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumTotal += arr[i][j];
                sumInnerArray += arr[i][j];
            }


        }
    }
}
