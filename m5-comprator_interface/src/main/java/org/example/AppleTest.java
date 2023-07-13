package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));


        Comparator<Apple> sortApple = comparing(apple -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);
        System.out.println("============================================================");
        //double colon
        Comparator<Apple> sortApple2 = Comparator.comparing(Apple::getWeight);// without static import
        Comparator<Apple> sortApple3 = comparing(Apple::getWeight);         // with import class
        inventory.sort(comparing(Apple::getWeight));            // shortest way
        System.out.println(inventory);

        //reversed
        inventory.sort(comparing(Apple::getWeight).reversed());//descending sort with reversed
        System.out.println(inventory);

        //chaining
        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));
        System.out.println(inventory+" chaining");


    }
}
