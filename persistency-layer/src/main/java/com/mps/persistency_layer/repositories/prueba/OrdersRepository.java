package com.mps.persistency_layer.repositories.prueba;

import com.mps.data_model.models.prueba.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    @Query(value = "SELECT id FROM Orders o ORDER BY id DESC")
    List<Long> findFirstByOrderByIdDesc();

    /*
    //DESC alphabetically not by id
    @Query(value = "SELECT order_code FROM Orders o ORDER BY order_code DESC")
    List<String> findFirstByOrderByOrderCodeDesc();

    @Query ("SELECT order_code FROM Orders o WHERE o.id= ?1")
    String findOrderCodeById(Long id);
     */
}
