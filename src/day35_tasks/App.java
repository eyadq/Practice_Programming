package day35_tasks;

public class App {

    private String name;
    private double version;

    public App(String name, double version){
        setName(name);
        setVersion(version);
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setVersion(double version){
        this.version = version;
    }

    public double getVersion(){
        return version;
    }

    public void download(){
        System.out.println(name + " is downloading " + version);
    }

    @Override
    public String toString() {
        return name + " " + version;
    }
}
