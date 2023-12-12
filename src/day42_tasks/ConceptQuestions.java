package day42_tasks;

import java.util.*;

public class ConceptQuestions {

    /*
     What is the difference of List, Set, Queue, and Maps?
     How do you iterate through a HashSet?
     How do you iterate through a HashMap?
     How would you remove elements from a Collection during iteration?
     What is FIFO and LIFO and how are they different?
     What is thread safe?
    */

    public static void main(String[] args) {
        //List extends Collection interface directly

        //ArrayList implements List
        //uses Array backing
        //Pretty much a wrapper to make arrays more dynamic
        //reading is fast because has indexes

        System.out.println();
        System.out.println("ArrayList");
        List<Integer> array = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println(array);
        System.out.println(array.get(2) + "\t//.get(2)");


        //LinkedList implememnts List and Deeque
        //Uses nodes. Has two instance variables which can point to precedeing node and following node
        //Fast to write as they dont have indexes but using get you can still retrieve the nodes
        System.out.println();
        System.out.println("LinkedList");
        List<Integer> linked = new LinkedList<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println(linked);
        System.out.println(linked.get(2) + "\t//.get(2)");
        System.out.println(array.size() + "\t//.size()");

        //Vector and ArrayList are very similar.
        //Vector is older and originally did not implement List
        //Was completely remade after List interface - to continue to allow old code to work
        //Synchronized, thread safe but slower

        //Stack extends Vector
        //Uses push to add and pop to remove.
        //pop also returns what has been removed
        System.out.println();
        System.out.println("Stack");
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop() + "\t//.pop()");
        System.out.println(stack);

        //Set extends Collection

        //HashSet extends Set
        //Unordered collection of objects
        //no duplicates, one null value is OK
        System.out.println();
        System.out.println("HashSet");
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(new Integer[]{4,2}));
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(null);
        hashSet.add(4);
        System.out.println("No duplicates allowed");
        System.out.println(hashSet + "\tDoes not guarantee order of insertion or natural order");
        System.out.println(hashSet.contains(2) + "\t//.contains(2)");

        //LinkedHashSet guarantees insertion order
        System.out.println();
        System.out.println("LinkedHasSet");
        Set<Integer> linkedHashSet = new HashSet<>(Arrays.asList(new Integer[]{1,2}));
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(null);
        linkedHashSet.add(4);
        System.out.println("No duplicates allowed");
        System.out.println(linkedHashSet + "\tWill maintain order of insertion");

        //TreeSet implements SortedSet which extends Set
        //Uses Ascending order
        System.out.println();
        System.out.println("TreeSet");
        Set<Integer> treeSet = new HashSet<>(Arrays.asList(new Integer[]{4,3}));
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(null);
        treeSet.add(null);
        System.out.println("No duplicates of any kind");
        treeSet.add(3);
        System.out.println(treeSet + "\tWill use natural order");

        //Queue Collection that Provide First-in-First-Out or Last-In-First-Out structure
        // .offer() Inserts a new element onto the Queue, returns false if it fails
        // .poll() Removes an element from the front of the Queue, returns false if it cannot
        // .peek() Inspects the element at the front of the Queue, without removing it
        // still has .add() and .remove() which throw exception if fails
        // In FIFO elements are added at the head and removed from the tail
        // In LIFO elements are added at the tail and removed from the head
        // While some implementations allow null:
        // adding null to Queue can confuse programmers. As methods return can return null,
        // cannot tell if that is what queue contained or if the method failed

        //Maps use key and value pair

        //HashMap and HashTable are very similar.
        //HashTable is older and originally did not implement Maps
        //Was completely remade after Maps interface - to continue to allow old code to work
        //Synchronized, thread safe but slower
        //Has Enumeration object .keys() for looping

        System.out.println();
        System.out.println("HashTable");
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the HashTable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
        System.out.println(hashtable);

        // Getting values from the HashTable
        System.out.println("Value of A: " + hashtable.get("A"));

        // Removing elements from the HashTable
        hashtable.remove("B");

        // Enumerating the elements of the HashTable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        //HashMap
        //Order is not guaranteed, can change from one call to next
        //Constant-time performance for the basic operations (get and put)

        System.out.println();
        System.out.println("HashMap");
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the hashtable
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println(hashMap);

        // Getting values from the HashMap
        System.out.println("Value of A: " + hashMap.get("A"));

        // Removing elements from the hashtable
        hashMap.remove("B");

        //Iterate using .keySet(), .values(), and .entrySet()
        System.out.print("Iterating using .keys() gives the following keys: ");
        for (String key : hashMap.keySet()){
            System.out.print(key + " ");
        }

        System.out.print("\nIterating using .values() gives the following values: ");
        for (Integer value : hashMap.values()){
            System.out.print(value + " ");
        }

        System.out.print("\nIterating using .entrySet() gives the following: ");
        for (Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.print("(" + entry.getValue() + "," + entry.getKey() + ") ");
        }

        //LinkedHashMap
        //Doubly linked like in LinkedList
        //Insertion order
        System.out.println();
        System.out.println();;
        System.out.println("LinkedHashMap");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println(linkedHashMap);

        //TreeMap
        //Natural order
        //Log(n) time cost for the containsKey, get, put and remove operations.
        //Not synchronized
        System.out.println();
        System.out.println("TreeMap");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 1);
        treeMap.put("C", 2);
        treeMap.put("A", 3);
        System.out.println(treeMap);

        System.out.println();
        System.out.println("Thread safe");
        System.out.println("Thread safe means only one 'worker' may edit the object at one time");
        System.out.println("Work cannot be done in parallel so editing is slower");





    }
}
