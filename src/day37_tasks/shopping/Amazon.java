package day37_tasks.shopping;

public final class Amazon extends OnlineShopping {

    @Override
    void viewCart() {
        System.out.println("Here are the items in your cart:\n\tEcho\n\tNew PC");
    }

    @Override
    public void payForShipping(boolean hasBeenPaid) {
        System.out.println((hasBeenPaid) ? "Item has been shipped." : "Please pay for item so it may ship.");
    }

    @Override
    public void buyItem() {
        System.out.println("Item has been added to cart");
    }

    @Override
    public void returnItem() {
        System.out.println("Item has been returned, allow up to five days for money to be credited to your account");
    }
}
