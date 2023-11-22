package day18_tasks;

public class CamelCase {

    public static void main(String[] args) {

        String str = "Today is SUNDAY";
        String camelCase = "" + str.substring(0, str.indexOf(" ")).toLowerCase();
        String sub = "";


        System.out.println(camelCase);
        for (int i = 0; i < str.length(); i++) {
            sub = "";
            String each = "" + str.charAt(i);
            if(each.equals(" ")){
                if(str.contains(" ")){
                    sub = str.substring(i + 1, str.indexOf(" "));
                    sub = sub.substring(0, 1).toUpperCase() + sub.substring(1).toLowerCase();
                    camelCase += sub;
                    str = str.replaceFirst(" ", "*");
                }

            }
        }

        System.out.println(camelCase);
    }
}
