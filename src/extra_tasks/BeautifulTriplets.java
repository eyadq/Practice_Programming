package extra_tasks;

public class BeautifulTriplets {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 10};
        System.out.println(findBeautifulTriplets(arr, 3));
    }


    public static int findBeautifulTriplets(int[] arr, int d){
//        int i = 0;
//        int j = 0;
//        int k = 0;
        int beautifulCount = 0;

        for (int i : arr){
            for (int j : arr){
                for (int k : arr){
                    if( i<j &&  j<k &&  j-i==d && k-j==d){
                        beautifulCount++;
                    }

                }
            }
        }




        return beautifulCount;
    }
}
