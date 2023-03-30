package com.mps.mission_plan_supervisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.mps"}) //Access ALL packages with prefix com.mps
@EnableJpaRepositories(basePackages = "com.mps.persistency_layer.repositories")
@EntityScan(basePackages = "com.mps.data_model.models")
public class MissionPlanSupervisorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MissionPlanSupervisorApplication.class, args);
    }
}



