package org.example.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100,"Mike","mike@mike.com", Arrays.asList("123456879654321","897654321")),
                new Employee(101,"Ozzy","ozzy@mike.com", Arrays.asList("12345684321","897654321")),
                new Employee(102,"Peter","peter@mike.com", Arrays.asList("879654321","897654321"))
        );


    }
}
