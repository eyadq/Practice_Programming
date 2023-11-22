package day18_tasks;

public class SpaceProgram {

    public static void main(String[] args) {

        //String str = "more words";
        String str = "java";

        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(each == ' '){
                newString = newString + '_' + ' ';
            } else {
                newString = newString + each + ' ';
            }

        }
        newString = newString.trim();
        System.out.println("|" + newString + "|");



    }
}
