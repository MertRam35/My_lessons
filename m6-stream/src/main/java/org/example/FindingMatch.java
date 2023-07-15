package org.example;

import org.example.task.Dish;
import org.example.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindingMatch {

    public static void main(String[] args) {

        System.out.println("All match ");

        boolean allMatch = DishData.menu.stream().allMatch(dish -> dish.getCalories() < 1400);
        System.out.println(allMatch);

        System.out.println("any match ");
        if (DishData.menu.stream().anyMatch(Dish::isVegetarian)) {
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

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        System.out.println(list1.parallelStream().filter(s -> s.startsWith("J")).findAny());
        System.out.println(list1.parallelStream().filter(s -> s.startsWith("J")).findFirst());

        System.out.println("MIN");
        Optional<Dish> min = DishData.menu.stream().min(Comparator.comparing(Dish::getCalories));

        Stream<Dish> sorted = DishData.menu.stream().sorted(Comparator.comparing(Dish::getCalories));
        Optional<Dish> first = sorted.findFirst();

        System.out.println(min);
        System.out.println(first);

        System.out.println("MAX");

        Optional<Dish> max = DishData.menu.stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(max);
        //System.out.println(DishData.menu.stream().sorted(Comparator.comparing(Dish::getCalories).reversed()).findFirst());
        Optional<Dish> maxSort = DishData.menu.stream().sorted(Comparator.comparing(Dish::getCalories).reversed()).findFirst();
        System.out.println(maxSort);








    }


}
