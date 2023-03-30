package com.mps.data_model.models;

import com.mps.data_model.common.PORStatus;
import com.mps.data_model.common.PORType;
import io.hypersistence.utils.hibernate.type.interval.PostgreSQLIntervalType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_POR_DATA_HEAD\"", schema = "mps_schema")
@IdClass(PORKeys.class)
@TypeDef(typeClass = PostgreSQLIntervalType.class, defaultForType = Duration.class)
public class PORDataHead{

    @Id
    @Column(name = "\"POR_FILE_ID\"", nullable = false)
    private BigInteger porFileId;

    @Id
    @Column(name = "\"POR_FILE_NAME\"", nullable = false)
    private String porFileName;

    @Column(name = "\"POR_TYPE\"", nullable = false)
    private PORType porType;

    @Column(name = "\"POR_STATUS\"", nullable = false)
    private PORStatus porStatus;

    @Column(name = "\"POR_ERROR_LINE\"")
    private BigInteger porErrorLine;

    @Column(name = "\"POR_ERROR_TEXT\"")
    private String porErrorText;

    @Column(name = "\"POR_FORMAT_VER\"")
    private BigInteger porFormatVer;

    @Column(name = "\"POR_FILE_VER\"")
    private BigInteger porFileVer;

    @Column(name = "\"POR_GEN_TIME\"")
    private LocalDateTime porGenTime;

    @Column(name = "\"POR_VALIDITY_RANGE_TYPE\"", nullable = false)
    private String porValidityRangeType;

    @Column(name = "\"ABS_START_TIME\"")
    private LocalDateTime absStartTime;

    @Column(name = "\"ABS_STOP_TIME\"")
    private LocalDateTime absStopTime;

    @Column(name = "\"REL_START_BASE_EVENT\"")
    private String relStartBaseEvent;

    @Column(name = "\"REL_START_BASE_COUNT\"")
    private BigInteger relStartBaseCount;

    @Column(name = "\"REL_START_DELTA\"")
    private Duration relStartDelta;

    @Column(name = "\"REL_START_PROP_FACTOR\"")
    private BigInteger relStartPropFactor;

    @Column(name = "\"REL_END_BASE_EVENT\"")
    private String relEndBaseEvent;

    @Column(name = "\"REL_END_BASE_COUNT\"")
    private BigInteger relEndBaseCount;

    @Column(name = "\"REL_END_DELTA\"")
    private Duration relEndDelta;

    @Column(name = "\"REL_END_PROP_FACTOR\"")
    private BigInteger relEndPropFactor;

    @OneToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_POR_DATA_HEAD_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"POR_FILE_ID\"", referencedColumnName = "\"POR_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"POR_FILE_NAME\"", referencedColumnName = "\"POR_FILE_NAME\"", nullable = false)
            })
    @MapsId
    private PORFiles porFiles;

}
