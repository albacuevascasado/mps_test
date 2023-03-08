package com.mps.data_model.task_scheduler;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "\"T_PRR_DATA_ERRS\"", schema = "mps_schema")
@Getter @Setter
public class PRRDataErrs {

    @Id
    @Column(name = "\"PRR_ERROR_LINE\"", nullable = false)
    private BigInteger prrErrorLine;

    @Column(name = "\"PRR_ERROR_TEXT\"", nullable = false)
    private String prrErrorText;

    @ManyToOne
    @JoinColumn(
            foreignKey =  @ForeignKey(name = "\"T_PRR_DATA_ERRS_POR_FILE_NAME_fkey\""),
            name = "\"POR_FILE_NAME\"", referencedColumnName = "\"POR_FILE_NAME\"", nullable = false
    )
    private PRRDataHead prrDataHead;

    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_PRR_DATA_ERRS_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"PRR_FILE_ID\"", referencedColumnName = "\"PRR_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"PRR_FILE_NAME\"", referencedColumnName = "\"PRR_FILE_NAME\"", nullable = false)
            })
    private PRRFiles prrFiles;



}
