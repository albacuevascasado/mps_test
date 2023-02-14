package com.mps.persistency_layer.repositories;

import com.mps.data_model.models.prueba.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("SELECT p FROM Product p WHERE p.email = ?1")
    Optional<Product> findProductByEmail(String email);


}