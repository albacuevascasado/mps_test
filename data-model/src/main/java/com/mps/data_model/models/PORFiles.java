package com.mps.data_model.models;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_POR_FILES\"", schema = "mps_schema")
@IdClass(PORKeys.class)
@Getter @Setter
public class PORFiles {

    @Id
    @Column(name = "\"POR_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_POR_FILE_ID\"",
            sequenceName = "\"S_POR_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_POR_FILE_ID\""
    )
    private BigInteger porFileId;

    @Id
    @Column(name = "\"POR_FILE_NAME\"", nullable = false)
    private String porFileName;

    @Column(name = "\"POR_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime porReceiveDate;

    @Column(name = "\"POR_PROCESS_DATE\"", nullable = false)
    private LocalDateTime porProcessDate;

    @Column(name = "\"POR_ARCHIVE_PATH\"", nullable = false)
    private String porArchivePath;

    @Column(name = "\"ZIP_FILE_ID\"")
    private BigInteger zipFileId;

    @Column(name = "\"ZIP_FILE_NAME\"")
    private String zipFileName;

    @Column(name = "\"POR_FILE_STATUS\"", nullable = false)
    private InputFileStatus porFileStatus;

    @Column(name = "\"POR_FILE_ERROR\"")
    private String porFileError;
}

