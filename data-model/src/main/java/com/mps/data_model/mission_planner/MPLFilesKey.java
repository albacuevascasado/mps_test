package com.mps.data_model.mission_planner;

import java.io.Serializable;
import java.util.Objects;

public class MPLFilesKey implements Serializable {

    private Long mplFileId;

    private String mplFileName;

    public MPLFilesKey() {
    }

    public MPLFilesKey(Long mplFileId, String mplFileName) {
        this.mplFileId = mplFileId;
        this.mplFileName = mplFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MPLFilesKey mplFilesKey = (MPLFilesKey) o;
        return mplFileId.equals(mplFilesKey.mplFileId) && mplFileName.equals(mplFilesKey.mplFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mplFileId, mplFileName);
    }
}
