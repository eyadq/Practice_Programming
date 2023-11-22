package day18_tasks;

public class Syllables {

    public static void main(String[] args) {

        String str = "ja-va";

        int dashCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) == '-') {
                dashCount++;
            }
        }
        System.out.println("Syllable count: " + (dashCount + 1));
    }
}
