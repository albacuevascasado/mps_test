package com.mps.data_model.models.prueba;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "orders", schema = "public")
//@IdClass(OrdersKey.class)
@Getter @Setter
public class Orders {

    @Id
    @SequenceGenerator(
            name = "seq_order",
            sequenceName = "seq_order",
            schema = "public",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_order"
    )
    private Long id;

    //@Id
    //private String order_code;

    private String warehouse;
/*
    @ManyToOne(cascade = { CascadeType.PERSIST , CascadeType.MERGE })
    @JoinColumns(
            foreignKey = @ForeignKey(name = "client_order"),
            value = {
                @JoinColumn(
                        name = "client_id", referencedColumnName = "id", nullable = false
                ),
                @JoinColumn(name = "client_code", referencedColumnName = "clientCode", nullable = false)
            }
    )
    //@JsonManagedReference
    private Client client;

 */


    @ManyToMany(cascade = { CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE })
    @JoinTable (
            schema = "public" ,
            name = "orders_products" ,
            joinColumns = {
                    @JoinColumn( name = "id" , referencedColumnName = "id" , nullable = false)
                    //@JoinColumn( name = "order_code" , referencedColumnName = "order_code" , nullable = false),
            },
            inverseJoinColumns = {@JoinColumn(name = "product_id" , referencedColumnName = "id")}
    )
    //@OrderBy("id DESC")
    private List<Product> products;



}
