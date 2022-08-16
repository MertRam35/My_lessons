package com.cydeo.task;

import com.cydeo.task.Orange;

@FunctionalInterface
public interface OrangeFormatter {
    String accept(Orange orange);
}
