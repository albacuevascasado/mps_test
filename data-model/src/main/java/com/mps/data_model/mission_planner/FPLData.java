package com.mps.data_model.mission_planner;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_FPL_DATA\"", schema = "mps_schema")
@Getter @Setter
public class FPLData {

    @Id
    @Column(name = "\"FPL_FLIGHT_PLAN\"", nullable = false)
    private String fplFlightPlan;

    @Column(name = "\"FPL_TASK_NAME\"", nullable = false)
    private String fplTaskName;

    @Column(name = "\"FPL_TASK_TYPE\"", nullable = false)
    private String fplTaskType;

    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_FPL_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"FPL_FILE_ID\"", referencedColumnName = "\"FPL_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"FPL_FILE_NAME\"", referencedColumnName = "\"FPL_FILE_NAME\"", nullable = false)
            })
    private FPLFiles fplFiles;

}
