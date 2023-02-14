package com.mps.persistency_layer.repositories;

import com.mps.data_model.payload_data_manager.PCFFiles;
import com.mps.data_model.payload_data_manager.PCFFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCFFilesRepository extends JpaRepository<PCFFiles,PCFFilesKey> {
}
