package day38_tasks;

public abstract class Book {

    private String name;

    public Book(String name){
        setName(name);
    }

    public abstract void read();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
