package day23_tasks;

public class LastChars {

    public static void main(String[] args) {

        String[][] arr = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = "";

            for (int j = 0; j < arr[i].length; j++) {
                String word = arr[i][j];
                result += word.charAt(word.length() - 1);

            }
            System.out.println(result);

        }
    }
}
