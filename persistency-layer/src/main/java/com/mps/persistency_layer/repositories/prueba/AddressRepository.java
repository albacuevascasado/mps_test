package com.mps.persistency_layer.repositories.prueba;

import com.mps.data_model.models.prueba.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
