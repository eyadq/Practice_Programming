package day38_tasks;

public abstract class EBook extends Book {

    private double size;

    public EBook(String name, double size){
        super(name);
        setSize(size);
    }

    public abstract void open();

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
