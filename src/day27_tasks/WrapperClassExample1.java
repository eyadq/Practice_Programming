package day27_tasks;

public class WrapperClassExample1 {

    public static void main(String[] args) {
        System.out.println(equalUpperLowerInString("Java"));
        System.out.println(equalUpperLowerInString("JAVA java"));

    }

    public static boolean equalUpperLowerInString(String str){
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isUpperCase(each)){
                upperCount++;
            }
            if(Character.isUpperCase(each)){
                lowerCount++;
            }
        }
        return upperCount == lowerCount;
    }
}
