package com.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class CountValues {


    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 6, 7);

        int count = countIf(ci, new OddPredicate());
        System.out.println(count);


    }

    static <T> int countIf(List<T> ci, UnaryPredicate<T> predicate) {
        int result = 0;
        for (T t : ci) {

            if (predicate.test(t)) result++;

        }
        return result;

    }
}
