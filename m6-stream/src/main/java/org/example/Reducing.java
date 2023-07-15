package org.example;

import org.example.task.Dish;
import org.example.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        //REDUCE method like fibionacci numbers

        Integer reduceExample = numbers.stream().reduce(0, (a, b) -> a + b);
//        Integer reduceExample = numbers.stream().reduce(0, Integer::sum);
        System.out.println(reduceExample);

        Optional<Integer> reduce = numbers.stream().reduce(Integer::sum);
        System.out.println(reduce);


        Optional<Integer> caloryReduce = DishData.menu.stream()
                .map(Dish::getCalories)
                .reduce((a, b) -> a + b);
        System.out.println(caloryReduce);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);


        System.out.println("\"Count\" = " + "Count");

        long count = DishData.menu.stream().count();
        System.out.println(count);




    }
}
