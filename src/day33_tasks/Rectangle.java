package day33_tasks;

public class Rectangle {

    private double length;
    private double width;
    private double perimeter;
    private double area;

    public Rectangle(double length, double width){

        setLength(length);
        setWidth(width);
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    public void setLength(double length) {
        this.length = (length > 0) ? length : 0.0;
    }

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 0.0;
    }

    public double calculatePerimeter(){
        return length * 2 + width * 2;
    }

    public double calculateArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
