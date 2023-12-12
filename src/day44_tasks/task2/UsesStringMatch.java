package day44_tasks.task2;

import java.util.*;
public class UsesStringMatch {

    public static void main(String[] args) {


        String str1 = "Python";
        String str2 = "Wooden Spoon";
        StringMatch matcher = new StringMatch() {
            @Override
            public String match(String str1, String str2) {

                Set<String> set1 = new LinkedHashSet<>(Arrays.asList(str1.split("")));
                Set<String> set2 = new LinkedHashSet<>(Arrays.asList(str2.split("")));

                String both = "";

                for (String eachIn1 : set1){
                    for (String eachIn2 : set2){
                        if(eachIn2.equals(eachIn1)){
                            both += eachIn2;
                        }
                    }
                }
                return both;
            }

        };

        System.out.println(matcher.match(str1, str2));
    }
}
