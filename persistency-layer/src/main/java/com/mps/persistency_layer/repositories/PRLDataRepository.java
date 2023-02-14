package com.mps.persistency_layer.repositories;

import com.mps.data_model.payload_data_manager.PRLData;
import com.mps.data_model.payload_data_manager.PRLDataKeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PRLDataRepository extends JpaRepository<PRLData, PRLDataKeys> {
}
