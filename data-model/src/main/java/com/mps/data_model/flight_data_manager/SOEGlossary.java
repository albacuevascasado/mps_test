package com.mps.data_model.flight_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "\"T_SOE_GLOSSARY\"", schema = "mps_schema")
@IdClass(SOEGlossaryKey.class)
@Getter @Setter
public class SOEGlossary {

    @Id
    @Column(name = "\"SOE_EVENT_ID\"", nullable = false)
    private BigInteger soeEventId;

    @Id
    @Column(name = "\"SOE_EVENT_NAME\"", nullable = false)
    private String soeEventName;

    @Id
    @Column(name = "\"SOE_EVENT_TYPE\"", nullable = false)
    private String soeEventType;

    @Column(name = "\"SOE_EVENT_PARAMETER\"")
    private Boolean soeEventParameter;
}
