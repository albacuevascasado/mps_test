package com.mps.data_model.task_scheduler;

import com.mps.data_model.common.ScheduleType;
import com.mps.data_model.common.SchedulingStatus;
import com.mps.data_model.mission_planner.SYSMission;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_SCHEDULING\"", schema = "mps_schema")
@Getter @Setter
public class SYSScheduling {

    @Id
    @Column(name = "\"SCHEDULE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_SCHEDULING_ID\"",
            sequenceName = "\"S_SCHEDULING_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_SCHEDULING_ID\""
    )
    private BigInteger scheduleId;

    @Column(name = "\"SCHEDULE_TYPE\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private ScheduleType scheduleType;

    @Column(name = "\"T_SYS_SCHEDULING\"", nullable = false)
    private SchedulingStatus schedulingStatus;

    @Column(name = "\"SCHEDULE_START_DATE\"", nullable = false)
    private LocalDateTime scheduleStartDate;

    @Column(name = "\"SCHEDULE_END_DATE\"")
    private LocalDateTime scheduleEndDate;

    @Column(name = "\"SCHEDULE_ELAPSED\"")
    private BigInteger scheduleElapsed;

    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumn(
            foreignKey =  @ForeignKey(name = "\"T_SYS_SCHEDULE_MISSION_MISSION_ID_fkey\""),
            name = "\"MISSION_ID\"", referencedColumnName = "\"MISSION_ID\"", nullable = false
            )
    private SYSMission sysMission;
}
