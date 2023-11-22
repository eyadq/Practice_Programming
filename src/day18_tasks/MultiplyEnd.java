package day18_tasks;

public class MultiplyEnd {

    public static void main(String[] args) {
        String str = "computer";
        int num =5;

        String sub = "";

        for (int i = 0; i < num; i++) {
            sub += str.charAt(str.length() - 1);
        }

        System.out.println(str + sub);
    }
}
