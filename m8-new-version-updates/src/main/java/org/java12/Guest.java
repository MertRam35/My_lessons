package org.java12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



public class Guest {

    private String name;
    private boolean participating;
    private Integer participantsNumber;

    public Guest(String name, boolean participating, Integer participantsNumber) {
        this.name = name;
        this.participating = participating;
        this.participantsNumber = participantsNumber;
    }

    public String getName() {
        return name;
    }

    public boolean isParticipating() {
        return participating;
    }

    public Integer getParticipantsNumber() {
        return participantsNumber;
    }
}
