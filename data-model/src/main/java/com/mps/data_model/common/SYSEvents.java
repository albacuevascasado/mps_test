package com.mps.data_model.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"T_SYS_EVENTS\"", schema = "mps_schema")
@IdClass(SYSEventsKey.class)
public class SYSEvents {

    @Id
    @Column(name = "\"EVENT_ID\"", nullable = false)
    @Getter @Setter
    private String eventId;

    @Id
    @Column(name = "\"EVENT_NAME\"", nullable = false)
    @Getter @Setter
    private String eventName;

    @Column(name = "\"EVENT_TYPE\"", nullable = false)
    @Getter @Setter
    private EventType eventType;

    @Column(name = "\"EVENT_GRAVITY\"", nullable = false)
    @Getter @Setter
    private EventGravity eventGravity;

    @Column(name = "\"EVENT_DATE\"", nullable = false)
    @Getter @Setter
    private LocalDateTime eventDate;

    @Column(name = "\"EVENT_DESCRIPTION\"", nullable = false)
    @Getter @Setter
    private String eventDescription;

}
