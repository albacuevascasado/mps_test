package com.mps.persistency_layer.repositories;

import com.mps.data_model.flight_data_manager.SOEFiles;
import com.mps.data_model.flight_data_manager.SOEFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SOEFilesRepository extends JpaRepository<SOEFiles, SOEFilesKey> {
}
