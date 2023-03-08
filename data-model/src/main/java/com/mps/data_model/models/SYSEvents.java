package com.mps.data_model.models;

import com.mps.data_model.common.EventGravity;
import com.mps.data_model.common.EventType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_EVENTS\"", schema = "mps_schema")
@IdClass(SYSEventsKey.class)
@Getter @Setter
public class SYSEvents {

    @Id
    @Column(name = "\"EVENT_ID\"", nullable = false)
    @SequenceGenerator(
            name = "\"S_EVENT_ID\"",
            sequenceName = "\"S_EVENT_ID\"",
            schema = "mps_schema",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "\"S_EVENT_ID\""
    )
    private String eventId;

    @Id
    @Column(name = "\"EVENT_NAME\"", nullable = false)
    private String eventName;

    @Column(name = "\"EVENT_TYPE\"", nullable = false)
    private EventType eventType;

    @Column(name = "\"EVENT_GRAVITY\"", nullable = false)
    private EventGravity eventGravity;

    @Column(name = "\"EVENT_DATE\"", nullable = false)
    private LocalDateTime eventDate;

    @Column(name = "\"EVENT_DESCRIPTION\"", nullable = false)
    private String eventDescription;

}
