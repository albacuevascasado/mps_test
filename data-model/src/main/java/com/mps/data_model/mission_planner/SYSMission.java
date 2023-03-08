package com.mps.data_model.mission_planner;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_MISSION\"", schema = "mps_schema")
@Getter @Setter
public class SYSMission {

    @Id
    @Column(name = "\"MISSION_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_MISSION_ID\"",
            sequenceName = "\"S_MISSION_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_MISSION_ID\""
    )
    private BigInteger missionId;

    @Column(name = "\"MISSION_OPERATION_START\"", nullable = false)
    private LocalDateTime missionOperationStart;

    @Column(name = "\"MISSION_OPERATION_END\"", nullable = false)
    private LocalDateTime missionOperationEnd;

    @Column(name = "\"MISSION_PLANNING_START\"", nullable = false)
    private LocalDateTime planningStart;

    @Column(name = "\"MISSION_PLANNING_END\"", nullable = false)
    private LocalDateTime planningEnd;

}
