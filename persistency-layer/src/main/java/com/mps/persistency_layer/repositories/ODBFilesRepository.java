package com.mps.persistency_layer.repositories;

import com.mps.data_model.SCOS_data_manager.ODBFiles;
import com.mps.data_model.SCOS_data_manager.ODBFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ODBFilesRepository extends JpaRepository<ODBFiles, ODBFilesKey> {
}
