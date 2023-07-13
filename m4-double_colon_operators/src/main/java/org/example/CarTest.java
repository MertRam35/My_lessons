package org.example;

import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());


    }
}
