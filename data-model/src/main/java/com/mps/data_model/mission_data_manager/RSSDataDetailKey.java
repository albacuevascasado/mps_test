package com.mps.data_model.mission_data_manager;

import java.io.Serializable;
import java.util.Objects;

public class RSSDataDetailKey implements Serializable {

    private String resourceLocation;

    private String resourceName;

    public RSSDataDetailKey(String resourceLocation, String resourceName) {
        this.resourceLocation = resourceLocation;
        this.resourceName = resourceName;
    }

    public RSSDataDetailKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RSSDataDetailKey rssDataDetailKey = (RSSDataDetailKey) o;
        return resourceLocation.equals(rssDataDetailKey.resourceLocation) && resourceName.equals(rssDataDetailKey.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceLocation, resourceName);
    }
}
