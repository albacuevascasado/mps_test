package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_planner.MPLData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MPLDataRepository extends JpaRepository<MPLData, String> {
}
