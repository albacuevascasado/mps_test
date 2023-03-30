package com.mps.persistency_layer.repositories.prueba;

import com.mps.data_model.models.prueba.Costs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CostsRepository extends JpaRepository<Costs, Long> {

    //@Modifying
    //@Query(value = "INSERT INTO Costs (id, price)" + "VALUES ")

}
