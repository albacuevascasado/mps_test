package com.mps.data_model.mission_planner;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_FPL_FILES\"", schema = "mps_schema")
@IdClass(FPLFilesKey.class)
@Getter @Setter
public class FPLFiles {

    @Id
    @Column(name = "\"FPL_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_FPL_FILE_ID\"",
            sequenceName = "\"S_FPL_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_FPL_FILE_ID\""
    )
    private BigInteger fplFileId;

    @Id
    @Column(name = "\"FPL_FILE_NAME\"", nullable = false)
    private String fplFileName;

    @Column(name = "\"FPL_PROCESS_DATE\"", nullable = false)
    private LocalDateTime fplProcessDate;

    @Column(name = "\"FPL_TRANSMIT_DATE\"", nullable = false)
    private LocalDateTime fplTransmitDate;

    @Column(name = "\"FPL_ARCHIVE_PATH\"", nullable = false)
    private String fplArchivePath;

    @Column(name = "\"FPL_FILE_STATUS\"", nullable = false)
    private OutputFileStatus fplFileStatus;

    @Column(name = "\"FPL_FILE_ERROR\"")
    private String fplFileError;

}
