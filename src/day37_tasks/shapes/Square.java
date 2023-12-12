package day37_tasks.shapes;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        setSide(side);
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        setArea(area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = side * 4;
        setPerimeter(perimeter);
    }

    @Override
    public String toString() {
        return "Square: " +
                "\n\tSide: " + side +
                "\n\tArea: " + getArea() +
                "\n\tPerimeter: " + getPerimeter();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = (side >= 0) ? side : 0.0;
    }
}
