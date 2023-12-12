package day37_tasks.shapes;

public abstract class Shape {

    private double area;
    private double perimeter;

//    public Shape(double area, double perimeter){
//        this.area = area;
//        this.perimeter = perimeter;
//    }

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    @Override
    public String toString() {
        return "Shape: " +
                "\n\tArea: " + area +
                "\n\tPerimeter: " + perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }


}
