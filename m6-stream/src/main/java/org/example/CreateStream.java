package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //creating stream from array
        String[] courses = {"Java", "Spring", "Agile"};
        Stream<String> courseStream = Arrays.stream(courses);


        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> stringStream = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102));
        Stream<Course> courseStream1 = myCourses.stream();

        Stream<Integer> stream = Stream.of(1, 2, 3, 4);



    }
}