package com.mps.data_model.task_scheduler;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_PRR_DATA_HEAD\"", schema = "mps_schema")
@Getter @Setter
public class PRRDataHead {

    @Id
    @Column(name = "\"POR_FILE_NAME\"", nullable = false)
    private String porFileName;

    @Column(name = "\"POR_DB_VER\"")
    private String porDbVer;

    @Column(name = "\"POR_FORMAT_VER\"")
    private String porFormatVer;

    @Column(name = "\"POR_VALIDITY\"", nullable = false)
    private String porValidity;

    @Column(name = "\"POR_PROC_DATE\"", nullable = false)
    private LocalDateTime porProcDate;

    @OneToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey =  @ForeignKey(name = "\"T_PRR_DATA_HEAD_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"PRR_FILE_ID\"", referencedColumnName = "\"PRR_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"PRR_FILE_NAME\"", referencedColumnName = "\"PRR_FILE_NAME\"", nullable = false)
            })
    private PRRFiles prrFiles;

}
