package extra_tasks;

public class RepeatedString {

    public static void main(String[] args) {
        //System.out.println(countAInString("abcac", 10));
        System.out.println(countAInString("aba", 10));

    }

    public static int countAInString(String str, int length){
        int realLength = length / str.length();
        int remainder = length % str.length();

        int aCountInStr = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a')
                aCountInStr++;
        }

        int aCountInRemainder = 0;
        for (int i = 0; i < remainder; i++) {
            if(str.charAt(i) == 'a')
                aCountInRemainder++;
        }

        int aCountTotal = aCountInStr * realLength + aCountInRemainder;


        return aCountTotal;
    }
}
