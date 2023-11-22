package day15_tasks;

public class MoveFirstWord {

    public static void main(String[] args) {
        String str = "Java is a fun language";
        String firstWord = str.substring(0, str.indexOf(' ')); //Java
        str = str.substring(str.indexOf(' ')).trim() + ' ' + firstWord;
        System.out.println(str);


        System.out.println("-------------------");
        str = "Java is a fun language";
        str = str.substring(str.indexOf(' ')).trim() + ' ' + str.substring(0, str.indexOf(' '));
        System.out.println(str);


    }
}
