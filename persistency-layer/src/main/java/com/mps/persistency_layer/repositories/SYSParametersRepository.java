package com.mps.persistency_layer.repositories;

import com.mps.data_model.models.SYSParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SYSParametersRepository extends JpaRepository<SYSParameters, Long> {
}
