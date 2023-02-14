package com.mps.data_model.task_scheduler;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PRR_FILES\"", schema = "mps_schema")
@IdClass(PRRFilesKey.class)
public class PRRFiles {

    @Id
    @Column(name = "\"PRR_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long prrFileId;

    @Id
    @Column(name = "\"PRR_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String prrFileName;

    @Column(name = "\"PRR_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime prrProcessDate;

    @Column(name = "\"PRR_TRANSMIT_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime prrTransmitDate;

    @Column(name = "\"PRR_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String prrArchivePath;

    @Column(name = "\"ZIP_FILE_ID\"")
    @Getter @Setter
    private Long zipFileId;

    @Column(name = "ZIP_FILE_NAME")
    @Getter @Setter
    private String zipFileName;

    @Column(name = "\"PRR_FILE_STATUS\"", nullable = false)
    @Getter @Setter
    private OutputFileStatus prrFileStatus;

    @Column(name = "\"PRR_FILE_ERROR\"")
    @Getter @Setter
    private String prrFileError;

}
