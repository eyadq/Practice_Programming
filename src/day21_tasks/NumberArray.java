package day21_tasks;

public class NumberArray {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + numbers[i] + " has value of " + numbers[i]);
        }
    }
}
