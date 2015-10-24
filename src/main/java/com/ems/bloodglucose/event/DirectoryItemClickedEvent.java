package com.ems.bloodglucose.event;

public class DirectoryItemClickedEvent {
    private long itemId;

    public DirectoryItemClickedEvent(long itemId) {

        this.itemId = itemId;
    }

    public long getItemId() {
        return itemId;
    }
}
