package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.CheckInDataEntity;

@Repository
public interface CheckInDataRepository extends JpaRepository<CheckInDataEntity, Integer> {

}
