package com.ems.bloodglucose.event;

public class IndividualSavedEvent {
    private final long id;

    public IndividualSavedEvent(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
