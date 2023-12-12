package extra_tasks;

public class TotalCandles {

    public static void main(String[] args) {
        int[] candles = {4, 4, 1, 3};
        System.out.println(candlesBlowOut(candles));

    }

    public static int candlesBlowOut(int[] arr){
        int tallest = 1;
        int numberOfTallest = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > tallest)
                tallest = arr[i];
        }

        for (int heightCandle : arr){
            if(heightCandle == tallest)
                numberOfTallest++;
        }

        return numberOfTallest;
    }
}
