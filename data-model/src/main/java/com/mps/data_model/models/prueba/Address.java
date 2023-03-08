package com.mps.data_model.models.prueba;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "address" , schema = "public")
@Getter @Setter
public class Address {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    private Long zipCode;

    @OneToOne(mappedBy = "address", cascade = CascadeType.PERSIST)
    //JoinColumn(name = "client_id" , referencedColumnName = "id")
    @JsonBackReference
    private Client client;

}
