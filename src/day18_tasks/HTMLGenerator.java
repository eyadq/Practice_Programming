package day18_tasks;

public class HTMLGenerator {

    public static void main(String[] args) {

        String str = "li^3";
        String tagType = str.substring(0, str.length() - 2);
        String result = "<" + tagType + ">" + "</" + tagType + ">";

        int num = Integer.parseInt("" + str.charAt(str.length() - 1));

        for (int i = 0; i < num; i++) {
            System.out.print(result);
        }
    }
}
