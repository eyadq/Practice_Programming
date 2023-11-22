package day27_tasks;

public class ValidPassword {

    public static void main(String[] args) {

    }

    public static boolean validPassword(String str){
        int characterCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int specialCount = 0;
        //! @ # $ % ^ & *
        boolean containsExclamation = str.contains("!");
        boolean containsAt = str.contains("@");
        boolean containsPound= str.contains("#");
        boolean containsDollar= str.contains("$");
        boolean containsPercentage= str.contains("%");
        boolean containsCarrot= str.contains("^");
        boolean containsAnd= str.contains("&");
        boolean containsAsterisk= str.contains("*");

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isUpperCase(each)){
                upperCount++;
            } else if(Character.isLowerCase(each)){
                lowerCount++;
            } else if(Character.isDigit(each)){
                digitCount++;
            } else {
                specialCount++;
            }
        }
        characterCount = upperCount + lowerCount + digitCount + specialCount;
        boolean enoughCharacters = (characterCount>8) && (upperCount>1) && (lowerCount>1) && (digitCount>1);
        boolean hasEnoughSpecials = containsExclamation || containsAt || containsPound || containsDollar ||
                containsPercentage || containsCarrot || containsAnd || containsAsterisk;

        return enoughCharacters && hasEnoughSpecials;
    }
}
