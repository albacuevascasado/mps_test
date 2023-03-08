package com.mps.persistency_layer.repositories.prueba;

import com.mps.data_model.models.prueba.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
