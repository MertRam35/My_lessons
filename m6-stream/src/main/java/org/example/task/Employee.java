package org.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String empName;
    private String empMail;
    private List<String> empPhoneNumbers;
}
