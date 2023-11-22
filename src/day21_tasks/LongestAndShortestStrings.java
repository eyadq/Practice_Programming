package day21_tasks;

public class LongestAndShortestStrings {

    public static void main(String[] args) {

        String[] words = {"Java", "is", "a", "very", "popular", "language"};
        String largest = "";
        String smallest ="------------------------------------------------------------------------------------------";

        for (String word: words){
            if(smallest.length() > word.length()){
                smallest = word;
            }
            if(largest.length() < word.length()){
                largest = word;
            }
        }
        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);
    }
}
