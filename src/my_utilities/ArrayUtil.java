package my_utilities;

import java.util.Arrays;

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

}
