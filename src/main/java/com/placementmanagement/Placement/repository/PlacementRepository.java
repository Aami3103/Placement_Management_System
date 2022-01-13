package com.placementmanagement.Placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placementmanagement.Placement.model.Placement;

@Repository
public interface PlacementRepository extends JpaRepository <Placement, Long>{

	

}