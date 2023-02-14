package com.mps.persistency_layer.repositories;

import com.mps.data_model.payload_data_manager.PRLFiles;
import com.mps.data_model.payload_data_manager.PRLFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PRLFilesRepository extends JpaRepository<PRLFiles, PRLFilesKey> {
}
