package day31_tasks;

public class Offer {

    // 5 instance variables: company, location, salary, isFullTime, numberOfPTO
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;


    // create a constructor with two parameters - company and location
    public Offer(String company, String location){
        this.company = company;
        this.location = location;
    }


    //create a constructor with all parameters - company, location, salary, isFullTime, numberOfPTO
    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }




    public String toString () {
        return company + " located in " + location +
                "\nPays $" + salary + " salary and provides " + numberOfPTO + " number of PTO" +
                "\nThis is a full time position: " + isFullTime;

    }

}