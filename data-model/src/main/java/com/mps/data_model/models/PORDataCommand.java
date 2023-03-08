package com.mps.data_model.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "\"T_POR_DATA_COMMAND\"", schema = "mps_schema")
@SecondaryTable(name = "\"T_POR_CMD_RELEASE_TIME\"", schema = "mps_schema",
                pkJoinColumns = @PrimaryKeyJoinColumn(name = "\"COMMAND_NAME\"", referencedColumnName = "\"COMMAND_NAME\"",
                        foreignKey = @ForeignKey( name = "\"T_POR_CMD_RELEASE_TIME_COMMAND_NAME_fkey\""))
)
@Getter @Setter
public class PORDataCommand {

    @Id
    @Column(name = "\"COMMAND_NAME\"", nullable = false)
    private String commandName;

    @Column(name = "\"COMMAND_TYPE\"")
    private String commandType;

    @Column(name = "\"PLAN_DATA_UNIQUE_ID\"", nullable = false)
    private String planDataUniqueId;

    @Column(name = "\"PLAN_DATA_PASS_ID\"")
    private String planDataPassId;

    @Column(name = "\"PLAN_DATA_FLAG\"", nullable = false)
    private String planDataFlag;

    @Column(name = "\"PLAN_DATA_SOURCE\"")
    private String planDataSource;

    @Column(name = "\"PLAN_DATA_DEST\"")
    private String planDataDest;

    @Column(name = "\"SUB_SCHEDULE_ID\"")
    private BigInteger subScheduleId;

    @Column(name = "\"DESCRIPTION\"")
    private String description;

    /*
    @OneToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_POR_CMD_RELEASE_TIME_COMMAND_NAME_fkey\""),
            value = {
                    @JoinColumn(table = "\"T_POR_CMD_RELEASE_TIME\"" ,name = "\"POR_FILE_ID\"", referencedColumnName = "\"POR_FILE_ID\"", nullable = false),
                    @JoinColumn(table = "\"T_POR_CMD_RELEASE_TIME\"", name = "\"POR_FILE_NAME\"", referencedColumnName = "\"POR_FILE_NAME\"", nullable = false)
            })
    private PORFiles porFiles;

     */


}
