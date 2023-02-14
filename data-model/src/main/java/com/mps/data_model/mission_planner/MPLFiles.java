package com.mps.data_model.mission_planner;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_MPL_FILES\"", schema = "mps_schema")
@IdClass(MPLFilesKey.class)
public class MPLFiles {

    @Id
    @Column(name = "\"MPL_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long mplFileId;

    @Id
    @Column(name = "\"MPL_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String mplFileName;

    @Column(name = "\"MPL_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime mplProcessDate;

    @Column(name = "\"MPL_TRANSMIT_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime mplTransmitDate;

    @Column(name = "\"MPL_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String mplArchivePath;

    @Column(name = "\"MPL_FILE_STATUS\"", nullable = false)
    @Getter @Setter
    private OutputFileStatus mplFileStatus;

    @Column(name = "\"MPL_FILE_ERROR\"")
    @Getter @Setter
    private String mplFileError;

}
