package com.mps.data_model.models;

import com.mps.data_model.common.PorType;
import com.mps.data_model.payload_data_manager.PRLFiles;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_POR_DATA_HEAD\"", schema = "mps_schema")
public class PORDataHead{

    @EmbeddedId
    @Getter @Setter
    private PORKeys porKeys;

    @Column(name = "\"POR_TYPE\"", nullable = false)
    @Getter @Setter
    private PorType porType;

    @Column(name = "\"POR_FORMAT_VER\"")
    @Getter @Setter
    private String porFormatVer;

    @Column(name = "\"POR_FILE_VER\"")
    @Getter @Setter
    private String porFileVer;

    @OneToOne
    @MapsId
    @Getter @Setter
    private PORFiles porFiles;

}
