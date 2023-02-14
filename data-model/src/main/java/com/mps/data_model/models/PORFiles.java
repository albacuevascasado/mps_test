package com.mps.data_model.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_POR_FILES\"", schema = "mps_schema")
public class PORFiles {

    @EmbeddedId
    @Getter @Setter
    private PORKeys porKeys;

    @Column(name = "\"POR_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime porReceiveDate;

    @Column(name = "\"POR_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime porProcessDate;

    @Column(name = "\"POR_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String porArchivePath;

}

