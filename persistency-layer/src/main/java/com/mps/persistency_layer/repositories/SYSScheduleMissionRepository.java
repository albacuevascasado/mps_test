package com.mps.persistency_layer.repositories;

import com.mps.data_model.task_scheduler.SYSScheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SYSScheduleMissionRepository extends JpaRepository<SYSScheduling, Long> {
}
