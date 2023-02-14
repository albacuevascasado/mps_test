package com.mps.data_model.flight_data_manager;

import java.io.Serializable;
import java.util.Objects;

public class SOEFilesKey implements Serializable {

    private Long soeFileId;

    private String soeFileName;

    public SOEFilesKey() {
    }

    public SOEFilesKey(Long soeFileId, String soeFileName) {
        this.soeFileId = soeFileId;
        this.soeFileName = soeFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SOEFilesKey soeFilesKey = (SOEFilesKey) o;
        return soeFileId.equals(soeFilesKey.soeFileId) && soeFileName.equals(soeFilesKey.soeFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soeFileId, soeFileName);
    }
}


