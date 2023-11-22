package day28_tasks;

import java.util.ArrayList;

public class GetUppercaseOrLowercase {

    public static void main(String[] args) {

        String str = "heLLoWoRlD";
        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> lower = new ArrayList<>();
        seperateCharacters(str, upper, lower);
        System.out.println(upper);
        System.out.println(lower);
    }

    public static void seperateCharacters(String str, ArrayList<String> upper, ArrayList<String> lower){
        for (char character: str.toCharArray()){
            if(Character.isUpperCase(character)) upper.add("" + character);
            if(Character.isLowerCase(character)) lower.add("" + character);

        }
    }
}
