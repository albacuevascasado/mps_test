package com.mps.data_model.payload_data_manager;

import java.io.Serializable;
import java.util.Objects;

public class PRLDataKeys implements Serializable {

    private Long prlId;

    private String prlName;

    public PRLDataKeys() {
    }

    public PRLDataKeys(Long prlId, String prlName) {
        this.prlId = prlId;
        this.prlName = prlName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PRLDataKeys prlDataKeys = (PRLDataKeys) o;
        return prlId.equals(prlDataKeys.prlId) && prlName.equals(prlDataKeys.prlName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prlId, prlName);
    }
}
