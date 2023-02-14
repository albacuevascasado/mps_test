package com.mps.data_model.payload_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PCF_FILES\"", schema = "mps_schema")
@IdClass(PCFFilesKey.class)
public class PCFFiles {

    @Id
    @Column(name = "\"PCF_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long pcfFileId;

    @Id
    @Column(name = "\"PCF_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String pcfFileName;

    @Column(name = "\"PCF_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime pcfReceiveDate;

    @Column(name = "\"PCF_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime pcfProcessDate;

    @Column(name = "\"PCF_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String pcfArchivePath;

    @Column(name = "\"PCF_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private InputFileStatus pcfFileStatus;

    @Column(name = "\"PCF_FILE_ERROR\"")
    @Getter @Setter
    private String pcfFileError;
}
