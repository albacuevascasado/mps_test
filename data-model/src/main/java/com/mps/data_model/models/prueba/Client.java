package com.mps.data_model.models.prueba;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "clients",
        schema = "public",
        uniqueConstraints = {@UniqueConstraint(name = "client_unique_email", columnNames = "email")}
)
@SecondaryTable(name = "details" , schema = "public" ,
                pkJoinColumns = { @PrimaryKeyJoinColumn(name = "client_id" , referencedColumnName = "id"),
                                  @PrimaryKeyJoinColumn(name = "client_code" , referencedColumnName = "clientCode")
})
@IdClass(ClientKey.class)
@Getter @Setter
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @Id
    private String clientCode;

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

    @OneToOne(cascade = { CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE })
    @JoinColumn(
            name = "address_id" ,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "client_address"))
    //@JsonManagedReference
    private Address address;

/*
    @OneToMany(mappedBy = "client")
    @JsonBackReference
    private List<Orders> orders;


    @OneToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST
    })
    @JoinColumn(name = "client_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "product_client"))
    private List<Product> product;

     */

}
