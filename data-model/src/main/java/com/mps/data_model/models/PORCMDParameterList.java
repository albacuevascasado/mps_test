package com.mps.data_model.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_POR_CMD_PARAMETER_LIST\"", schema = "mps_schema")
@Getter @Setter
public class PORCMDParameterList {

    @Id
    @Column(name = "\"PARAMETER_NAME\"", nullable = false)
    private String parameterName;




    @ManyToOne
    @JoinColumn( foreignKey = @ForeignKey(name = "\"T_POR_CMD_PARAMETER_LIST_COMMAND_NAME_fkey\""),
                 name = "\"COMMAND_NAME\"", referencedColumnName = "\"COMMAND_NAME\"", nullable = false)
    private PORDataCommand porDataCommand;

    @ManyToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_POR_CMD_PARAMETER_LIST_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"POR_FILE_ID\"", referencedColumnName = "\"POR_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"POR_FILE_NAME\"", referencedColumnName = "\"POR_FILE_NAME\"", nullable = false)
            })
    private PORFiles porFiles;
}
