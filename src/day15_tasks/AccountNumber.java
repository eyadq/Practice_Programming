package day15_tasks;

public class AccountNumber {

    public static void main(String[] args) {
        String accountNumber = "234566";
        if(accountNumber.startsWith("2")){
            if(accountNumber.length() == 7){
                System.out.println("Valid 7-digit account number");
            } else {
                System.out.println("Invalid 7-digit account number");
            }
        } else if(accountNumber.startsWith("5")){
            if(accountNumber.length() == 5){
                System.out.println("Valid 5-digit account number");
            } else {
                System.out.println("Invalid 5-digit account number");
            }
        } else {
            System.out.println("Invalid account number");
        }
    }
}
