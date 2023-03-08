package com.mps.data_model.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class ZIPFilesKey implements Serializable {

    private BigInteger zipFileId;

    private String zipFileName;

    public ZIPFilesKey() {
    }

    public ZIPFilesKey(BigInteger zipFileId, String zipFileName) {
        this.zipFileId = zipFileId;
        this.zipFileName = zipFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZIPFilesKey zipFilesKey = (ZIPFilesKey) o;
        return zipFileId.equals(zipFilesKey.zipFileId) && zipFileName.equals(zipFilesKey.zipFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipFileId, zipFileName);
    }
}
