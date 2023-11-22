package day27_tasks;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");
        System.out.println(avengers);
        avengers.remove(2);
        System.out.println(avengers);
        avengers.remove("Iron Man");
        System.out.println(avengers);
        avengers.remove(0);
        System.out.println(avengers);
    }
}
