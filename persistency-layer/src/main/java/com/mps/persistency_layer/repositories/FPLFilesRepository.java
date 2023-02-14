package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_planner.FPLFiles;
import com.mps.data_model.mission_planner.FPLFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FPLFilesRepository extends JpaRepository<FPLFiles, FPLFilesKey> {
}
