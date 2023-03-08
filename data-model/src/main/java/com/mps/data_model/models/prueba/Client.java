package com.mps.data_model.models.prueba;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clients",
        schema = "public",
        uniqueConstraints = {@UniqueConstraint(name = "client_unique_email", columnNames = "email")})
@SecondaryTable(name = "details" , schema = "public" , pkJoinColumns = @PrimaryKeyJoinColumn(name = "client_id"))
@Getter @Setter
public class Client {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_name", nullable = false)
    private String firstName;

    @Column(name = "client_surname", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(name = "client_phone" , table = "details")
    private Long telephoneNumber;

    @Column(table = "details")
    private Boolean loyaltyCard;

/*
    @OneToOne(cascade = CascadeType.PERSIST )
    @PrimaryKeyJoinColumn (name = "client_id" , referencedColumnName = "id")
    //@JsonManagedReference
    private DetailsClient detailsClient;
 */

    @OneToOne(cascade = { CascadeType.PERSIST , CascadeType.REMOVE })
    @JoinColumn(name = "address_id" , referencedColumnName = "id")
    //@JsonManagedReference
    private Address address;

    @OneToMany(mappedBy = "client")
    @JsonBackReference
    private List<Order> orders;

    /*
    @OneToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST
    })
    @JoinColumn(name = "client_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "product_client"))
    private List<Product> product;
     */

}
