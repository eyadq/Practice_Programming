package day32_tasks;

import java.util.ArrayList;

public class UsingFood {

    public static void main(String[] args) {
        ArrayList<Food> list = new ArrayList<>();
        list.add(new Food("banana", 10, 1));
        list.add(new Food("apple", 5, 2));
        list.add(new Food("broccoli", 7, 1.5));
        list.add(new Food("cherry", 4, 2.1));
        list.add(new Food("cavier", 1, 100));

        ArrayList<Food> listWithA = new ArrayList<>(list);
        listWithA.removeIf(each -> !each.name.contains("a"));
        System.out.println(listWithA);
        ArrayList<Food> richPeopleFood = new ArrayList<>(list);
        richPeopleFood.removeIf(each -> each.totalPrice < 20);
        System.out.println(richPeopleFood);
    }


}
