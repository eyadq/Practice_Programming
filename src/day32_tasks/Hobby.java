package day32_tasks;

public class Hobby {
    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOthers;

    public Hobby(String name){
        this.name = name;
    }

    public Hobby(String name, double annualCost){
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing " + name + " " + (isOutdoors ? "outdoors" : "indoors"));
    }

    @Override
    public String toString() {
        return "\n"+ name +
                "\n\tAnnual cost: \t\t\t" + annualCost +
                "\n\tIs outdoor activity: \t" + isOutdoors +
                "\n\tRequires others: \t\t" + requiresOthers;
    }
}
