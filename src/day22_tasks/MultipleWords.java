package day22_tasks;

public class MultipleWords {

    public static void main(String[] args) {
            String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

            for(String strSlice : str.split(",")){
                if(strSlice.trim().contains(" ")){
                    System.out.println(strSlice);
                }
            }
    }
}
