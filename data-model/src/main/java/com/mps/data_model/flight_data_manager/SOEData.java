package com.mps.data_model.flight_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SOE_DATA\"", schema = "mps_schema")
@IdClass(SOEDataKey.class)
@Getter @Setter
public class SOEData {

    @Id
    @Column(name = "\"SOE_EVENT_ID\"", nullable = false)
    private BigInteger soeEventId;

    @Id
    @Column(name = "\"SOE_EVENT_NAME\"", nullable = false)
    private String soeEventName;

    @Id
    @Column(name = "\"SOE_EVENT_TYPE\"", nullable = false)
    private LocalDateTime soeEventType;

    @Column(name = "\"SOE_EVENT_TIMESTAMP\"", nullable = false)
    private LocalDateTime soeEventEnd;

    @Column(name = "\"SOE_EVENT_PARAMETER\"")
    private Double soeEventParameter;


    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_SOE_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"SOE_FILE_ID\"", referencedColumnName = "\"SOE_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"SOE_FILE_NAME\"", referencedColumnName = "\"SOE_FILE_NAME\"", nullable = false)
            })
    private SOEFiles soeFiles;
}
