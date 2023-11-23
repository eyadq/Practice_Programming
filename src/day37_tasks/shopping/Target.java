package day37_tasks.shopping;

public final class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Customer bought item");
    }

    @Override
    public void returnItem() {
        System.out.println("Customer returned item");
    }
}
