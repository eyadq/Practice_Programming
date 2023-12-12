package extra_tasks;

public class MinMaxSum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        minMaxSum(arr);

        int[] arr2 = {1, 2, 3, 4, 5};
        minMaxSum(arr2);
    }

    public static void minMaxSum(int[] arr){
        int largest = 1;
        int smallest = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest)
                largest = arr[i];
            if(arr[i] < smallest)
                smallest = arr[i];
        }
        int min = 0;
        int max = 0;
        for (int num : arr){
            if(num != largest)
                min += num;
            if(num != smallest)
                max += num;
        }
        System.out.println(min + " " + max);
    }

}
