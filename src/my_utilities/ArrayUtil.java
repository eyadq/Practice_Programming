package my_utilities;

import java.util.*;

public class ArrayUtil {

    public static void main(String[] args) {

        //task 1 and task2
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Biggest value in array: " + biggestNumber(arr));
        System.out.println("Smallest value in array: " + smallestNumber(arr));

        //task3
        int numberToBeChecked = 3;
        System.out.println(numberToBeChecked + " is in array?: " + containsInArr(arr, numberToBeChecked));
        System.out.println(numberToBeChecked + " is at indexes: " + Arrays.toString(indexesInArray(arr, numberToBeChecked)));

        //task4
        int newAddition = 8;
        System.out.println(Arrays.toString(addToArr(arr, newAddition)));

        //sort()
        int[] needsSorted = {1, 5, 10, 13, 2, 6};
        sort(needsSorted);
        System.out.println(Arrays.toString(needsSorted));
        char[] chars = {'a', 'c', '@'};
        sort(chars);
        System.out.println(Arrays.toString(chars));
        String str = "Cananda9&6";
        str = sort(str);
        System.out.println(str);

        String[] strs = {"Loopcamp", "apple", "@", "Friday", "old"};
        System.out.println(Arrays.toString(sort(strs)));


    }

    public static int biggestAndSmallestNumber(int[] arr, String method){
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int each = arr[i];
            if(each > biggest){
                biggest = each;
            }
            if(each < smallest){
                smallest = each;
            }
        }
        if(method.equals("biggest")){
            return biggest;
        } else {
            return smallest;
        }
    }

    public static int biggestNumber(int[] arr){
        return biggestAndSmallestNumber(arr, "biggest");
    }

    public static int smallestNumber(int[] arr){
        return biggestAndSmallestNumber(arr, "smallest");
    }

    public static boolean containsInArr(int[] arr, int numberToBeChecked){
        String indexesOfNumberChecked = "";
        boolean arrayConstainsNumber = false;
        for (int i = 0; i < arr.length; i++) {
            int each = arr[i];
            if(each == numberToBeChecked){
                arrayConstainsNumber = true;
                indexesOfNumberChecked += i + " ";

            }
        }

        return arrayConstainsNumber;
    }



    public static int[] indexesInArray(int[] arr, int numberToBeChecked){
        String indexesOfNumberChecked = "";
        boolean arrayConstainsNumber = false;
        for (int i = 0; i < arr.length; i++) {
            int each = arr[i];
            if(each == numberToBeChecked){
                arrayConstainsNumber = true;
                indexesOfNumberChecked += i + " ";

            }
        }

        int[] indexes;
        if(arrayConstainsNumber){
            String[] indexesString = indexesOfNumberChecked.trim().split(" ");
            indexes = new int[indexesString.length];
            for (int i = 0; i < indexes.length; i++) {
                indexes[i] = Integer.parseInt(indexesString[i]);
            }

        } else {
            indexes = new int[1];
            indexes[0] = -1;
        }
        return indexes;
    }

    public static int[] addToArr(int[] arr, int newAddition){
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = newAddition;
        return newArr;

    }

    public static int[] max3(int a, int b, int c){
        int largest = 0;
        int middle = 0;
        int smallest = 0;

        if(a>b){
            if(c>a){
                largest = c;
                middle = a;
                smallest = b;
            } else { // a>c
                largest = a;
                middle = (b>c) ? b : c;
                smallest = (middle==c) ? b : c;
            }
        } else if (b>a) {
            if(c>b){
                largest = c;
                middle = b;
                smallest = a;
            } else { //b>c
                largest = b;
                middle = (a > c) ? a : c;
                smallest = (middle==c) ? a : c;
            }
        }
        return  new int[]{largest, middle, smallest};
    }

    public static void sort(int[] arr){
        boolean reset = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(reset){
                i = 0;
                reset = false;
            }
            if( arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                i=0;
                reset = true;
            }
        }
    }

    public static void sort(double[] arr){
        boolean reset = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(reset){
                i = 0;
                reset = false;
            }
            if( arr[i] > arr[i+1]){
                double temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                i=0;
                reset = true;
            }
        }
    }

    public static void sort(char[] arr){
        boolean reset = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(reset){
                i = 0;
                reset = false;
            }
            if( (int)arr[i] > (int)arr[i+1]){
                char temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                i = 0;
                reset = true;
            }
        }
    }

    public static String sort(String str){
        char[] arr = str.toCharArray();
        sort(arr);
        return new String(arr);
    }

    public static String[] sort(String[] strs){
        Map<String, Character> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String str : strs){
            //map.put(str, str.charAt(0));
            set.add(str);
        }
        //Character[] arr = map.values().toArray(new Character[0]);
        return set.toArray(new String[0]);
    }

}
