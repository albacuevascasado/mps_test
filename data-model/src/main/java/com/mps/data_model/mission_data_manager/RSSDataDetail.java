package com.mps.data_model.mission_data_manager;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_RSS_DATA_DETAIL\"", schema = "mps_schema")
@IdClass(RSSDataDetailKey.class)
@Getter @Setter
public class RSSDataDetail {

    @Id
    @Column(name = "\"RESOURCE_LOCATION\"", nullable = false)
    private String resourceLocation;

    @Id
    @Column(name = "\"RESOURCE_NAME\"", nullable = false)
    private String resourceName;

    @Column(name = "\"RESOURCE_STATUS\"", nullable = false)
    private String resourceStatus;

    @Column(name = "\"DATE_STATUS\"", nullable = false)
    private LocalDateTime dateStatus;

    @ManyToOne (cascade = { CascadeType.PERSIST , CascadeType.REMOVE } , optional = false)
    @JoinColumns(
            foreignKey = @ForeignKey(name = "\"T_RSS_DATA_DETAIL_FILES_fkey\""),
            value = {
            @JoinColumn(name = "\"RSS_FILE_ID\"", referencedColumnName = "\"RSS_FILE_ID\"", nullable = false),
            @JoinColumn(name = "\"RSS_FILE_NAME\"", referencedColumnName = "\"RSS_FILE_NAME\"", nullable = false)
            })
    private RSSFiles rssFiles;

}
