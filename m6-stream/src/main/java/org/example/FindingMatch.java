package org.example;

import org.example.task.Dish;
import org.example.task.DishData;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatch {

    public static void main(String[] args) {

        System.out.println("All match ");

        boolean allMatch = DishData.menu.stream().allMatch(dish -> dish.getCalories() <1400);
        System.out.println(allMatch);

        System.out.println("any match ");
        if (DishData.menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }
        System.out.println("none match ");

        boolean noneMatch = DishData.menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(noneMatch);

        System.out.println("find any");//if filter not match, not return nullpointerexception
        Optional<Dish> dish = DishData.menu.stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("find first");
        Optional<Dish> dish2 = DishData.menu.stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);

        System.out.println("Parallel streams (ASYNC)");
        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());


    }



}
