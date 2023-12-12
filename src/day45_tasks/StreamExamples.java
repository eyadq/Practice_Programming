package day45_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        String str = "BBIbiIVBYipyvIPVIBU";
        str = Stream.of(str.split("")).distinct().collect(Collectors.joining());
        System.out.println(str);

        String[] strings = {"12", "ABC", "12"};
        strings = Arrays.stream(strings).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        String[] language = {"Java", "jAVa", "pyTHon", "rUBY", "javascript"};
        //strings = Arrays.stream(language).filter(each -> each.toLowerCase().equals("java") || each.toLowerCase().equals("python")).toArray(String[]::new);
        AtomicInteger pythonCount = new AtomicInteger();
        AtomicInteger javaCount = new AtomicInteger();
        Arrays.stream(language).forEach(each -> {
            if(each.toLowerCase().equals("python"))
                pythonCount.getAndIncrement();
            if(each.toLowerCase().equals("java"))
                javaCount.getAndIncrement();
        });
        System.out.println("Python count: " + pythonCount + " and Java count: " + javaCount);

        int[] nums = {1,2,3,4,-4,5,-5};
        AtomicInteger positveCounter = new AtomicInteger();
        AtomicInteger negativeCounter = new AtomicInteger();
        Arrays.stream(nums).forEach(each -> {
            if(each < 0){
                negativeCounter.getAndIncrement();
            }else{
                positveCounter.getAndIncrement();
            }
        });
        System.out.println("Positve count: " + positveCounter + " and Negative count: " + negativeCounter);

        int[] positiveNums = Arrays.stream(nums).filter(each -> each >= 0).toArray();
        System.out.println("Positive numbers only: " + Arrays.toString(positiveNums));

        int[] negativeNums = Arrays.stream(nums).filter(each -> each < 0).toArray();
        System.out.println("Negative numbers only: " + Arrays.toString(negativeNums));

        List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));
        List<Integer> noNegativesOrDuplicates = numList.stream().distinct().filter(each -> each >= 0).collect(Collectors.toList());
        System.out.println("List without negatives or Duplicates: " + noNegativesOrDuplicates);

        List<String> wordList = new ArrayList<>(Arrays.asList(new String[]{"Java", "level", "Anna", "Wooden Spoon"}));
//        List<String> palindromes = wordList.stream().filter(word -> {
//            String reversed = "";
//            for (int i = word.length()-1; i >= 0; i--) {
//                reversed = "" + word.charAt(i);
//            }
//            return word.equals(reversed);
//        }).collect(Collectors.toList());

        List<String> palindromes = wordList.stream().filter(word -> new StringBuilder(word).reverse().toString().equals(word) )
                .collect(Collectors.toList());
        System.out.println("Palindromes from list of words: " + palindromes);

        int[] arr = {1,1,2,3,3,4,5,5,6};
        int[] uniques = Arrays.stream(arr).distinct().toArray();
        System.out.println("Array with uniques only: " + Arrays.toString(uniques));


    }
}
