package com.mps.data_model.mission_planner;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_FPL_DATA\"", schema = "mps_schema")
public class FPLData {

    @Id
    @Column(name = "\"FPL_FLIGHT_PLAN\"", nullable = false)
    @Getter @Setter
    private String fplFlightPlan;

    @Column(name = "\"FPL_TASK_NAME\"", nullable = false)
    @Getter @Setter
    private String fplTaskName;

    @Column(name = "\"FPL_TASK_TYPE\"", nullable = false)
    @Getter @Setter
    private String fplTaskType;

    @ManyToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_FPL_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"FPL_FILE_ID\"", referencedColumnName = "\"FPL_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"FPL_FILE_NAME\"", referencedColumnName = "\"FPL_FILE_NAME\"", nullable = false)
            })
    @Getter @Setter
    private FPLFiles fplFiles;

}
