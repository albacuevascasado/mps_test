package com.mps.persistency_layer.repositories;

import com.mps.data_model.mission_data_manager.RSSDataHead;
import com.mps.data_model.mission_data_manager.RSSDataHeadKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSSDataHeadRepository extends JpaRepository<RSSDataHead, RSSDataHeadKey> {
}
