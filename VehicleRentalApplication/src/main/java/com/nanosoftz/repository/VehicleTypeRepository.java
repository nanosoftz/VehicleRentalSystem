package com.nanosoftz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanosoftz.entity.VehicleTypes;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleTypes, Long>{

}
