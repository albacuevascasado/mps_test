package com.mps.data_model.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PORKeys implements Serializable {

    @Column(name = "\"POR_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long porFileId;


    @Column(name = "\"POR_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String porFileName;

    public PORKeys() {
    }

    public PORKeys(Long porFileId, String porFileName) {
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
