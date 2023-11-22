package day34_tasks;

public class AllClassesBook {

    public static void main(String[] args) {
        Book harrypotter = new Book("Harry Potter", "JK Rowling", "Fantasy", 25, 20, true);
        System.out.println(harrypotter);

        AudioBook harrypotter2 = new AudioBook("Harry Potter", "JK Rowling", "Fantasy", 25, 20, true, 200, "Goofy Goof");
        System.out.println(harrypotter2);
        harrypotter2.listen();

        EBook harrypotter3 = new EBook("Harry Potter", "JK Rowling", "Fantasy", 25, 20, true, 6, 400);
        System.out.println(harrypotter3);
        harrypotter3.read();
    }
}
