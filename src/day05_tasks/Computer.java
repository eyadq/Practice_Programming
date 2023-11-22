package day05_tasks;

public class Computer {

    public static void main(String[] args) {
        String brand = "AMD";
        String processor = "Ryzen 5600X";
        int ram = 16;
        int storage = 7;
        boolean hasMonitor = true;
        boolean hasWifi = true;
        String description = "DIY mid tower";
        int price = 1300;
        String gpu = "AMD 5600 XT";
        String color = "black";
        int numberOfMonitors = 2;
        int numberOfUSB= 12;
        boolean hasUSB3 = true;

        System.out.println("Computer Details");
        System.out.println("\tSummary: \t\t\t\t" + description);
        System.out.println("\tColor: \t\t\t\t\t" + color);
        System.out.println("\tBrand: \t\t\t\t\t" + brand);
        System.out.println("\tProcessor: \t\t\t\t" + processor);
        System.out.println("\tRam Memory: \t\t\t" + ram + " GB");
        System.out.println("\tStorage Memory: \t\t" + storage + " TB");
        System.out.println("\tIncludes Monitors: \t\t" + hasMonitor);
        System.out.println("\tAmount of Monitors: \t" + numberOfMonitors);
        System.out.println("\tAmount of USB Ports: \t" + numberOfUSB);
        System.out.println("\tUSB3 enabled: \t\t\t" + hasUSB3);
        System.out.println("\tWifi builtin: \t\t\t" + hasWifi);
        System.out.println("\tPrice: \t\t\t\t\t" + "$" + price);







    }
}
