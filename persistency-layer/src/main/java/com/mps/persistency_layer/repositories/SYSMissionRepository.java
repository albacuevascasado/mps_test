package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_planner.SYSMission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SYSMissionRepository extends JpaRepository<SYSMission, Long> {
}
