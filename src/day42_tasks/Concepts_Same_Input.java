package day42_tasks;

import java.util.*;

public class Concepts_Same_Input {

    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        String expected_output = "CD015ACCCG011899";

        String[] arr = str.split("");

        Set<String> hashSet = new HashSet<>(List.of(arr));
        System.out.println("HashSet:\t\t" + hashSet);

        Set<String> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
        }
        System.out.println("TreeSet:\t\t" + treeSet);

        List linked = new LinkedList(List.of(arr));
        System.out.println("LinkedList:\t\t" + linked);

        Hashtable table = new Hashtable();
        for (int i = 0; i < arr.length; i++) {
            table.put(i, arr[i]);
        }
        System.out.println("HashTable:\t\t" + table.values());

        HashMap hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hash.put(i, arr[i]);
        }
        System.out.println("HashMap:\t\t" + hash.values());

        TreeMap tree = new TreeMap();
        for (int i = 0; i < arr.length; i++) {
            tree.put(i, arr[i]);
        }
        System.out.println("TreeMap:\t\t" + tree.values());

        LinkedHashMap linkedHash = new LinkedHashMap();
        for (int i = 0; i < arr.length; i++) {
            linkedHash.put(i, arr[i]);
        }
        System.out.println("LinkedHashMap:\t" + linkedHash.values());



    }
}
