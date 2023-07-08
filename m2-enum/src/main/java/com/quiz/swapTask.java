package com.quiz;

import java.util.Arrays;


public class swapTask {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        System.out.println("a = " + Arrays.toString(a));

        swap(a, 3, 0);
        System.out.println("a = " + Arrays.toString(a));


    }

    private static <T>  void swap (T[] a,int i,int j){

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
