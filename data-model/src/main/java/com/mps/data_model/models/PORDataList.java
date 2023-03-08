package com.mps.data_model.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_POR_DATA_LIST\"", schema = "mps_schema")
@IdClass(PORKeys.class)
@Getter @Setter
public class PORDataList {

    @Id
    @Column(name = "\"POR_FILE_ID\"", nullable = false)
    private BigInteger porFileId;

    @Id
    @Column(name = "\"POR_FILE_NAME\"", nullable = false)
    private String porFileName;

    @Column(name = "\"POR_OCCURRENCE_COUNT\"", nullable = false)
    private BigInteger porOccurrenceCount;

    @Column(name = "\"POR_CREATION_TIME\"")
    private LocalDateTime porCreationTime;

    @Column(name = "\"POR_AUTHOR\"")
    private String porAuthor;

    @Column(name = "\"POR_DESCRIPTION\"")
    private String porDescription;

    @OneToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_POR_DATA_LIST_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"POR_FILE_ID\"", referencedColumnName = "\"POR_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"POR_FILE_NAME\"", referencedColumnName = "\"POR_FILE_NAME\"", nullable = false)
            })
    @MapsId
    private PORFiles porFiles;


}
