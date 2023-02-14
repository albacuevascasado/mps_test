package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_planner.MPLFiles;
import com.mps.data_model.mission_planner.MPLFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MPLFilesRepository extends JpaRepository<MPLFiles, MPLFilesKey> {
}
