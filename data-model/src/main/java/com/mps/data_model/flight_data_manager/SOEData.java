package com.mps.data_model.flight_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SOE_DATA\"", schema = "mps_schema")
public class SOEData {

    @Id
    @Column(name = "\"SOE_EVENT_START\"", nullable = false)
    @Getter @Setter
    private LocalDateTime soeEventStart;

    @Column(name = "\"SOE_EVENT_END\"")
    @Getter @Setter
    private LocalDateTime soeEventEnd;

    @Column(name = "\"SOE_EVENT_ELAPSED\"")
    @Getter @Setter
    private BigInteger soeEventElapsed;

    @Column(name = "\"SOE_EVENT_DESCRIPTION\"")
    @Getter @Setter
    private String soeEventDescription;

    @ManyToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_SOE_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"SOE_FILE_ID\"", referencedColumnName = "\"SOE_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"SOE_FILE_NAME\"", referencedColumnName = "\"SOE_FILE_NAME\"", nullable = false)
            })
    @Getter @Setter
    private SOEFiles soeFiles;
}
