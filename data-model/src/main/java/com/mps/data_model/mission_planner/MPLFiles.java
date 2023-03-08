package com.mps.data_model.mission_planner;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_MPL_FILES\"", schema = "mps_schema")
@IdClass(MPLFilesKey.class)
@Getter @Setter
public class MPLFiles {

    @Id
    @Column(name = "\"MPL_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_MPL_FILE_ID\"",
            sequenceName = "\"S_MPL_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_MPL_FILE_ID\""
    )
    private BigInteger mplFileId;

    @Id
    @Column(name = "\"MPL_FILE_NAME\"", nullable = false)
    private String mplFileName;

    @Column(name = "\"MPL_PROCESS_DATE\"", nullable = false)
    private LocalDateTime mplProcessDate;

    @Column(name = "\"MPL_TRANSMIT_DATE\"", nullable = false)
    private LocalDateTime mplTransmitDate;

    @Column(name = "\"MPL_ARCHIVE_PATH\"", nullable = false)
    private String mplArchivePath;

    @Column(name = "\"MPL_FILE_STATUS\"", nullable = false)
    private OutputFileStatus mplFileStatus;

    @Column(name = "\"MPL_FILE_ERROR\"")
    private String mplFileError;

}
