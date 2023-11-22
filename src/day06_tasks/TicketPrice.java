package day06_tasks;

public class TicketPrice {

    public static void main(String[] args) {
        String city1 = "Chicago";
        String city2 = "Virgina";
        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        double ticketPrice = baseTicketPrice + (milesBetweenCities / 10.0);

        System.out.println("The ticket price from " + city1 + " to " + city2 + " is " + ticketPrice);

    }
}
