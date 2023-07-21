package org.Java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2, 4, 6, 8);
        List<Integer> unModifiableList = List.copyOf(integerList);
        List<Integer> unModifiableList2 = List.of(2, 4, 6, 8);


    }
}
