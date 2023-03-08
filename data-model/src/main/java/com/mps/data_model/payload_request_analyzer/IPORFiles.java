package com.mps.data_model.payload_request_analyzer;

import com.mps.data_model.common.InputFileStatus;
import com.mps.data_model.common.ZIPFilesKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_IPOR_FILES\"", schema = "mps_schema")
@IdClass(ZIPFilesKey.class)
@Getter @Setter
public class IPORFiles {

    @Id
    @Column(name = "\"ZIP_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_IPOR_FILE_ID\"",
            sequenceName = "\"S_IPOR_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_IPOR_FILE_ID\""
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
    private InputFileStatus zipFileStatus;

    @Column(name = "\"ZIP_FILE_ERROR\"")
    private String zipFileError;

}
