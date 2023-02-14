package com.mps.persistency_layer.repositories;

import com.mps.data_model.SCOS_data_manager.ODBData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ODBDataRepository extends JpaRepository<ODBData, String> {
}
