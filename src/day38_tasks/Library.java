package day38_tasks;

public class Library {

    public static void main(String[] args) {

        JavaTextbook book = new JavaTextbook("Think Java", 7, false);

        System.out.println(book.getName());
        System.out.println(book.getSize());
        System.out.println(book.isFun());

        book.download();
        book.open();
        book.read();
    }
}
