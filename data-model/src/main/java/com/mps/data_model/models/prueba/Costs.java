package com.mps.data_model.models.prueba;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "costs", schema = "public")
@Getter @Setter
public class Costs {

    @Id
    private Long id;

    private Integer price;

    @OneToOne
    @MapsId
    private Order order;

}
