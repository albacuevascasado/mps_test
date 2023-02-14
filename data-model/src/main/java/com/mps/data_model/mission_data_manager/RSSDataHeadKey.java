package com.mps.data_model.mission_data_manager;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class RSSDataHeadKey implements Serializable {

    private String headSource;

    private LocalDateTime headCreationDate;

    private String mission;

    public RSSDataHeadKey(String headSource, LocalDateTime headCreationDate, String mission) {
        this.headSource = headSource;
        this.headCreationDate = headCreationDate;
        this.mission = mission;
    }

    public RSSDataHeadKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RSSDataHeadKey rssDataHeadKey = (RSSDataHeadKey) o;
        return headSource.equals(rssDataHeadKey.headSource) && headCreationDate.equals(rssDataHeadKey.headCreationDate) && mission.equals(rssDataHeadKey.mission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headSource, headCreationDate, mission);
    }
}
