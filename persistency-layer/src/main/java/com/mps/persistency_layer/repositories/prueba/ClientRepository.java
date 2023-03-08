package com.mps.persistency_layer.repositories.prueba;

import com.mps.data_model.models.prueba.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT c FROM Client c WHERE c.firstName = ?1")
    Client findClientByName(String firstName);

    @Query("SELECT telephoneNumber, loyaltyCard FROM Client c WHERE c.firstName = ?1")
    Object findClientDetailsByName(String firstName ) ;

    @Query("SELECT c FROM Client c WHERE c.email = ?1")
    Optional<Client> findClientByEmail(String email);


}
