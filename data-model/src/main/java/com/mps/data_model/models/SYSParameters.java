package com.mps.data_model.models;

import com.mps.data_model.common.ParameterOwner;
import com.mps.data_model.common.ParameterType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "\"T_SYS_PARAMETERS\"", schema = "mps_schema")
@IdClass(SYSParametersKey.class)
@Getter @Setter
public class SYSParameters {

    @Id
    @Column(name = "\"PARAMETER_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_PARAMETER_ID\"",
            sequenceName = "\"S_PARAMETER_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_PARAMETER_ID\""
    )
    private BigInteger parameterId;

    @Id
    @Column(name = "\"PARAMETER_NAME\"", nullable = false)
    private String parameterName;

    @Id
    @Column(name = "\"PARAMETER_OWNER\"", nullable = false)
    private ParameterOwner parameterOwner;

    @Column(name = "\"PARAMETER_TYPE\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private ParameterType parameterType;

    @Column(name = "\"PARAMETER_VALUE\"", nullable = false)
    private String parameterValue;

    @Column(name = "\"UNIT_OF_MEASURE\"")
    private String unitOfMeasure;

    @Column(name = "\"DESCRIPTION\"")
    private String description;

    @Column(name = "\"PERMANENT\"", nullable = false)
    private boolean permanent;

}
