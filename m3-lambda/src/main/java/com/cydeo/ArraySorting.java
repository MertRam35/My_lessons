package com.cydeo;

import java.lang.reflect.Array;

public class ArraySorting { //QuickSort,BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
