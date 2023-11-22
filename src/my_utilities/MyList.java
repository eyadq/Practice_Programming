package my_utilities;

import java.util.Arrays;

public class MyList {

    private String[] internalArray = new String[0];

    public static void main(String[] args) {
        //need length of array | array: .length class variable vs Arraylist String using class method size() length()

        //need to be able to use in for loop so need something similar to ArrayList get() or String charAt()

        //cant loop if there is nothing in it. need to add

        //Need to print out array from list

    }

//    public MyList(){
//        internalArray = new String[0];
//    }

    public int length(){
        return internalArray.length;
    }

    public String StringAt(int index){
        if(index < internalArray.length){
            return internalArray[index];
        } else {
            return "-1";
        }
    }

    public void append(String str){
        internalArray = Arrays.copyOf(internalArray, internalArray.length +1);
        internalArray[internalArray.length-1] = str;
    }

    public void append(int index, String str){
        if(index >= internalArray.length){ //arr[arr.length-1]
            //append
            append(str);
        } else {
            //replace
            internalArray[index] = str;
        }
    }

    public boolean contains(String str){
        for (String element : internalArray){
            if(element.equals(str)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(internalArray);
    }

    public String[] toStringArray(){
        return internalArray;
    }
}
