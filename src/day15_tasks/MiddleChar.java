package day15_tasks;

public class MiddleChar {

    public static void main(String[] args) {
        String str = "12345"; //middle of even will be two characters, odd will be one
        String middle = "";
        int half = str.length() / 2;

        if(str.length() % 2 == 0){
            middle += "" + str.charAt(half - 1) + str.charAt(half);
        } else {
            middle += str.charAt(half);
        }
        System.out.println(middle);
    }
}
