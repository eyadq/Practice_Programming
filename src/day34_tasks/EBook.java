package day34_tasks;

public class EBook extends Book{

    private double size;
    private int pages;

    public EBook(String title, String author, String genre, int chapters, double price, boolean hasMovie, double size, int pages) {
        super(title, author, genre, chapters, price, hasMovie);
        setSize(size);
        setPages(pages);
    }

    public void read(){
        System.out.println("Reading a digital copy of " + getTitle());
    }

    @Override
    public String toString() {
        return "EBook: " + getTitle() + " by " + getAuthor() +
                "\n\tGenre: " + getGenre() +
                "\n\tChapters: " + getChapters() +
                "\n\tPrice: $" + getPrice() +
                "\n\tHas A Movie: " + getHasMovie() +
                "\n\tSize: " + getSize() + "MB" +
                "\n\tPages: " + getPages();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
