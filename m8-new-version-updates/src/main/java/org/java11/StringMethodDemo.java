package org.java11;

public class StringMethodDemo {

    public static void main(String[] args) {

        var str = "Mike \n Ozzy \n Tom \n Emmy";

        str.lines().forEach(System.out::println);
    }
}
