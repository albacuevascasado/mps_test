package com.mps.data_model.mission_data_manager;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "\"T_RSS_FILES\"", schema = "mps_schema")
@IdClass(RSSFilesKey.class)
@Getter @Setter
public class RSSFiles {

    @Id
    @Column(name = "\"RSS_FILE_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_RSS_FILE_ID\"",
            sequenceName = "\"S_RSS_FILE_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_RSS_FILE_ID\""
    )
    private BigInteger rssFileId;

    @Id
    @Column(name = "\"RSS_FILE_NAME\"", nullable = false)
    private String rssFileName;

    @Column(name = "\"RSS_RECEIVE_DATE\"", nullable = false)
    private LocalDateTime rssReceiveDate;

    @Column(name = "\"RSS_PROCESS_DATE\"", nullable = false)
    private LocalDateTime rssProcessDate;

    @Column(name = "\"RSS_ARCHIVE_PATH\"", nullable = false)
    private String rssArchivePath;

    @Column(name = "\"RSS_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    private InputFileStatus rssFileStatus;

    @Column(name = "\"RSS_FILE_ERROR\"")
    private String rssFileError;

    /*
    DOES NOT CONNECT THE INFO IN THE TABLES IF YOU SAVE FROM RSSFILES (NOT OWING SIDE)
     */
    @OneToOne(mappedBy = "rssFiles", cascade = CascadeType.PERSIST)
    @JsonBackReference
    private RSSDataHead rssDataHead;

    @OneToMany(mappedBy = "rssFiles", cascade = CascadeType.PERSIST)
    @JsonBackReference
    private List<RSSDataDetail> rssDataDetail;

}
