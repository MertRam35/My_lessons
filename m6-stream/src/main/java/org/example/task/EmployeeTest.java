package org.example.task;

import java.awt.*;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        System.out.println("Print all e mails");
EmployeeData.readAll()
        .map(Employee::getEmpMail)
        .forEach(System.out::println);

        System.out.println("Print all phone numbers");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);


        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all phone numbers with double colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);













    }
}
