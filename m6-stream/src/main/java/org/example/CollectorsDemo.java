package org.example;

import org.example.task.Dish;
import org.example.task.DishData;
import org.example.task.Type;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        System.out.println("toCollection(Supplier): is used to create collecion using collector");

        ArrayList<Integer> numbersList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(toCollection(ArrayList::new));

        System.out.println(numbersList);
        numbers.stream()
                .filter(x -> x%2==0)
                .collect(toCollection(HashSet::new));


        System.out.println("tolist(): returns a collector interface that gather the input data into a new list");

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numbersList);

        System.out.println("toSet(): returns a collector interface that gather the input data into a new set");

        Set<Integer> numbersSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numbersSet);

        System.out.println("toMap(function,function): returns a collector interface that gather the input data into a new map");

        Map<String, Integer> dishMap = DishData.menu.stream()
                .collect(toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);


        System.out.println("summingInt(TOıntFunciton) returns collector produces the sum of ınteger valued func");

        IntSummaryStatistics collect = DishData.menu.stream()
                .collect(summarizingInt(Dish::getCalories));
        System.out.println(collect);

        Integer summingInt = DishData.menu.stream().collect(summingInt(Dish::getCalories));
        Integer summingInt2 = DishData.menu.stream().mapToInt(Dish::getCalories).sum();

        System.out.println(summingInt);
        System.out.println(summingInt2);

        System.out.println("counting() : returns a collctor that counts number that counts number of the elements");
        Long collect1 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(counting());
        Long collect2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println(collect1);
        System.out.println(collect2);


        System.out.println("averageınt(toIntFunction) :returns the average of the integers passed values");


        Double collect3 = DishData.menu.stream()
                .collect(averagingInt(Dish::getCalories));

        System.out.println(collect3);

        System.out.println("joining(): is used to join every elements of character or string aray into a single object");

        List<String> courses = Arrays.asList("Java", "js", "fb");
        String str = courses.stream()
                .collect(joining(", "));
        String str2 = String.join(", ", courses);//same output
        System.out.println(str);
        System.out.println(str2);


        System.out.println("partitioningBy() is acceps boolean return map  object");

        Map<Boolean, List<Dish>> booleanListMap = DishData.menu.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        System.out.println(booleanListMap);

        System.out.println("groupingBy(): is used for grouping objects by some property and storing in a Map instance");

        Map<Type, List<Dish>> typeListMap = DishData.menu.stream()
                .collect(groupingBy(Dish::getType));
        System.out.println(typeListMap);


    }


}
