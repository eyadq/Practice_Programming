package my_utilities;

import java.util.Arrays;
import java.util.Random;

import static my_utilities.ArrayUtil.max3;
import static my_utilities.StringUtil.*;

public class UtilTester {

    public static void main(String[] args) {

        String kitten = "kitten";
        String horror = "CodingHorror";

        boolean[] pattern = {true, true, false, false};
        System.out.println(  matchPatternInString(kitten,pattern)    );
        System.out.println(  matchPatternInString(horror,pattern)    );

        Random random = new Random();
        System.out.println(Arrays.toString(max3(random.nextInt(100), random.nextInt(100), random.nextInt(100))));
    }
}
