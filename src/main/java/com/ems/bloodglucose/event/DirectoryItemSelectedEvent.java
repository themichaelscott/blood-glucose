package com.ems.bloodglucose.event;

public class DirectoryItemSelectedEvent {
    private final long id;

    public DirectoryItemSelectedEvent(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
