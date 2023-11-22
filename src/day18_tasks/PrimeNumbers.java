package day18_tasks;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 13;
        boolean isPrime = true;
        for (int i = 1; i < num; i++) {
            if(i != 1 ){
                if(num % i == 0){
                    isPrime = false;
                }
            }


        }

        System.out.println(isPrime);
    }
}
