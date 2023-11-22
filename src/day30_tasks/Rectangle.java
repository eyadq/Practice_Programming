package day30_tasks;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    public static void main(String[] args) {
    }

    public void calculatePerimter(){
        perimeter = base * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectange of size: " + base + "x" + height +
                "\n\tPerimeter: " + perimeter + "\n\tArea: " + area;
    }

    public void calculateArea(){
        area = base * height;
    }

}
