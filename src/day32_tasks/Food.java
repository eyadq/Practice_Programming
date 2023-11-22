package day32_tasks;

public class Food {
    String name;
    double quantity;
    double unitPrice;
    double totalPrice;

    Food(String name){
        this.name = name;
        calculatePrice();
    }

    Food(String name, double quantity){
        this(name);
        this.quantity = quantity;
        calculatePrice();
    }

    Food(String name, double quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = quantity * unitPrice;
    }

    @Override
    public String toString() {
        return name + "{" +
                "quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
