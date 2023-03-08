package com.mps.data_model.payload_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "\"T_PRL_DATA\"", schema = "mps_schema")
@IdClass(PRLDataKeys.class)
@Getter @Setter
public class PRLData {

    @Id
    @Column(name = "\"PRL_ID\"", nullable = false)
    private BigInteger prlId;

    @Id
    @Column(name = "\"PRL_NAME\"", nullable = false)
    private String prlName;

    @Column(name = "\"PRL_TEXT\"", nullable = false)
    private String prlText;

    @Column(name = "\"PRL_DESCRIPTION\"")
    private String prlDescription;

    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false )
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_PRL_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"PRL_FILE_ID\"", referencedColumnName = "\"PRL_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"PRL_FILE_NAME\"", referencedColumnName = "\"PRL_FILE_NAME\"", nullable = false)
            })
    private PRLFiles prlFiles;

}
