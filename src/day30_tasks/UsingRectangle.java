package day30_tasks;

public class UsingRectangle {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.base = 5;
        rect1.height = 2.1;
        rect1.calculatePerimter();
        rect1.calculateArea();
        System.out.println(rect1);
    }
}
