package day22_tasks;

public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "It started to snow in Chicago";
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() -1 ; j >= 0; j--) {
                result += words[i].charAt(j);
            }
            result += " "; //Add space between words
        }
        System.out.println("result = " + result.trim());
    }
}
