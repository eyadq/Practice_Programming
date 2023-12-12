package extra_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MigratoryBirds {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        System.out.println(mostFrequentBird(arr));

        int[] arr2 = {1, 4, 4, 4, 5, 3};
        System.out.println(mostFrequentBird(arr2));
    }

    public static int mostFrequentBird(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>(); //<ID, Count>
        for (int id : arr){
            if(map.get(id) == null){
                map.put(id, 1);
            } else {
                map.put(id, map.get(id)+1);
            }
        }
        System.out.println(map);
        int largest = 0;
        String ids = "";
        for (Integer key : map.keySet()){
            Integer value = map.get(key);
            if(value > largest){
                largest = value;
                ids = "";
            }
            if(value == largest){
                ids += key + " ";
            }
        }
        ids.trim();
        String[] mostFrequentBirds = ids.split(" ");
        int smallest = Integer.MAX_VALUE;
        for (String idString: mostFrequentBirds){
            int id = Integer.parseInt(idString);
            if (id < smallest){
                smallest = id;
            }
        }
        return smallest;
    }
}
