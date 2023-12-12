package day42_tasks;

import java.util.HashMap;
import java.util.Map;

public class Brackets {

    public static void main(String[] args) {
        String[] inputs = {"{([])}", "{[(])}"};
        for (String input: inputs){
            System.out.println(input +  " is balanced: " +isBalanced(input));
        }
    }

    public static boolean isBalanced(String input){
        Map<Character, Character> matches = new HashMap<>();
        matches.put('{', '}');
        matches.put('}', '{');
        matches.put('[', ']');
        matches.put(']', '[');
        matches.put('(', ')');
        matches.put(')', '(');
        matches.put('}', '{');
        matches.put('>', '<');

        if(input.length()  % 2 != 0){
            return false;
        }
        boolean balanced = true;

        int backCount = input.length() - 1;
        for (int i = 0; i < input.length()/2; i++) {
            Character chStart = input.charAt(i);
            Character chEnd = input.charAt(backCount);
            if(!matches.get(chStart).equals(chEnd)){
                return false;
            }
            backCount--;
        }
        return true;
    }
}
