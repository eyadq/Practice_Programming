package day42_tasks;

import java.util.ArrayList;

public class RemoveNames {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Mike");
        names.add("Ahmed");
        names.add("Mary");
        names.add("Ahmed");
        names.add("Ahmed");
        names.add("Jeff");


        removeAhmed(names);
        System.out.println(names);
    }

    public static void removeName(ArrayList<String> names, String name){
        names.removeIf(each -> each.equals(name));
    }

    public static void removeAhmed(ArrayList<String> names){
        removeName(names, "Ahmed");
    }
}
