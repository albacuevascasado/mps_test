package com.mps.data_model.models.prueba;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


public class ClientKey implements Serializable {

    private Long id;

    private String clientCode;

    public ClientKey() {
    }

    public ClientKey(Long id, String clientCode) {
        this.id = id;
        this.clientCode = clientCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientKey clientKey = (ClientKey) o;
        return id.equals(clientKey.id) && clientCode.equals(clientKey.clientCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientCode);
    }
}
