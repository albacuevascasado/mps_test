package com.mps.data_model.mission_planner;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_MPL_DATA\"", schema = "mps_schema")
@Getter @Setter
public class MPLData {

    @Id
    @Column(name = "\"MPL_MISSION_PLAN\"", nullable = false)
    private String mplMissionPlan;

    @Column(name = "\"MPL_TASK_NAME\"", nullable = false)
    private String mplTaskName;

    @Column(name = "\"MPL_TASK_TYPE\"", nullable = false)
    private String mplTaskType;

    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_MPL_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"MPL_FILE_ID\"", referencedColumnName = "\"MPL_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"MPL_FILE_NAME\"", referencedColumnName = "\"MPL_FILE_NAME\"", nullable = false)
            })
    private MPLFiles mplFiles;

}
