package com.quiz;

import java.util.List;

public final class Algorithm {
    public static void main(String[] args) {


    }
    public static void print(List<? extends Number> list){
for (Number n: list)
    System.out.println(n);
    }
}