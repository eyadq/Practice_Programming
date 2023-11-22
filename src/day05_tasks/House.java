package day05_tasks;

public class House {

    public static void main(String[] args) {
        String houseType = "Mashallah";
        int numberOfBedrooms = 25;
        int numberOfBathrooms = 10;
        int numberOfKitchens = 5;
        boolean hasBasement = false; //We are not mole people
        boolean hasAttic = true;
        boolean isOnSale = false;
        boolean hasPool = true;
        double price = 9_999_999_999.99;
        String address = "123 Class St";
        int zipcode = 12345;
        boolean hasPark = true;
        double schoolRating = 5.0;

        String result = "The  " + houseType + "  house on " + address + "," + zipcode + " costs $" + price + "\n" +
                "The house has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, and has " +
                numberOfKitchens + " kitchens.\n" + "Has basement is " + hasBasement + ", has attic is " + hasAttic +
                ", has park nearby is " + hasPark + ", and has pool is " + hasPool + ".\n" + "The school rating is " +
                schoolRating + " and is for sale is " + isOnSale + ".";

        System.out.println(result);






    }
}
