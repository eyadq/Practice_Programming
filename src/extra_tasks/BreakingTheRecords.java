package extra_tasks;

public class BreakingTheRecords {

    public static void main(String[] args) {

        int[] scores = {12, 24, 10, 24};
        int[] records = bestRecords(scores);
        System.out.println(records[0] + " " + records[1]);

        int[] scores2 = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] records2 = bestRecords(scores2);
        System.out.println(records2[0] + " " + records2[1]);

        int[] scores3 = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] records3 = bestRecords(scores3);
        System.out.println(records3[0] + " " + records3[1]);


    }

    public static int[] bestRecords(int[] scores){
        if(scores.length ==0){
            return new int[]{0, 0};
        } else if(scores.length ==1){
            return new int[]{scores[0], scores[0]};
        }

        int min = scores[0];
        int recordsLow = 0;
        int max = scores[0];
        int recordsHigh = 0;

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
                recordsHigh++;
            }
            if(scores[i] < min){
                min = scores[i];
                recordsLow++;
            }
        }


        return new int[]{recordsHigh, recordsLow};
    }
}
