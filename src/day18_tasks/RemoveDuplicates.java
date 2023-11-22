package day18_tasks;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abcabc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!result.contains("" + c)){
                result += c;
            }
        }

        System.out.println("result = " + result);
    }
}
