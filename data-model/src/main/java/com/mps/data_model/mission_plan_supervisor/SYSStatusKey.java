package com.mps.data_model.mission_plan_supervisor;

import java.io.Serializable;
import java.util.Objects;

public class SYSStatusKey implements Serializable {

    private String systemName;

    private String systemRelease;

    public SYSStatusKey() {
    }

    public SYSStatusKey(String systemName, String systemRelease) {
        this.systemName = systemName;
        this.systemRelease = systemRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SYSStatusKey sysStatusKey = (SYSStatusKey) o;
        return systemName.equals(sysStatusKey.systemName) && systemRelease.equals(sysStatusKey.systemRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemName, systemRelease);
    }
}
