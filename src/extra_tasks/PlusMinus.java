package extra_tasks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlusMinus {

    public static void main(String[] args) {

        int[] arr = {1,1,0,-1,-1};
        int[] arr2 = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr2);
    }

    public static void plusMinus(int[] arr){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr){
            if(num == 0){
                zeroCount++;
            } else if(num > 0){
                positiveCount++;
            } else {
                negativeCount++;
            }
        }


        int all = positiveCount + negativeCount + zeroCount;

        BigDecimal positiveRatio = BigDecimal.valueOf((double) positiveCount / all).setScale(6, RoundingMode.HALF_DOWN);
        BigDecimal negativeRatio = BigDecimal.valueOf((double) negativeCount / all).setScale(6, RoundingMode.HALF_DOWN);
        BigDecimal zeroeRatio = BigDecimal.valueOf((double) zeroCount / all).setScale(6, RoundingMode.HALF_DOWN);

        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroeRatio);
    }
}
