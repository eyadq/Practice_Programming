package day05_tasks;

public class Movie {

    public static void main(String[] args) {

        String name = "Jaws";
        String date = "June 20, 1975";
        String genre = "natural horror film";
        String rottenTomatoesRating = "11%";
        String rating = "1/5";
        int duration = 8;
        boolean isSequel = false;
        boolean isOnDvd = true;

        String welcome = "------ Welcome to the Cinema ------\nTonight we are streaming " + name +
                " which was released on " + date + "\n" +
                "This " + genre + " got a " + rottenTomatoesRating + " on Rotten Tomatoes.\n" +
                "The rating is " + rating + " and it runs for " + duration + " hours.\n" +
                " This is a sequel "+ isSequel + " and is on dvd " + isOnDvd + " .";

        System.out.println(welcome);
    }
}
