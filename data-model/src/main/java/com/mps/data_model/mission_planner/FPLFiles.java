package com.mps.data_model.mission_planner;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_FPL_FILES\"", schema = "mps_schema")
@IdClass(FPLFilesKey.class)
public class FPLFiles {

    @Id
    @Column(name = "\"FPL_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long fplFileId;

    @Id
    @Column(name = "\"FPL_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String fplFileName;

    @Column(name = "\"FPL_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime fplProcessDate;

    @Column(name = "\"FPL_TRANSMIT_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime fplTransmitDate;

    @Column(name = "\"FPL_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String fplArchivePath;

    @Column(name = "\"FPL_FILE_STATUS\"", nullable = false)
    @Getter @Setter
    private OutputFileStatus fplFileStatus;

    @Column(name = "\"FPL_FILE_ERROR\"")
    @Getter @Setter
    private String fplFileError;

}
