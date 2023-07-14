package org.example;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        list.forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("Filter");
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
        System.out.println("=========================================");
        System.out.println("distinct");

        System.out.println("list = " + list);
        Stream<Integer> integerStream = list.stream()
                .distinct().filter(integer -> integer % 4 == 0);//.forEach(System.out::println);

        integerStream.forEach(System.out::println);


        System.out.println("==============================================");
        System.out.println("limit ");

        System.out.println("list = " + list);
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("==============================================");
        System.out.println("skip ");
        System.out.println("list = " + list);

        list.stream()
                .filter(integer -> integer % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("==============================================");
        System.out.println("map");
        System.out.println("list = " + list);

        list.stream()
                .map(integer -> integer*2)
                .filter(integer -> integer%3==0)
                .forEach(System.out::println);


        System.out.println("====================================");
        System.out.println("task");
        System.out.println(" Given a list of words, print the number of characters for each word.");


        List<String> words =Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);

    }


}
