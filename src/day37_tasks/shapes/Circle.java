package day37_tasks.shapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        setArea(area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        setPerimeter(perimeter);
    }

    @Override
    public String toString() {
        return "Circle: " +
                "\n\tRadius: " + radius +
                "\n\tArea: " + getArea() +
                "\n\tPerimeter: " + getPerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0.0;
    }
}
