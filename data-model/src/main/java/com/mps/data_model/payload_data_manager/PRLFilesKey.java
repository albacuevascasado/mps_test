package com.mps.data_model.payload_data_manager;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class PRLFilesKey implements Serializable {

    private BigInteger prlFileId;

    private String prlFileName;

    public PRLFilesKey() {
    }

    public PRLFilesKey(BigInteger prlFileId, String prlFileName) {
        this.prlFileId = prlFileId;
        this.prlFileName = prlFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PRLFilesKey prlFilesKey = (PRLFilesKey) o;
        return prlFileId.equals(prlFilesKey.prlFileId) && prlFileName.equals(prlFilesKey.prlFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prlFileId, prlFileName);
    }
}
