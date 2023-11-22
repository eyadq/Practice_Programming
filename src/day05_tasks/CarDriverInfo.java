package day05_tasks;

public class CarDriverInfo {

    public static void main (String[] args){
        String carModel = "Chevy Equinox";
        String driverName = "Eyad";
        String licenseNum = "1234567";
        short speed = 35;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car model is: \t\t\t" + carModel);
        System.out.println("Driver name: \t\t\t" + driverName);
        System.out.println("License number \t\t\t" + licenseNum);
        System.out.println("Speed: \t\t\t\t\t" + speed);
        System.out.println("Automatic transmission \t" + isAutomatic);
        System.out.println("License class: \t\t\t" + licenseClass);
    }
}
