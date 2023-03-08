package com.mps.data_model.models;

import java.io.Serializable;
import java.util.Objects;

public class SYSEventsKey implements Serializable {

    private String eventId;

    private String eventName;

    public SYSEventsKey() {
    }

    public SYSEventsKey(String eventId, String eventName) {
        this.eventId = eventId;
        this.eventName = eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SYSEventsKey sysEventsKey = (SYSEventsKey) o;
        return eventId.equals(sysEventsKey.eventId) && eventName.equals(sysEventsKey.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventName);
    }
}
