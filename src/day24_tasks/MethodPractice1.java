package day24_tasks;

public class MethodPractice1 {

    public static void main(String[] args) {

        int num = 100;

        System.out.println("Even numbers to " + num);
        printEvenNumbers(num);
        System.out.println("\nOdd numbers to " + num);
        printOddNumbers(num);


    }

    public static void printEvenNumbers(int num){
        for (int i = 0; i <= num; i++) {
            if(i%2 ==0){
                System.out.print(i + " ");
            }
        }

    }
    public static void printOddNumbers(int num){
        for (int i = 0; i <= num; i++) {
            if(i%2 ==0){
                System.out.print(i + " ");
            }
        }

    }
}
