package day33_tasks;

public class DebitCard {

    private long cardNumber;
    private String nameHolder;
    private String cardType;
    private int pin;
    private double balance;
    private static String accountType;

    static{
        accountType = "debit";
    }

    public DebitCard(long cardNumber, String nameHolder, double balance) {
        setCardNumber(cardNumber);
        setNameHolder(nameHolder);
        setBalance(balance);
    }

    public DebitCard(long cardNumber, String nameHolder, String cardType, int pin, double balance) {
        this(cardNumber, nameHolder, balance);
        setCardType(cardType);
        setPin(pin);
        setBalance(balance);
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if((""+cardNumber).length()!=16){
            System.out.println("Card number must be 16 digits long");
            cardNumber = 0;
        }

        this.cardNumber = cardNumber;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        cardType = cardType.toLowerCase().trim();
        switch (cardType){
            case "mastercard":
                cardType = "MasterCard";
                break;
            case "visa":
                cardType = "Visa";
                break;
            default:
                System.out.println("We only accept cards from \"MasterCard\" and \"Visa\".");
                cardType = null;
                break;
        }
        this.cardType = cardType;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        if((""+pin).length()!=4){
            System.out.println("Pin must be 4 characters long");
            pin = 9;
        }
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getAccountType() {
        return accountType;
    }

    public static void setAccountType(String accountType) {
        DebitCard.accountType = accountType;
    }

    @Override
    public String toString() {
        String output = "";

        if(cardNumber==0){
            output = "Invalid card. Number must be 16 digits long.";
        } else {
            int pinSize = (""+pin).length();
            String pinOutput = pinSize==4 ? ""+pin : "Invalid pin size, card will is not active.";

            output = "DebitCard{" +
                    "cardNumber=" + cardNumber +
                    ", nameHolder='" + nameHolder + '\'' +
                    ", cardType='" + cardType + '\'' +
                    ", pin=" + pinOutput +
                    ", balance=" + balance +
                    '}';
        }
        return output;
    }
}
