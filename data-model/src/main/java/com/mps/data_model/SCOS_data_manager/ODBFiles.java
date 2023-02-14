package com.mps.data_model.SCOS_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_ODB_FILES\"", schema = "mps_schema")
@IdClass(ODBFilesKey.class)
public class ODBFiles {

    @Id
    @Column(name = "\"ODB_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long odbFileId;

    @Id
    @Column(name = "\"ODB_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String odbFileName;

    @Column(name = "\"ODB_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime odbReceiveDate;

    @Column(name = "\"ODB_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime odbProcessDate;

    @Column(name = "\"ODB_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String odbArchivePath;

    @Column(name = "\"ODB_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private InputFileStatus odbFileStatus;

    @Column(name = "\"ODB_FILE_ERROR\"")
    @Getter @Setter
    private String odbFileError;


}
