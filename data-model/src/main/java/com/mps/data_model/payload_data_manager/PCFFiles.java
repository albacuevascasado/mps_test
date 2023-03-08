package com.mps.data_model.payload_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PCF_FILES\"", schema = "mps_schema")
@IdClass(PCFFilesKey.class)
@Getter @Setter
public class PCFFiles {

    @Id
    @Column(name = "\"PCF_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_PCF_FILE_ID\"",
            sequenceName = "\"S_PCF_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_PCF_FILE_ID\""
    )
    private BigInteger pcfFileId;

    @Id
    @Column(name = "\"PCF_FILE_NAME\"", nullable = false)
    private String pcfFileName;

    @Column(name = "\"PCF_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime pcfReceiveDate;

    @Column(name = "\"PCF_PROCESS_DATE\"", nullable = false)
    private LocalDateTime pcfProcessDate;

    @Column(name = "\"PCF_ARCHIVE_PATH\"", nullable = false)
    private String pcfArchivePath;

    @Column(name = "\"PCF_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private InputFileStatus pcfFileStatus;

    @Column(name = "\"PCF_FILE_ERROR\"")
    private String pcfFileError;
}
