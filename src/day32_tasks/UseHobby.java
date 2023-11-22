package day32_tasks;

import java.util.ArrayList;
import java.util.function.Predicate;

public class UseHobby {

    public static void main(String[] args) {
        Hobby programming = new Hobby("Programming");
        //System.out.println(programming);

        Hobby modelTrains = new Hobby("Model Trains", 15_000);
        //System.out.println(modelTrains);

        Hobby baseball = new Hobby("Baseball", 150, true, true);
       // System.out.println(baseball);

        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.add(programming);
        hobbies.add(modelTrains);
        hobbies.add(baseball);

        for (int i = 0; i < hobbies.size(); i++) {
            hobbies.get(i).doIt();
        }

        System.out.println("----------------------");

        ArrayList indoorHobbies = new ArrayList<>(hobbies);
        Predicate<Hobby> condition = hobby -> hobby.isOutdoors;
        indoorHobbies.removeIf(condition);
        System.out.println("In door hobbies: ");
        System.out.println(indoorHobbies);

        System.out.println("----------------------");

        ArrayList lonlyHobbies = new ArrayList<>(hobbies);
        condition = hobby -> hobby.requiresOthers;
        lonlyHobbies.removeIf(condition);
        System.out.println("Hobbies that don't require others: ");
        System.out.println(lonlyHobbies);

        System.out.println("----------------------");

        ArrayList poorPeopleHobbies = new ArrayList<>(hobbies);
        condition = hobby -> hobby.annualCost > 500;
        poorPeopleHobbies.removeIf(condition);
        System.out.println("Hobbies that cost less than $500 annually: ");
        System.out.println(poorPeopleHobbies);


    }
}
