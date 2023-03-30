package com.mps.data_model.models.prueba;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table (name = "product", schema = "public")
@Getter @Setter
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            schema = "public",
            initialValue = 1,
            allocationSize =1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE ,
            generator = "product_sequence"
    )
    private Long id;

    @Column(name = "nombre_producto", nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Integer quantity;

    /*
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    @OneToOne
    @MapsId(value = "addressId")
    @JoinColumn(  foreignKey = @ForeignKey(name = "address_product"),
                    name="addressId", referencedColumnName = "id" , nullable = false)
    private Address address;

     */

}
