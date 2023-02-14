package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_plan_supervisor.SYSStatus;
import com.mps.data_model.mission_plan_supervisor.SYSStatusKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SYSStatusRepository extends JpaRepository<SYSStatus, SYSStatusKey> {
}
