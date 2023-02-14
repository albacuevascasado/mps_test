package com.mps.data_model.common;

import java.io.Serializable;
import java.util.Objects;

public class ZIPFilesKey implements Serializable {

    private Long zipFileId;

    private String zipFileName;

    public ZIPFilesKey() {
    }

    public ZIPFilesKey(Long zipFileId, String zipFileName) {
        this.zipFileId = zipFileId;
        this.zipFileName = zipFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZIPFilesKey iporFilesKey = (ZIPFilesKey) o;
        return zipFileId.equals(iporFilesKey.zipFileId) && zipFileName.equals(iporFilesKey.zipFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipFileId, zipFileName);
    }
}
