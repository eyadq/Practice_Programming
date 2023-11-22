package day12_tasks;

public class Operators {

    public static void main(String[] args) {
        int a = 3,  b = 2;
        long c = (a--+ b) * 2 / 3 % 2;
        System.out.println("c = " + c);

        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;
        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);
        System.out.println("biggest = " + biggest);
    }
}
