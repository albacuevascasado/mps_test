package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_data_manager.RSSDataDetail;
import com.mps.data_model.mission_data_manager.RSSDataDetailKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSSDataDetailRepository extends JpaRepository<RSSDataDetail, RSSDataDetailKey> {
}
