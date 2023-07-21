package org.java12;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.*;

public class TeeingDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "B", 200),
                new Employee(3, "C", 300),
                new Employee(4, "D", 400)


        );
        HashMap<String, Employee> result = employeeList.stream().collect(teeing(
                maxBy(Comparator.comparing(Employee::getSalary)), minBy(Comparator.comparing(Employee::getSalary)),
                (e1, e2) -> {

                    HashMap<String, Employee> map = new HashMap<>();
                    map.put("MAX", e1.get());
                    map.put("MIN", e2.get());
                    return map;
                }


        ));
        System.out.println("result = " + result);


    }
}

@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private int salary;


}
