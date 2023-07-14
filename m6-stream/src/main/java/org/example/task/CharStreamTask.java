package org.example.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        System.out.println(" Given a list of words, print the number of characters for each word.");


        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
