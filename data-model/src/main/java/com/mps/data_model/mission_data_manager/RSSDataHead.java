package com.mps.data_model.mission_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_RSS_DATA_HEAD\"", schema = "mps_schema")
@IdClass(RSSDataHeadKey.class)
public class RSSDataHead {

    @Id
    @Column(name = "\"HEAD_SOURCE\"", nullable = false)
    @Getter @Setter
    private String headSource;

    @Id
    @Column(name = "\"HEAD_CREATION_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime headCreationDate;

    @Id
    @Column(name = "\"MISSION\"", nullable = false)
    @Getter @Setter
    private String mission;

    @OneToOne
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_RSS_DATA_HEAD_FILES_fkey\""),
            value = {
                @JoinColumn(name = "\"RSS_FILE_ID\"", referencedColumnName = "\"RSS_FILE_ID\"", nullable = false),
                @JoinColumn(name = "\"RSS_FILE_NAME\"", referencedColumnName = "\"RSS_FILE_NAME\"", nullable = false)
    })
    @Getter @Setter
    private RSSFiles rssFiles;

}
