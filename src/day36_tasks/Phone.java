package day36_tasks;

import day36_tasks.Device;

public class Phone extends Device {

    public Phone(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }
    @Override
    public void useDevice(){
        System.out.println("Using Phone");
    }

    @Override
    public String toString() {
        return "Phone" +
                "\n\tbrand: '" + brand +
                "\n\tmodel: '" + model +
                "\n\tprice: " + price +
                "\n\twireless: " + wireless;
    }
}
