package com.mps.data_model.payload_data_manager;

import com.mps.data_model.common.OutputFileStatus;
import com.mps.data_model.common.PRLStatusRules;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PRL_FILES\"", schema = "mps_schema")
@IdClass(PRLFilesKey.class)
@Getter @Setter
public class PRLFiles {

    @Id
    @Column(name = "\"PRL_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_PRL_FILE_ID\"",
            sequenceName = "\"S_PRL_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_PRL_FILE_ID\""
    )
    private BigInteger prlFileId;

    @Id
    @Column(name = "\"PRL_FILE_NAME\"", nullable = false)
    private String prlFileName;

    @Column(name = "\"PRL_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime prlReceiveDate;

    @Column(name = "\"PRL_PROCESS_DATE\"", nullable = false)
    private LocalDateTime prlProcessDate;

    @Column(name = "\"PRL_ARCHIVE_PATH\"", nullable = false)
    private String prlArchivePath;

    @Column(name = "\"PRL_OWNER_RULES\"", nullable = false)
    private String prlOwnerRules;

    @Column(name = "\"PRL_STATUS_RULES\"", nullable = false)
    private PRLStatusRules prlStatusRules;

    @Column(name = "\"PRL_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private OutputFileStatus prlFileStatus;

    @Column(name = "\"PRL_FILE_ERROR\"")
    private String prlFileError;

}
