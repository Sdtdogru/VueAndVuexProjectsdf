package com.backendvue.backendvue.features;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturesRepository extends JpaRepository<FeaturesEnttiy,Long> {
}
