package org.example.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {


    /*    List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        ); */

        System.out.println("Print all dish’s name that has less than 400 calories.");

        DishData.menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("Print the length of the name of each dish");

        //all name
        DishData.menu.stream()
                .map(Dish::getName).forEach(System.out::println);
        // task
        DishData.menu.stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("print three high caloric dish name (>300) ");

        DishData.menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(comparing(Dish::getCalories))
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println(" print dish name are below 400 calories in sorted");

        DishData.menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
