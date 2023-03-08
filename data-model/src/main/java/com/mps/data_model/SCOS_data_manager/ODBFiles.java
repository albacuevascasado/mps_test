package com.mps.data_model.SCOS_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_ODB_FILES\"", schema = "mps_schema")
@IdClass(ODBFilesKey.class)
@Getter @Setter
public class ODBFiles {

    @Id
    @Column(name = "\"ODB_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_ODB_FILE_ID\"",
            sequenceName = "\"S_ODB_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_ODB_FILE_ID\""
    )
    private BigInteger odbFileId;

    @Id
    @Column(name = "\"ODB_FILE_NAME\"", nullable = false)
    private String odbFileName;

    @Column(name = "\"ODB_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime odbReceiveDate;

    @Column(name = "\"ODB_PROCESS_DATE\"", nullable = false)
    private LocalDateTime odbProcessDate;

    @Column(name = "\"ODB_ARCHIVE_PATH\"", nullable = false)
    private String odbArchivePath;

    @Column(name = "\"ODB_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private InputFileStatus odbFileStatus;

    @Column(name = "\"ODB_FILE_ERROR\"")
    private String odbFileError;


}
