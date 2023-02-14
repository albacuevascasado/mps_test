package com.mps.data_model.payload_request_analyzer;

import com.mps.data_model.common.InputFileStatus;
import com.mps.data_model.common.ZIPFilesKey;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_IPOR_FILES\"", schema = "mps_schema")
@IdClass(ZIPFilesKey.class)
public class IPORFiles {

    @Id
    @Column(name = "\"ZIP_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long zipFileId;

    @Id
    @Column(name = "\"ZIP_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String zipFileName;

    @Column(name = "\"ZIP_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime zipReceiveDate;

    @Column(name = "\"ZIP_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime zipProcessDate;

    @Column(name = "\"ZIP_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String zipArchivePath;

    @Column(name = "\"ZIP_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private InputFileStatus zipFileStatus;

    @Column(name = "\"ZIP_FILE_ERROR\"")
    @Getter @Setter
    private String zipFileError;

}
