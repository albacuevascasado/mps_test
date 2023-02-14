package com.mps.data_model.models.prueba;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "product",
        schema = "public",
        uniqueConstraints = {@UniqueConstraint(name = "product_unique_email", columnNames = "email")})
public class Product {

    @Id
//    @SequenceGenerator(
//            name = "product_sequence",
//            sequenceName = "product_sequence",
//            allocationSize = 1
//    )
    @GeneratedValue (
            strategy = GenerationType.AUTO
            //generator = "product_sequence"
    )
    @Getter @Setter
    private Long id;

    @Column(name = "nombre_producto", nullable = false)
    @Getter @Setter
    private String name;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private  String email;

}
