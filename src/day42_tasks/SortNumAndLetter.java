package day42_tasks;

import my_utilities.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortNumAndLetter {

    /*
				Input:
					"DC501GCCCA098911"
				OutPut:
					"CD015ACCCG011899"
     */

    public static void main(String[] args) {
        String input = "DC501GCCCA098911";
        String output = "";
        //System.out.println(sortString("HelloDuck"));

        enum CharType{
            SPECIAL,
            DIGIT,
            LETTER,
        }

        CharType last = null;
        CharType current = null;
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(current == null){
                if(Character.isDigit(ch)){
                    current = CharType.DIGIT;
                } else if(Character.isLetter(ch)){
                    current = CharType.LETTER;
                }  else {
                    current = CharType.SPECIAL;
                }
            } else {
                if(Character.isDigit(ch)){
                    last = current;
                    current = CharType.DIGIT;
                } else if(Character.isLetter(ch)){
                    last = current;
                    current = CharType.LETTER;
                }  else {
                    last = current;
                    current = CharType.SPECIAL;
                }
            }

            if(last != null){
                if(!current.equals(last)){
                    indexes.add(i);
                    if(indexes.size()==1){
                        output += sortString(input.substring(0, indexes.get(0)));
                    } else if (indexes.size() > 1){
                        output += sortString(input.substring(indexes.get(indexes.size()-2), indexes.get(indexes.size()-1)));
                    }
                }
            }
        }
        //One last subtring
        output += sortString(input.substring(indexes.get(indexes.size()-1)));

        System.out.println("Input: " + input + " --> Output: " + output);
    }

    public static String sortString(String str){
        return ArrayUtil.sort(str);
    }

}
