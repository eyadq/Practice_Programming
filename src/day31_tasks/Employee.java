package day31_tasks;

public class Employee {

    public String name;
    public String jobTitle;
    public int id;
    public double salary;

    public Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int id, double salary){
        this(name, jobTitle);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+ "{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public void goToMeeting(){
        System.out.println(name + " is going to a meeting.");
    }
}
