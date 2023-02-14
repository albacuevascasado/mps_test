package com.mps.data_model.mission_data_manager;

import java.io.Serializable;
import java.util.Objects;

public class RSSFilesKey implements Serializable {

    private Long rssFileId;

    private String rssFileName;

    public RSSFilesKey(Long rssFileId, String rssFileName) {
        this.rssFileId = rssFileId;
        this.rssFileName = rssFileName;
    }

    public RSSFilesKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RSSFilesKey rssFilesKey = (RSSFilesKey) o;
        return rssFileId.equals(rssFilesKey.rssFileId) && rssFileName.equals(rssFilesKey.rssFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rssFileId, rssFileName);
    }
}
