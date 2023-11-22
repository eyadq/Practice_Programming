package day33_tasks;

public class Test33Clases {

    public static void main(String[] args) {

        Square square = new Square(3);
        System.out.println(square);
        //square.side == 3; Good does not work

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle);
        //int length = rectangle.length; Good does not work
        //int width = rectangle.width; Good does not work

        Pizza cheese = new Pizza("small");
        System.out.println(cheese);
        //String size = cheese.size; Good does not work
        //int numberOfToppings = cheese.numberOfToppings; Good does not work

        Pizza everything = new Pizza("large", 20);
        System.out.println(everything);

        Computer computer = new Computer(1_000, "HP", "white");
        System.out.println(computer);
        System.out.println(computer.getHasScreen());
        Computer laptop = new Computer(1_500, "Apple", "silver", true, true, true);
        System.out.println(laptop);

        DebitCard card = new DebitCard(1234567890123456l, "Mickey Mouse", 9_999_999);
        card.setPin(1234);
        card.setCardType("Blah");
        card.setCardType("MastERCARd");
        System.out.println(card);

        DebitCard card2 = new DebitCard(654321098765432l, "Tom Jerry", "visa", 5678, 120_000);
        System.out.println(card2);

        DebitCard card3 = new DebitCard(6543210987654321l, "Tom Jerry", "visa", 5678, 120_000);
        System.out.println(card3);


    }
}
