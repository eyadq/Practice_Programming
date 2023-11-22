package day36_tasks;

public class Device {

    String brand;
    String model;
    double price;
    boolean wireless;

    public Device(String brand, String model, double price, boolean wireless) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setWireless(wireless);
    }

    public void useDevice(){
        System.out.println("Using device");
    }

    @Override
    public String toString() {
        return "Device" +
                "\n\tbrand: '" + brand +
                "\n\tmodel: '" + model +
                "\n\tprice: " + price +
                "\n\twireless: " + wireless;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
