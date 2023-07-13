package org.example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Predicate<Integer> checkEven = p -> p % 2 == 0;
        System.out.println("checkEven.test(15) = " + checkEven.test(15));
        System.out.println("checkEven.test(16) = " + checkEven.test(16));

        System.out.println("-----------------------------------------------------------------------------");

        Calculate add = (x, y) -> System.out.println(x + y);
        add.calculate(15, 20);

        Calculate add1 = (x, y) -> Calculator.finSum(x, y);
        add1.calculate(15, 25);


        Calculate add3=Calculator::finSum;
        add3.calculate(25,45);

        // [Reference to a Static Method
        Calculate s2 =  Calculator::finSum;
        s2.calculate(10,28);


        // [Reference to a instance method
        Calculator obj =new Calculator();
        Calculate multiply =obj::finMultiply;

        Calculate multiply2 = new Calculator()::finMultiply;
        System.out.println("---------------------------------");

        BiFunction<String,Integer, String> fun = (str,i) -> str.substring(i);
        System.out.println("fun.apply(\"mert\",1) = " + fun.apply("mert", 1));

        BiFunction<String,Integer,String> fun2 = String::substring;
        System.out.println("fun2.apply(\"ramazan\",(2)) = " + fun2.apply("ramazan", (2)));


        Consumer<Integer> display = integer -> System.out.println(integer);
        Consumer<Integer> display2 = System.out::println;

    }


}