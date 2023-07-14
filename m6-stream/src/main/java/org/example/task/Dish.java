package org.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.net.Proxy;
@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;


}
