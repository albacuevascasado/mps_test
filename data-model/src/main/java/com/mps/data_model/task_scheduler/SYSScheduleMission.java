package com.mps.data_model.task_scheduler;

import com.mps.data_model.common.ScheduleType;
import com.mps.data_model.mission_planner.SYSMission;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_SCHEDULE_MISSION\"", schema = "mps_schema")
public class SYSScheduleMission {

    @Id
    @Column(name = "\"SCHEDULE_ID\"", nullable = false)
    @Getter @Setter
    private Long scheduleId;

    @Column(name = "\"SCHEDULE_TYPE\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private ScheduleType scheduleType;

    @Column(name = "\"SCHEDULE_START_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime scheduleStartDate;

    @Column(name = "\"SCHEDULE_END_DATE\"")
    @Getter @Setter
    private LocalDateTime scheduleEndDate;

    @Column(name = "\"SCHEDULE_ELAPSED\"")
    @Getter @Setter
    private BigInteger scheduleElapsed;

    @ManyToOne
    @JoinColumn(
            foreignKey =  @ForeignKey(name = "\"T_SYS_SCHEDULE_MISSION_MISSION_ID_fkey\""),
            name = "\"MISSION_ID\"", referencedColumnName = "\"MISSION_ID\"", nullable = false
            )
    @Getter @Setter
    private SYSMission sysMission;
}
