package com.mps.data_model.payload_data_manager;

import com.mps.data_model.common.OutputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PRL_FILES\"", schema = "mps_schema")
@IdClass(PRLFilesKey.class)
public class PRLFiles {

    @Id
    @Column(name = "\"PRL_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long prlFileId;

    @Id
    @Column(name = "\"PRL_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String prlFileName;

    @Column(name = "\"PRL_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime prlReceiveDate;

    @Column(name = "\"PRL_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime prlProcessDate;

    @Column(name = "\"PRL_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String prlArchivePath;

    @Column(name = "\"PRL_OWNER_RULES\"", nullable = false)
    @Getter @Setter
    private String prlOwnerRules;

    @Column(name = "\"PRL_STATUS_RULES\"", nullable = false)
    @Getter @Setter
    private String prlStatusRules;

    @Column(name = "\"PRL_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private OutputFileStatus prlFileStatus;

    @Column(name = "\"PRL_FILE_ERROR\"")
    @Getter @Setter
    private String prlFileError;

}
