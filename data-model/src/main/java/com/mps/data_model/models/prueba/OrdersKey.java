package com.mps.data_model.models.prueba;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;


public class OrdersKey implements Serializable {

    private Long id;

    private String order_code;

    public OrdersKey(Long id, String order_code) {
        this.id = id;
        this.order_code = order_code;
    }

    public OrdersKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersKey ordersKey = (OrdersKey) o;
        return id.equals(ordersKey.id) && order_code.equals(ordersKey.order_code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order_code);
    }
}
