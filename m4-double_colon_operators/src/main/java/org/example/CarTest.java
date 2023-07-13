package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // one argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car::new;

        // one argument Constructor

        BiFunction<String,Integer,Car> car2 = Car::new;
        Car honda = car2.apply("Honda", 2020);
        System.out.println(honda.getMake() + " " + honda.getModel());


    }
}
