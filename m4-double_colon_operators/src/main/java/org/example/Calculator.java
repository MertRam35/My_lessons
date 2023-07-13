package org.example;

public class Calculator implements Calculate{


    public static void finSum(int x, int y) {
        System.out.println("Sum " + (x + y));
    }

    public void finMultiply(int x, int y) {
        System.out.println("Multiply " + (x * y));
    }


    @Override
    public void calculate(Integer x, Integer y) {

    }
}





