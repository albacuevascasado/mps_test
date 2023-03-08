package com.mps.data_model.mission_planner;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class FPLFilesKey implements Serializable {

    private BigInteger fplFileId;

    private String fplFileName;

    public FPLFilesKey() {
    }

    public FPLFilesKey(BigInteger fplFileId, String fplFileName) {
        this.fplFileId = fplFileId;
        this.fplFileName = fplFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FPLFilesKey fplFilesKey = (FPLFilesKey) o;
        return fplFileId.equals(fplFilesKey.fplFileId) && fplFileName.equals(fplFilesKey.fplFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fplFileId, fplFileName);
    }
}
