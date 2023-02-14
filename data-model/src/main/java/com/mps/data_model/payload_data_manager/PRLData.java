package com.mps.data_model.payload_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "\"T_PRL_DATA\"", schema = "mps_schema")
@IdClass(PRLDataKeys.class)
public class PRLData {

    @Id
    @Column(name = "\"PRL_ID\"", nullable = false)
    @Getter @Setter
    private Long prlId;

    @Id
    @Column(name = "\"PRL_NAME\"", nullable = false)
    @Getter @Setter
    private String prlName;

    @Column(name = "\"PRL_TEXT\"", nullable = false)
    @Getter @Setter
    private String prlText;

    @Column(name = "\"PRL_DESCRIPTION\"")
    @Getter @Setter
    private String prlDescription;

    @ManyToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_PRL_DATA_FILES_fkey\""),
            value = {
                    @JoinColumn(name = "\"PRL_FILE_ID\"", referencedColumnName = "\"PRL_FILE_ID\"", nullable = false),
                    @JoinColumn(name = "\"PRL_FILE_NAME\"", referencedColumnName = "\"PRL_FILE_NAME\"", nullable = false)
            })
    @Getter @Setter
    private PRLFiles prlFiles;

}
