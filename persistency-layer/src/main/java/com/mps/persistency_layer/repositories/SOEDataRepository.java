package com.mps.persistency_layer.repositories;

import com.mps.data_model.flight_data_manager.SOEData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface SOEDataRepository extends JpaRepository<SOEData, LocalDateTime> {
}
