package com.mps.data_model.mission_plan_supervisor;

import com.mps.data_model.common.SystemStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_STATUS\"", schema = "mps_schema")
@IdClass(SYSStatusKey.class)
@Getter @Setter
public class SYSStatus {

    @Id
    @Column(name = "\"SYSTEM_NAME\"", nullable = false)
    private String systemName;

    @Id
    @Column(name = "\"SYSTEM_RELEASE\"", nullable = false)
    private String systemRelease;

    @Column(name = "\"SYSTEM_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private SystemStatus systemStatus;

    @Column(name = "\"START_DATE\"")
    private LocalDateTime startDate;

    @Column(name = "\"STOP_DATE\"")
    private LocalDateTime stopDate;

    @Column(name = "\"DESCRIPTION\"")
    private String description;

}
