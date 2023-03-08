package com.mps.data_model.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;


public class PORKeys implements Serializable {

    private BigInteger porFileId;

    private String porFileName;

    public PORKeys() {
    }

    public PORKeys(BigInteger porFileId, String porFileName) {
        this.porFileId = porFileId;
        this.porFileName = porFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PORKeys porDataHeadKeys = (PORKeys) o;
        return porFileId.equals(porDataHeadKeys.porFileId) && porFileName.equals(porDataHeadKeys.porFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(porFileId, porFileName);
    }
}
