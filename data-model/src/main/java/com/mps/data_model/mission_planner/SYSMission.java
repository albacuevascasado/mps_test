package com.mps.data_model.mission_planner;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_MISSION\"", schema = "mps_schema")
public class SYSMission {

    @Id
    @Column(name = "\"MISSION_ID\"", nullable = false)
    @Getter @Setter
    private Long missionId;

    @Column(name = "\"MISSION_OPERATION_START\"", nullable = false)
    @Getter @Setter
    private LocalDateTime missionOperationStart;

    @Column(name = "\"MISSION_OPERATION_END\"", nullable = false)
    @Getter @Setter
    private LocalDateTime missionOperationEnd;

    @Column(name = "\"PLANNING_START\"", nullable = false)
    @Getter @Setter
    private LocalDateTime planningStart;

    @Column(name = "\"PLANNING_END\"", nullable = false)
    @Getter @Setter
    private LocalDateTime planningEnd;

    @Column(name = "\"PLANNING_STATUS\"", nullable = false)
    @Getter @Setter
    private String planningStatus;

}
