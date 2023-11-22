package day33_tasks;

public class Pizza {

    private String size;
    private int numberOfToppings;
    private double price;

    public Pizza(String size){
        //cheese pizza has no toppings
        setSize(size);
        this.price = calculatePrice();
    }

    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
        this.price = calculatePrice();
    }

    public void setSize(String size){
        size = size.toLowerCase().trim();
        if(size.equals("small") || size.equals("medium") || size.equals("large")){
            this.size = size;
        } else {
            System.out.println("Our pizza only comes in \"small\", \"medium\", or \"large\".");
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if(numberOfToppings > 0) {
            this. numberOfToppings = numberOfToppings;
        } else {
            System.out.println("Number of toppings must be at least zero");
        }
    }

    public double calculatePrice(){
        double price = 0;
        switch(size){
            case "small":
                price += 4;
                break;
            case "medium":
                price += 6;
                break;
            case "large":
                price += 8;
                break;
            default:
                price += 0;
        }
        price += numberOfToppings * 0.75;
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                ", price=" + price +
                '}';
    }
}
