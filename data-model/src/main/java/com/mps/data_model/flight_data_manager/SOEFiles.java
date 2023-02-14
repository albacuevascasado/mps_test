package com.mps.data_model.flight_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SOE_FILES\"", schema = "mps_schema")
@IdClass(SOEFilesKey.class)
public class SOEFiles {

    @Id
    @Column(name = "\"SOE_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long soeFileId;

    @Id
    @Column(name = "\"SOE_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String soeFileName;

    @Column(name = "\"SOE_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime soeReceiveDate;

    @Column(name = "\"SOE_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime soeProcessDate;

    @Column(name = "\"SOE_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String soeArchivePath;

    @Column(name = "\"SOE_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private InputFileStatus soeFileStatus;

    @Column(name = "\"SOE_FILE_ERROR\"")
    @Getter @Setter
    private String soeFileError;

}
