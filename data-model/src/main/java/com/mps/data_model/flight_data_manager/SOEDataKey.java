package com.mps.data_model.flight_data_manager;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Objects;

public class SOEDataKey implements Serializable {

    private BigInteger soeEventId;

    private String soeEventName;

    private LocalDateTime soeEventType;

    public SOEDataKey() {
    }

    public SOEDataKey(BigInteger soeEventId, String soeEventName, LocalDateTime soeEventType) {
        this.soeEventId = soeEventId;
        this.soeEventName = soeEventName;
        this.soeEventType = soeEventType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SOEDataKey soeDataKey = (SOEDataKey) o;
        return soeEventId.equals(soeDataKey.soeEventId) && soeEventName.equals(soeDataKey.soeEventName) && soeEventType.equals(soeDataKey.soeEventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soeEventId, soeEventName, soeEventType);
    }
}
