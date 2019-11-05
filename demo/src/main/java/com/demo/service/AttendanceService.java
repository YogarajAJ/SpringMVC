package com.demo.service;

import java.util.List;

import com.demo.entity.CheckInDataEntity;
import com.demo.entity.EmployeeEntity;

public interface AttendanceService {

	public List<EmployeeEntity> getAllEmployee() throws Exception;
	
	public EmployeeEntity registerEmployee(EmployeeEntity employee) throws Exception ;
	
	public boolean checkEmployee(Integer id) throws Exception ;
	
	public CheckInDataEntity saveCheckInData(Integer id) throws Exception;
	
	public CheckInDataEntity saveCheckOutData(Integer id) throws Exception;
}
