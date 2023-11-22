package day16_tasks;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abcabc";
        String result = "";

        int count = 0;
        while (count < str.length()){
            if(!result.contains(str.charAt(count) + "")){
                result += str.charAt(count);
            }
            count++;
        }

        System.out.println("result = " + result);
    }
}
