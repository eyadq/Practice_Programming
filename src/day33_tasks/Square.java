package day33_tasks;

public class Square {

    private double side;
    private double perimeter;
    private double area;

    public Square (double side){
        setSide(side);
    }

    public void setSide(double side) {
        this.side = (side > 0) ? side : 0.0;
        this.perimeter = calculatePerimeter();
        this.area = area;
    }

    public double calculatePerimeter(){
        return side * 4;
    }

    public double calculateArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
