package day18_tasks;

public class CountUpsLowsNums {

    public static void main(String[] args) {

        String str = "This has multiple words";

        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                spaceCount++;
            }
        }

        System.out.println("There are " + (spaceCount + 1) + " words");
    }
}
