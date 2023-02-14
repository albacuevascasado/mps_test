package com.mps.data_model.mission_planner;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_MPL_DATA\"", schema = "mps_schema")
public class MPLData {

    @Id
    @Column(name = "\"MPL_MISSION_PLAN\"", nullable = false)
    @Getter @Setter
    private String mplMissionPlan;

    @Column(name = "\"MPL_TASK_NAME\"", nullable = false)
    @Getter @Setter
    private String mplTaskName;

    @Column(name = "\"MPL_TASK_TYPE\"", nullable = false)
    @Getter @Setter
    private String mplTaskType;

    @ManyToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_MPL_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"MPL_FILE_ID\"", referencedColumnName = "\"MPL_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"MPL_FILE_NAME\"", referencedColumnName = "\"MPL_FILE_NAME\"", nullable = false)
            })
    @Getter @Setter
    private MPLFiles mplFiles;

}
