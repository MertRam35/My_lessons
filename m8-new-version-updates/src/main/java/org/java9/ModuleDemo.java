package org.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {

    public static void main(String[] args) {

        System.out.println(String.class.getModule());
        System.out.println(List.class.getModule());
        System.out.println(Scanner.class.getModule());
    }
}
