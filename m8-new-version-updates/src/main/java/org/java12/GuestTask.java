package org.java12;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class GuestTask {

    public static void main(String[] args) {
        EventParticipation result = Stream.of(

                new Guest("Marco", true, 3),
                new Guest("David", false, 2),
                new Guest("Mert", true, 6)
        ).collect(teeing(filtering(Guest::isParticipating, mapping(Guest::getName, toList())), filtering(Guest::isParticipating, summingInt(Guest::getParticipantsNumber)),
                EventParticipation::new));

        System.out.println("result = " + result);

    }
}
