package com.mps.data_model.task_scheduler;

import com.mps.data_model.common.OutputFileStatus;
import com.mps.data_model.common.ZIPFilesKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_IPRR_FILES\"", schema = "mps_schema")
@IdClass(ZIPFilesKey.class)
@Getter @Setter
public class IPRRFiles {

    @Id
    @Column(name = "\"ZIP_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_IPRR_FILE_ID\"",
            sequenceName = "\"S_IPRR_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_IPRR_FILE_ID\""
    )
    private BigInteger zipFileId;

    @Id
    @Column(name = "\"ZIP_FILE_NAME\"", nullable = false)
    private String zipFileName;

    @Column(name = "\"ZIP_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime zipReceiveDate;

    @Column(name = "\"ZIP_PROCESS_DATE\"", nullable = false)
    private LocalDateTime zipProcessDate;

    @Column(name = "\"ZIP_ARCHIVE_PATH\"", nullable = false)
    private String zipArchivePath;

    @Column(name = "\"ZIP_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private OutputFileStatus zipFileStatus;

    @Column(name = "\"ZIP_FILE_ERROR\"")
    private String zipFileError;

}
