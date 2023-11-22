package day18_tasks;

public class BiggestSubstring {

    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String biggest = "";

        for (int i = 0; i < str.length(); i++) {
            String sub = "";
            char outerLoop = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char innerLoop = str.charAt(j);
                if(innerLoop == outerLoop){
                    sub += innerLoop;
                }

                if(sub.length() > biggest.length()){
                    biggest = sub;
                }
            }
        }

        System.out.println("biggest = " + biggest);

    }
}
