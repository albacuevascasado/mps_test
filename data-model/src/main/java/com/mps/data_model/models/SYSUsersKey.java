package com.mps.data_model.models;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class SYSUsersKey implements Serializable {

    private BigInteger userId;

    private String userName;

    public SYSUsersKey() {
    }

    public SYSUsersKey(BigInteger userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SYSUsersKey sysUsersKey = (SYSUsersKey) o;
        return userId.equals(sysUsersKey.userId) && userName.equals(sysUsersKey.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName);
    }
}
