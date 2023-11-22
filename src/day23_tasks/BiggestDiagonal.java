package day23_tasks;

import java.util.Arrays;

public class BiggestDiagonal {

    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10}
        };

        int maxIndex = arr.length - 1; //in array size 3, biggest index is 2

        int[][] diagonals = new int[2][arr.length];
        int counter = 0;
        //This array takes each of the two diagonals and puts the numbers in each diagonal in array
        for (int i = 0; i < diagonals.length; i++) {
            counter = 0;
            for (int j = maxIndex; j >=0 ; j--) {
                //We can only have two diagonals, one for i==0 and one for i==1
                if(i == 0){
                    diagonals[i][j] = arr[maxIndex-counter][maxIndex-counter];
                } else if(i == 1){
                    diagonals[i][j] = arr[counter][maxIndex-counter];
                }
                counter++;
            }


        }
        //System.out.println(Arrays.deepToString(diagonals));

        int biggestIndex = 0;
        int biggestValue = 0;
        int sub = 0;
        for (int i = 0; i < diagonals.length; i++) {
            //System.out.println("diagonals "+ i + ":" +Arrays.toString(diagonals[i]));
            sub = 0;
            for (int j = 0; j < diagonals[i].length; j++) {
                sub += diagonals[i][j];
            }
            if(sub > biggestValue){
                biggestValue = sub;
                biggestIndex = i;
            }
        }
        //System.out.println("biggestValue = " + biggestValue);
        for (int i = 0; i < diagonals[biggestIndex].length; i++) {
            if(i == diagonals[biggestIndex].length - 1){
                System.out.print(diagonals[biggestIndex][i]);
            } else {
                System.out.print(diagonals[biggestIndex][i] +  ", ");
            }

        }


    }
}
