package day38_tasks;

public class JavaTextbook  extends EBook implements Downloadable{

    private boolean fun;

    public JavaTextbook(String name, double size, boolean fun){
        super(name, size);
        setFun(fun);
    }

    @Override
    public void read() {
        System.out.println("Now reading " + getName());
    }

    @Override
    public void download() {
        System.out.println("Downloading " + getName() + ", will take up " + getSize() + "mb");
    }

    @Override
    public void open() {
        System.out.println("Now loading " + getName());
    }

    public boolean isFun() {
        return fun;
    }

    public void setFun(boolean fun) {
        this.fun = fun;
    }
}
