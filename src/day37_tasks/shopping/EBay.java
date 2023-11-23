package day37_tasks.shopping;

public class EBay extends OnlineShopping implements Shipping, AllowUSersToSell {

    @Override
    public void uploadProduct() {
        System.out.println("Product uploaded to Ebay's catalog");
    }

    @Override
    void viewCart() {
        System.out.println("Your cart is empty.");
    }

    @Override
    public void payForShipping(boolean hasBeenPaid) {
        System.out.println((hasBeenPaid) ? "Item has been shipped." : "Please don't make our vendors wait for money!");
    }

    @Override
    public void buyItem() {
        System.out.println("Item has been added to cart");
    }

    @Override
    public void returnItem() {
        System.out.println("Vendor has been notified of the return and will give you vendor specific info");
    }
}
