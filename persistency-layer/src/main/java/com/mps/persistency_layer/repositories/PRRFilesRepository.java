package com.mps.persistency_layer.repositories;

import com.mps.data_model.task_scheduler.PRRFiles;
import com.mps.data_model.task_scheduler.PRRFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PRRFilesRepository extends JpaRepository<PRRFiles, PRRFilesKey> {
}
