package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.EmployeeEntity;

@Repository
public interface AttendanceRepository extends JpaRepository<EmployeeEntity, Integer>{

}
