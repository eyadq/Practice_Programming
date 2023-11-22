package day05_tasks;

public class EmployeeInfo {

    public static void main(String[] args) {

        String nameFirst = "James";
        String nameLast= "Bond";
        char gender = 'M';
        int age = 40;
        String nameCompany = "MI6";
        boolean isFullTime = true;
        String titleJob = "Special Agent";
        int salary = 1000000;
        int amountPTO = 15;
        boolean isMarried = false;
        char suite = 'D';

        System.out.println("Employment information for " + nameFirst + " " + nameLast);
        System.out.println("Gender: " + gender);
        System.out.println(titleJob +  " at " + nameCompany);
        System.out.println("Currently " + age + " years old");
        System.out.println("Other details:");
        System.out.println("\tPTO: " + amountPTO);
        System.out.println("\tFull time?: " + isFullTime);
        System.out.println("\tMarried?: " + isMarried);


    }
}
