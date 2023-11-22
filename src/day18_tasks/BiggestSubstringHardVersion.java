package day18_tasks;

public class BiggestSubstringHardVersion {

    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String biggest = "";
        String sub = "";
        boolean isBetweenMatches = false;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentLetter = str.charAt(i);
            //int amountOfCharsBefore = i; //Amount of letters before current Index is equal to the index
            //Length of string - 1 (to account for indexes difference from length) - 1 (for the current char) - before chars
            //int amountOfCharsAfter = str.length() - 1 - 1 - amountOfCharsBefore;


            if (i < str.length() - 2) { //not last index
                //      char previousLetter = str.charAt(i - 1);
                char nextLetter = str.charAt(i + 1);

                if (currentLetter == nextLetter) {
                    sub += currentLetter;
                } else {
                    if(sub.length() > biggest.length()){
                        biggest = sub;
                    }
                    sub = "";
                }
            }

        }


        System.out.println("biggest = " + sub);


    }
}
