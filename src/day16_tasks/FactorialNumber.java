package day16_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int count = num;
        int result = 1;
        while (count > 0) {
            result *= count;
            count--;
        }
        System.out.println("result = " + result);
    }
}
