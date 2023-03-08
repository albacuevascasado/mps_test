package com.mps.data_model.models;

import com.mps.data_model.common.ParameterOwner;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class SYSParametersKey implements Serializable {

    private BigInteger parameterId;

    private String parameterName;

    private ParameterOwner parameterOwner;

    public SYSParametersKey() {
    }

    public SYSParametersKey(BigInteger parameterId, String parameterName, ParameterOwner parameterOwner) {
        this.parameterId = parameterId;
        this.parameterName = parameterName;
        this.parameterOwner = parameterOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SYSParametersKey sysParametersKey = (SYSParametersKey) o;
        return parameterId.equals(sysParametersKey.parameterId) && parameterName.equals(sysParametersKey.parameterName) && parameterOwner == sysParametersKey.parameterOwner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterId, parameterName, parameterOwner);
    }
}
