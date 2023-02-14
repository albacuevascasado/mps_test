package com.mps.data_model.mission_plan_supervisor;

import com.mps.data_model.common.SystemStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_STATUS\"", schema = "mps_schema")
@IdClass(SYSStatusKey.class)
public class SYSStatus {

    @Id
    @Column(name = "\"SYSTEM_NAME\"", nullable = false)
    @Getter @Setter
    private String systemName;

    @Id
    @Column(name = "\"SYSTEM_RELEASE\"", nullable = false)
    @Getter @Setter
    private String systemRelease;

    @Column(name = "\"SYSTEM_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private SystemStatus systemStatus;

    @Column(name = "\"START_DATE\"")
    @Getter @Setter
    private LocalDateTime startDate;

    @Column(name = "\"STOP_DATE\"")
    @Getter @Setter
    private LocalDateTime stopDate;

    @Column(name = "\"DESCRIPTION\"")
    @Getter @Setter
    private String description;

}
