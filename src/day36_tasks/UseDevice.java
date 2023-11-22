package day36_tasks;

public class UseDevice {

    public static void main(String[] args) {
        Device device1 = new Device("Samsung", "Electric Washer2", 950, false);
        System.out.println(device1);
        device1.useDevice();

        TV device2 = new TV("LG", "GiantTV", 1200, true);
        System.out.println(device2);
        device2.useDevice();

        Phone device3 = new Phone("Apple", "USphone", 1200, true);
        System.out.println(device3);
        device3.useDevice();
    }


}
