package com.mps.data_model.models.prueba;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "costs", schema = "public")
//@IdClass(OrdersKey.class)
@Getter @Setter
public class Costs {

    @Id
    private Long id;

    //@Id
    //private String order_code;

    @Column(nullable = false)
    private Integer price;


    @OneToOne(cascade = { CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE })
    /*@JoinColumns(
            foreignKey = @ForeignKey(name = "CompositePK_orders_costs"),
            value = {
                    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false),
                    //@JoinColumn(name = "order_code", referencedColumnName = "order_code", nullable = false)
            })
    */
    @MapsId
    private Orders orders;


}
