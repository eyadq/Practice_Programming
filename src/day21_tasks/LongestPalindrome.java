package day21_tasks;

public class LongestPalindrome {

    public static void main(String[] args) {
        //String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String[] words = {"abc", "dna", "kevin", "joe", "lamp"};

        for (int i = 0; i < words.length; i++) {
            String reverse = "";

            for (int j = words[i].length() -1; j >=0; j--) {
                reverse += words[i].charAt(j);
            }
            if(!reverse.equals(words[i])){
                words[i] = "*";
            }
        }

        int indexOflargest = 0;
        int biggestLength = 0;
        boolean containsPalindrome = false;
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + ": " + words[i].equals("*"));
            if(!words[i].equals("*")){
                containsPalindrome = true;
                if(words[i].length() > biggestLength){
                    biggestLength = words[i].length();
                    indexOflargest = i;
                }
            }
        }

        if(containsPalindrome){
            System.out.println("Largest palindrome:" + words[indexOflargest]);
        } else {
            System.out.println("No palindrome");
        }
    }
}
