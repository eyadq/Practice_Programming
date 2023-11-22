package day21_tasks;

import java.util.Locale;

public class Initials {

    public static void main(String[] args) {

        String[] classmates = {"James Bond", "Eve Rell", "Anna Johnson"};
        String result = "";

        for (String classmate : classmates){
            result += (classmate.charAt(0) + "") + classmate.charAt(classmate.indexOf(" ") + 1) + " ";
        }

        System.out.println("result = " + result);
    }
}
