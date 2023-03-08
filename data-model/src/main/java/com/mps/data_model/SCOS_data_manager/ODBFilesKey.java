package com.mps.data_model.SCOS_data_manager;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class ODBFilesKey implements Serializable {

    private BigInteger odbFileId;

    private String odbFileName;

    public ODBFilesKey() {
    }

    public ODBFilesKey(BigInteger odbFileId, String odbFileName) {
        this.odbFileId = odbFileId;
        this.odbFileName = odbFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ODBFilesKey odbFilesKey = (ODBFilesKey) o;
        return odbFileId.equals(odbFilesKey.odbFileId) && odbFileName.equals(odbFilesKey.odbFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odbFileId, odbFileName);
    }
}
