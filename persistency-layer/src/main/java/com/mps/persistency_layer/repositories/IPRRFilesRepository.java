package com.mps.persistency_layer.repositories;

import com.mps.data_model.task_scheduler.IPRRFiles;
import com.mps.data_model.common.ZIPFilesKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPRRFilesRepository extends JpaRepository<IPRRFiles, ZIPFilesKey> {
}
