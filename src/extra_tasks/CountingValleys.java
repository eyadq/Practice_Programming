package extra_tasks;

public class CountingValleys {

    public static void main(String[] args) {
        String input1 = "UDDDUDUU";
        String input2 = "DDUUUUDDDDDUUU";
        System.out.println(countingValleys(input1));
        System.out.println(countingValleys(input2));
    }

    public static int countingValleys(String input){
        int position = 0;
        int valleyCount = 0;
        boolean inValley = false;

        for (char movement : input.toCharArray()){
            position = (movement == 'U') ? ++position : --position;

        if(position >= 0 && inValley){
                inValley = false;
                valleyCount++;
            }
            if(position < 0 && !inValley){
                inValley = true;
            }
        }
        return valleyCount;
    }
}
