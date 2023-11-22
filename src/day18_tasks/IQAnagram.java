package day18_tasks;

public class IQAnagram {

    public static void main(String[] args) {

        String str1 = "peach";
        String str2 = "cheap";

        String temp = str2;

        boolean isAnagram = true;

        if(str1.length() != str2.length()){
            isAnagram = false;
            System.out.println("Anagarams must be of equal length");
        } else {
            //For every char in str, we replace that char in str2 (actually temp to preserve str2) with "*"
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                temp = temp.replaceFirst("" + c, "*");
            }

            //If temp contains anything but "*", then the two words are not anagrams
            for (int i = 0; i < temp.length(); i++) {
                char c = temp.charAt(i);
                if(c != '*'){
                    isAnagram = false;
                }
            }
        }


        System.out.println("isAnagram = " + isAnagram);

    }
}
