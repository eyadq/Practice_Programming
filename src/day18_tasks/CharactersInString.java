package day18_tasks;

public class CharactersInString {

    public static void main(String[] args) {

        String str = "java";

        String result ="";
        String resultWithSpaces = "";

        for (int i = 0; i < str.length(); i++) {
            result += (int)str.charAt(i);
            resultWithSpaces = resultWithSpaces + (int)str.charAt(i) + " ";
        }
        resultWithSpaces = resultWithSpaces.trim();

        System.out.println("result = " + result);
        System.out.println("resultWithSpaces = " + resultWithSpaces);
    }
}
