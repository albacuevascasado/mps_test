package com.mps.data_model.task_scheduler;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PRR_FILES\"", schema = "mps_schema")
@IdClass(PRRFilesKey.class)
@Getter @Setter
public class PRRFiles {

    @Id
    @Column(name = "\"PRR_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_PRR_FILE_ID\"",
            sequenceName = "\"S_PRR_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_PRR_FILE_ID\""
    )
    private BigInteger prrFileId;

    @Id
    @Column(name = "\"PRR_FILE_NAME\"", nullable = false)
    private String prrFileName;

    @Column(name = "\"PRR_PROCESS_DATE\"", nullable = false)
    private LocalDateTime prrProcessDate;

    @Column(name = "\"PRR_TRANSMIT_DATE\"", nullable = false)
    private LocalDateTime prrTransmitDate;

    @Column(name = "\"PRR_ARCHIVE_PATH\"", nullable = false)
    private String prrArchivePath;

    @Column(name = "\"ZIP_FILE_ID\"")
    private BigInteger zipFileId;

    @Column(name = "ZIP_FILE_NAME")
    private String zipFileName;

    @Column(name = "\"PRR_FILE_STATUS\"", nullable = false)
    private OutputFileStatus prrFileStatus;

    @Column(name = "\"PRR_FILE_ERROR\"")
    private String prrFileError;

}
