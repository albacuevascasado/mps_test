package com.mps.data_model.flight_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SOE_FILES\"", schema = "mps_schema")
@IdClass(SOEFilesKey.class)
@Getter @Setter
public class SOEFiles {

    @Id
    @Column(name = "\"SOE_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_SOE_FILE_ID\"",
            sequenceName = "\"S_SOE_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_SOE_FILE_ID\""
    )
    private BigInteger soeFileId;

    @Id
    @Column(name = "\"SOE_FILE_NAME\"", nullable = false)
    private String soeFileName;

    @Column(name = "\"SOE_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime soeReceiveDate;

    @Column(name = "\"SOE_PROCESS_DATE\"", nullable = false)
    private LocalDateTime soeProcessDate;

    @Column(name = "\"SOE_ARCHIVE_PATH\"", nullable = false)
    private String soeArchivePath;

    @Column(name = "\"SOE_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private InputFileStatus soeFileStatus;

    @Column(name = "\"SOE_FILE_ERROR\"")
    private String soeFileError;

}
