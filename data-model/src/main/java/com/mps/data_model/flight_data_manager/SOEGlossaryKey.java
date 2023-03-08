package com.mps.data_model.flight_data_manager;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class SOEGlossaryKey implements Serializable {

    private BigInteger soeEventId;

    private String soeEventName;

    private String soeEventType;

    public SOEGlossaryKey() {
    }

    public SOEGlossaryKey(BigInteger soeEventId, String soeEventName, String soeEventType) {
        this.soeEventId = soeEventId;
        this.soeEventName = soeEventName;
        this.soeEventType = soeEventType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SOEGlossaryKey soeGlossaryKey = (SOEGlossaryKey) o;
        return soeEventId.equals(soeGlossaryKey.soeEventId) && soeEventName.equals(soeGlossaryKey.soeEventName) && soeEventType.equals(soeGlossaryKey.soeEventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soeEventId, soeEventName, soeEventType);
    }
}
