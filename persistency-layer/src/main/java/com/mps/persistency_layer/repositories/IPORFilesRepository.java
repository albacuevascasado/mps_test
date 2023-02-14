package com.mps.persistency_layer.repositories;

import com.mps.data_model.payload_request_analyzer.IPORFiles;
import com.mps.data_model.common.ZIPFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPORFilesRepository extends JpaRepository<IPORFiles, ZIPFilesKey> {
}
