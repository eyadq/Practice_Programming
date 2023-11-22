package day34_tasks;

public class Book {

    private String title;
    private String author;
    private String genre;
    private int chapters;
    private double price;
    private boolean hasMovie;

    public Book(String title, String author, String genre, int chapters, double price, boolean hasMovie) {
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setChapters(chapters);
        setPrice(price);
        setHasMovie(hasMovie);
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author +
                "\n\tGenre: " + genre +
                "\n\tChapters: " + chapters +
                "\n\tPrice: $" + price +
                "\n\tHas A Movie: " + hasMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getHasMovie() {
        return hasMovie;
    }

    public void setHasMovie(boolean hasMovie) {
        this.hasMovie = hasMovie;
    }
}
