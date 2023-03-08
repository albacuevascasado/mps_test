package com.mps.data_model.models.prueba;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order", schema = "public")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String warehouse;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "client_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "client_order") )
    //@JsonManagedReference
    private Client client;

    @ManyToMany(cascade = { CascadeType.PERSIST , CascadeType.REMOVE })
    //@OrderBy("id DESC")
    private List<Product> products;


}
