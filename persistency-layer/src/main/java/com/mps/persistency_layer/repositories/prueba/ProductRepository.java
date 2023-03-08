package com.mps.persistency_layer.repositories.prueba;

import com.mps.data_model.models.prueba.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    //@Query("SELECT p FROM Product p WHERE p.email = ?1")
    //Optional<Product> findProductByEmail(String email);

    @Query("SELECT p FROM Product p WHERE p.name = ?1")
    Product findProductByName(String name);

    //@Query("SELECT p FROM Product p WHERE p.client_id = ?1 ")
    //List<Product> findProductsByClient(Long foreign_key);

}