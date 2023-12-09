package day42_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RemoveNumbers {

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();

        Random random = new Random();

        for(int i=0; i<15; i++){
            nums.add(random.nextDouble(250));
        }

        System.out.println("List before removeNumbers() method: " + nums);
        removeNumbers(nums);
        System.out.println("List after removeNumbers() method: " + nums);
    }

    public static void removeNumbers(ArrayList<Double> nums){
        removeNumbers(nums, 100.0);
    }

    public static void removeNumbers(ArrayList<Double> nums, Double number){
        nums.removeIf(each -> each > number);
    }
}
