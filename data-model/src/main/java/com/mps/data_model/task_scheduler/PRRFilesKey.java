package com.mps.data_model.task_scheduler;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class PRRFilesKey implements Serializable {

    private BigInteger prrFileId;

    private String prrFileName;

    public PRRFilesKey() {
    }

    public PRRFilesKey(BigInteger prrFileId, String prrFileName) {
        this.prrFileId = prrFileId;
        this.prrFileName = prrFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PRRFilesKey prrFilesKey = (PRRFilesKey) o;
        return prrFileId.equals(prrFilesKey.prrFileId) && prrFileName.equals(prrFilesKey.prrFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prrFileId, prrFileName);
    }
}
