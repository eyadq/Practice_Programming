package day18_tasks;

public class CountJava {

    public static void main(String[] args) {

        String str = "java is a language. Java is good language".toLowerCase();

        String temp =  str.replace("java", "*");
        int count = 0;

        for (int i = 0; i < temp.length(); i++) {
            String each = "" + temp.charAt(i);
            if(each.equals("*")){
                count++;
            }

        }

        System.out.println("temp = " + temp);
        System.out.println("count = " + count);
    }
}
