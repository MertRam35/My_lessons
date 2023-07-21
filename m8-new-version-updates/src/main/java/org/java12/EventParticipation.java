package org.java12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
@ToString
@AllArgsConstructor

public class EventParticipation {

    private List<String> guestNameList;
    private Integer totalNumberOfParticipants;

}
