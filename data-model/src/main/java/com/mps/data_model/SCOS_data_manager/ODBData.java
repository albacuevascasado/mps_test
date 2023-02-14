package com.mps.data_model.SCOS_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_ODB_DATA\"", schema = "mps_schema")
public class ODBData {

    @Id
    @Column(name = "\"ODB_TABLE_NAME\"", nullable = false)
    @Getter @Setter
    private String odbTableName;

    @Column(name = "\"ODB_TABLE_SIZE\"")
    @Getter @Setter
    private Long odbTableSize;

    @ManyToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_ODB_DATA_FILES_fkey\""),
            value = {
            @JoinColumn(name = "\"ODB_FILE_ID\"", referencedColumnName = "\"ODB_FILE_ID\"", nullable = false),
            @JoinColumn(name = "\"ODB_FILE_NAME\"", referencedColumnName = "\"ODB_FILE_NAME\"", nullable = false)
            })
    @Getter @Setter
    private ODBFiles odbFiles;

}
