package day42_tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NameAndSalary {

    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Tom", 120_000.0);
        salaries.put("Jerry", 140_000.0);
        salaries.put("Mickey", 100_000.0);
        salaries.put("Goofy", 1_000_000.0);
        salaries.put("Arnold", 200_000.0);
        salaries.put("Helga", 210_000.0);

        String minPerson = minSalary(salaries);
        System.out.println(minPerson + " has the min salary of $" + salaries.get(minPerson));

        String maxPerson = maxSalary(salaries);
        System.out.println(maxPerson + " has the min salary of $" + salaries.get(maxPerson));

        int countSalariesBetween = 0;
        for (Map.Entry<String, Double> each : salaries.entrySet()) {
            if (each.getValue() >= 120000 && each.getValue() <= 150_000) {
                countSalariesBetween++;
            }
        }
        System.out.println(countSalariesBetween + " employee(s) is/are making between $120_000 and $150_000 ");

        System.out.println("Employees making less than $118_000:");
        for (Map.Entry<String, Double> each : salaries.entrySet()) {
            if (each.getValue() < 118_000) {
                System.out.println("\t" + each.getKey());
            }
        }

        for (String each : salaries.keySet()) {
            salaries.put(each, salaries.get(each) + 10_000);
        }
        System.out.println("Salaries after a raise: " + salaries);
    }

        enum ReturnType {
            MIN,
            MAX
        }

        public static String minAndMaxSalary (Map < String, Double > mapOfSalaries, ReturnType type){
            Double min = Double.MAX_VALUE;
            Double max = Double.MIN_VALUE;

            for (Double eachSalary : mapOfSalaries.values()) {
                if (eachSalary > max) {
                    max = eachSalary;
                }

                if (eachSalary < min) {
                    min = eachSalary;
                }
            }

            Double salary = (type.equals(ReturnType.MAX)) ? max : min;
            String person = "";
            for (Map.Entry<String, Double> each : mapOfSalaries.entrySet()) {
                if (each.getValue().equals(salary)) {
                    person = each.getKey();
                }
            }
            return person;
        }

        public static String maxSalary (Map < String, Double > mapOfSalaries){
            return minAndMaxSalary(mapOfSalaries, ReturnType.MAX);
        }

        public static String minSalary (Map < String, Double > mapOfSalaries){
            return minAndMaxSalary(mapOfSalaries, ReturnType.MIN);
        }

}
