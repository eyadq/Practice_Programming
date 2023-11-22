package day28_tasks;

import java.util.ArrayList;

public class SeperateParts {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        seperateParts(str, letters, special, digits);
        System.out.println(letters);
        System.out.println(special);
        System.out.println(digits);
    }

    public static void seperateParts(String str, ArrayList<Character> letters, ArrayList<Character> special, ArrayList<Character> digits){
        for (char character: str.toCharArray()){
            if(Character.isAlphabetic(character)) letters.add(character);
             else if(Character.isDigit(character)) digits.add(character);
             else special.add(character);

        }
    }
}
