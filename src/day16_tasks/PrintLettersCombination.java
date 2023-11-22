package day16_tasks;

public class PrintLettersCombination {

    public static void main(String[] args) {

        String str = "zyxwv";
        int outerCount = 0;
        int innerCount = 0;

        while (outerCount < str.length()){
            String temp = "" + str.charAt(outerCount);
            innerCount = 0;

            while (innerCount < str.length()){
                String word = temp + str.charAt(innerCount);
                System.out.println(word);
                innerCount++;
            }
            outerCount++;
        }
    }
}
