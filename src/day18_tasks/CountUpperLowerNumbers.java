package day18_tasks;

public class CountUpperLowerNumbers {

    public static void main(String[] args) {


        int numberCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;

        String str = "2juMp41EEkd4s4";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                numberCount++;
            } else if(c >= 'A' && c <= 'Z'){
                upperCount++;
            } else if(c >= 'a' && c <= 'z'){
                lowerCount++;
            } else {
                specialCount++;
            }
        }

        System.out.println("numberCount = " + numberCount);
        System.out.println("upperCount = " + upperCount);
        System.out.println("lowerCount = " + lowerCount);
        System.out.println("specialCount = " + specialCount);

    }
}
