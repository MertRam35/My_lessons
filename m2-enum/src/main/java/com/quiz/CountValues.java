package com.quiz;

import java.util.Arrays;
import java.util.List;

public class CountValues {


    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4,6,7);

        int count = countIf(ci, new OddPredicate());
        System.out.println(count);


    }

    static int countIf(List<Integer> ci, OddPredicate oddPredicate) {
        int result = 0;
        for (Integer integer : ci) {
            if (oddPredicate.test(integer)) result++;

       }
        return result;
    }
}
