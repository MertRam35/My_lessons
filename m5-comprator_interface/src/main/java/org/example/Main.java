package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 5, 20, 0);
        System.out.println(list);

        //ascending
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));
        System.out.println(list);
        System.out.println("-----------------");
        //Ascending Order
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list + " ascending order ");
        System.out.println("----------------------------");
        //Descending Order
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list + " descending order");


    }
}