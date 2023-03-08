package com.mps.data_model.payload_data_manager;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class PCFFilesKey implements Serializable {

    private BigInteger pcfFileId;

    private String pcfFileName;

    public PCFFilesKey() {
    }

    public PCFFilesKey(BigInteger pcfFileId, String pcfFileName) {
        this.pcfFileId = pcfFileId;
        this.pcfFileName = pcfFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PCFFilesKey pcfFilesKey = (PCFFilesKey) o;
        return pcfFileId.equals(pcfFilesKey.pcfFileId) && pcfFileName.equals(pcfFilesKey.pcfFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pcfFileId, pcfFileName);
    }
}
