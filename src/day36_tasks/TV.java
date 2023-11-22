package day36_tasks;

import day36_tasks.Device;

public class TV extends Device {

    public TV(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }
    @Override
    public void useDevice(){
        System.out.println("Using TV");
    }

    @Override
    public String toString() {
        return "TV" +
                "\n\tbrand: '" + brand +
                "\n\tmodel: '" + model +
                "\n\tprice: " + price +
                "\n\twireless: " + wireless;
    }
}
