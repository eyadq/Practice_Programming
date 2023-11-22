package day15_tasks;

public class LongestWithA {

    public static void main(String[] args) {
        String one = "java";
        String two = "mouse";
        String three = "computer";

        int charCount = 0;
        String biggest = "";

        char findThis = 'a';
        //This way we are finding the words with "a" if no a the size is 0
        if (!one.contains(findThis + "")) {
            one = "";
        }
        if (!two.contains(findThis + "")) {
            two = ""; // mouse  --- 5 --- wordTwo --- > 0;
        }
        if (!three.contains(findThis + "")){
            three ="";
        }


        if (one.length() >= two.length() && one.length() >= three.length()) {
            biggest = "The longest with a: " + one;
        } else if (two.length() >= one.length() && two.length() >= three.length()) {
            biggest = "The longest with a: " + two;
        } else if (three.length() >= one.length() && three.length() >= two.length()) {
            biggest = "The longest with a: " + three;
        }
        System.out.println(biggest);


    }
}
