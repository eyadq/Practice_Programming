package my_utilities;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringUtil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //task 1
        //System.out.println("Enter name: ");
        //String name = input.nextLine();
        String name = "eYAD IsMail QurAAN";
        System.out.println(name + " has been reformatted into \"Title Case\": " + "\n\t"+ fixFormat(name));

        //task2
        String sentence = "JAVA will ruLE tHe wORLd";
        System.out.println(sentence + " has been reformatted to \"camelCase\":" +"\n\t" + camelCase(sentence));

        //task3
        //System.out.println("Enter a word: ");
        //String word = input.next().toLowerCase();
        //System.out.println("Enter a letter to frequency of occurance in the word: ");
        //char letterToCheck = input.next().toLowerCase().charAt(0);
        String word = "apple";
        char letterToCheck = 'p';
        System.out.println("Occurance of " + letterToCheck + " in " + word +": " + frequencyOfCharacter(word, letterToCheck));

        //task4 & task5
        String str = "aaaaabcccdeeff";

        System.out.println("uniques = " + uniqueCharacters(str));
        System.out.println("duplicates = " + duplicateCharacters(str));

    }

    public static String fixFormat(String name){
        String[] nameArray = name.split(" ");

        for (int i = 0; i < nameArray.length; i++) {
            String nameSplit = nameArray[i]; //will be first name at i=0, middle or last name at i=1, etc.
            String result = (nameSplit.charAt(0) + "").toUpperCase() + nameSplit.substring(1).toLowerCase();
            nameArray[i] = result;
        }

        //System.out.println(Arrays.toString(nameArray));
        String nameFormattedCorrectly = "";
        for (int i = 0; i < nameArray.length; i++) {
            nameFormattedCorrectly = nameFormattedCorrectly + nameArray[i] + " ";
        }
        return nameFormattedCorrectly.trim();
    }

    public static String camelCase(String sentence) {
        String[] words = sentence.split(" ");
        //System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String word = words[i]; //will be first name at i=0, middle or last name at i=1, etc.
            if(i == 0){
                String result = word.toLowerCase();
                words[i] = result;
            } else {
                String result = (word.charAt(0) + "").toUpperCase() + word.substring(1).toLowerCase();
                words[i] = result;
            }
        }
        //System.out.println(Arrays.toString(words));
        String sentenceFormatedCorrectly = "";
        for (int i = 0; i < words.length; i++) {
            sentenceFormatedCorrectly += words[i];
        }
        return sentenceFormatedCorrectly;
    }

    public static int frequencyOfCharacter(String word, char letterToCheck){
        int letterCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char eachLetter = word.charAt(i);
            if(eachLetter == letterToCheck){
                letterCount++;
            }
        }
        return letterCount;
    }

    public static String uniqueAndDuplicateCharacters(String str, String method){
        String uniques = ""; //goal is to fill these 2 strings with correct answer
        String duplicates = ""; //goal is to fill these 2 strings with correct answer
        boolean isUnique = true;
        boolean isDuplicate = false;

        for (int i = 0; i < str.length(); i++) {
            char eachOuter = str.charAt(i);
            isUnique = true; //if a duplicate causes isUnique to become false, must reset before going back to inner loop
            isDuplicate = false; //if a unique causes isDuplicate to switch, must reset before going back to inner loop
            for (int j = 0; j < str.length(); j++) {
                char eachInner = str.charAt(j);
                if (i != j){
                    if(eachInner == eachOuter){
                        isUnique = false;
                        isDuplicate = true;
                    }
                }

            }//inner loop
            if(isUnique){
                uniques += eachOuter;
            } else {
                if(!duplicates.contains(eachOuter + "")){
                    duplicates += eachOuter;
                }
            }
        }//outer loop

        if(method.equals("unique")){
            return uniques;
        } else {
            return duplicates;
        }
    }

    public static String uniqueCharacters(String str){

        return uniqueAndDuplicateCharacters(str, "unique");
    }

    public static String duplicateCharacters(String str){

        return uniqueAndDuplicateCharacters(str, "duplicate");
    }

    public static String matchPatternInString(String str, boolean[] pattern) {
        String result = "";

        //need to repeat pattern every time we went through patterns so, so i % pattern.length:
        for (int i=0;i<str.length();i++){
            if(pattern[i % pattern.length ]){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String reverseString(String str){
        String output = "";
        for (int i = str.length()-1; i >=0; i--) {
            output += str.charAt(i);
        }
        return output;
    }

    public static int countInString(String word, char letter){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==letter) count++;
        }
        return count;
    }

    public static boolean isPalindrome(String word){
        String reversed = reverseString(word);
        return reversed.equals(word);
    }


}
