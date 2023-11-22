package day34_tasks;

public class AudioBook extends Book{

    private double duration;
    private String narrator;

    public AudioBook(String title, String author, String genre, int chapters, double price, boolean hasMovie, double duration, String narrator) {
        super(title, author, genre, chapters, price, hasMovie);
        setDuration(duration);
        setNarrator(narrator);
    }

    public void listen(){
        System.out.println("Listening to " + getTitle() + " narrated by " + getNarrator());
    }

    @Override
    public String toString() {
        return "AudioBook: " + getTitle() + " by " + getAuthor() +
                "\n\tNarrated by: " + getNarrator() +
                "\n\tDuration: " + getDuration() +
                "\n\tGenre: " + getGenre() +
                "\n\tChapters: " + getChapters() +
                "\n\tPrice: $" + getPrice() +
                "\n\tHas A Movie: " + getHasMovie();
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
