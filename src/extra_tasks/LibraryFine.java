package extra_tasks;

public class LibraryFine {

    public static void main(String[] args) {
        int[] returnedDate = {9, 6, 2015};
        int[] expectedDate = {6, 6, 2015};
        System.out.println("Fee is " + libraryFee(returnedDate, expectedDate));
    }

    public static int libraryFee(int[] returnedDate, int[] expectedDate){
        //1. no fees if on time or before
        //2. same month fee = 15 * numberOfDaysLate
        //3. different month but same year fee 500 * numberOfDaysLate
        //4. different year fee 10_000 due is Dec 31, 2017 and return is Jan 1, 2018, that's still a year late

        int fee = 0;
        if(returnedDate[2] != expectedDate[2]){
            fee = 10_000;
        } else if(returnedDate[1] != expectedDate[1]){
            fee = 500 * (returnedDate[1] - expectedDate[1]);
        } else if(returnedDate[0] >= expectedDate[0]){
            fee = 15 * (returnedDate[0] - expectedDate[0]);
        }


        return fee;
    }
}
