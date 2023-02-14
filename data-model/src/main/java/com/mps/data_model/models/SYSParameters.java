package com.mps.data_model.models;

import com.mps.data_model.common.ParameterType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_SYS_PARAMETERS\"", schema = "mps_schema")
public class SYSParameters {

    @Id
    @Column(name = "\"PARAMETER_ID\"", nullable = false)
    @Getter @Setter
    private Long parameterId;

    @Column(name = "\"PARAMETER_NAME\"", nullable = false)
    @Getter @Setter
    private String parameterName;

    @Column(name = "\"PARAMETER_TYPE\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private ParameterType parameterType;

    @Column(name = "\"PARAMETER_VALUE\"", nullable = false)
    @Getter @Setter
    private String parameterValue;

    @Column(name = "\"UNIT_OF_MEASURE\"")
    @Getter @Setter
    private String unitOfMeasure;

    @Column(name = "\"DESCRIPTION\"")
    @Getter @Setter
    private String description;

    @Column(name = "\"PERMANENT\"", nullable = false)
    @Getter @Setter
    private boolean permanent;

}
