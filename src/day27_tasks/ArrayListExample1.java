package day27_tasks;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {
        ArrayList <String> store = new ArrayList<>();
        store.add("Hat");
        System.out.println(store);
        store.add("Shoes");
        System.out.println(store);
        store.add(1, "Jacket");
        System.out.println(store);
        store.add(0, "Towel");
        System.out.println(store);
        store.add(1, "Car");
        System.out.println(store);
    }
}
