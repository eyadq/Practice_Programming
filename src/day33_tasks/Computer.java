package day33_tasks;

public class Computer {

    private double price;
    private String brand;
    private String color;
    private static boolean hasScreen;
    private static boolean hasBattery;
    private static boolean hasMemory;

    public Computer(double price, String brand, String color){
        setPrice(price);
        setBrand(brand);
        setColor(color);
        setHasScreen(false);
        setHasBattery(false);
        setHasMemory(true);
    }

    public Computer(double price, String brand, String color, boolean hasScreen, boolean hasBattery, boolean hasMemory){
        setPrice(price);
        setBrand(brand);
        setColor(color);
        setHasScreen(hasScreen);
        setHasBattery(hasBattery);
        setHasMemory(hasMemory);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setHasScreen(boolean hasScreen) {
        Computer.hasScreen = hasScreen;
    }

    public static void setHasBattery(boolean hasBattery) {
        Computer.hasBattery = hasBattery;
    }

    public double getPrice(){
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean getHasScreen(){
        return hasScreen;
    }

    public boolean getHasBattery(){
        return hasBattery;
    }

    public boolean getHasMemory(){
        return hasMemory;
    }

    public static boolean isHasScreen() {
        return hasScreen;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static boolean isHasMemory() {
        return hasMemory;
    }

    public static void setHasMemory(boolean hasMemory) {
        Computer.hasMemory = hasMemory;
    }

    @Override
    public String toString() {
        return brand + "{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", Has Screen='" + hasScreen + '\'' +
                ", Has Battery='" + hasBattery + '\'' +
                ", Has Memory='" + hasMemory + '\'' +
                '}';
    }


}
