package com.mps.data_model.SCOS_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "\"T_ODB_DATA\"", schema = "mps_schema")
@Getter @Setter
public class ODBData {

    @Id
    @Column(name = "\"ODB_TABLE_NAME\"", nullable = false)
    private String odbTableName;

    @Column(name = "\"ODB_TABLE_SIZE\"")
    private BigInteger odbTableSize;

    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_ODB_DATA_FILES_fkey\""),
            value = {
            @JoinColumn(name = "\"ODB_FILE_ID\"", referencedColumnName = "\"ODB_FILE_ID\"", nullable = false),
            @JoinColumn(name = "\"ODB_FILE_NAME\"", referencedColumnName = "\"ODB_FILE_NAME\"", nullable = false)
            })
    private ODBFiles odbFiles;

}
