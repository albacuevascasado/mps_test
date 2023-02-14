package com.mps.data_model.mission_data_manager;

import com.mps.data_model.common.InputFileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_RSS_FILES\"", schema = "mps_schema")
@IdClass(RSSFilesKey.class)
public class RSSFiles {

    @Id
    @Column(name = "\"RSS_FILE_ID\"", nullable = false)
    @Getter @Setter
    private Long rssFileId;

    @Id
    @Column(name = "\"RSS_FILE_NAME\"", nullable = false)
    @Getter @Setter
    private String rssFileName;

    @Column(name = "\"RSS_RECEIVE_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime rssReceiveDate;

    @Column(name = "\"RSS_PROCESS_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime rssProcessDate;

    @Column(name = "\"RSS_ARCHIVE_PATH\"", nullable = false)
    @Getter @Setter
    private String rssArchivePath;

    @Column(name = "\"RSS_FILE_STATUS\"", nullable = false)
    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private InputFileStatus rssFileStatus;

    @Column(name = "\"RSS_FILE_ERROR\"")
    @Getter @Setter
    private String rssFileError;

}
