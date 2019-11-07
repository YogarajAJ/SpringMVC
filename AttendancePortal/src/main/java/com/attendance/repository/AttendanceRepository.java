package com.attendance.repository;

import java.util.List;

import com.attendance.models.CheckIn;
import com.attendance.models.Employee;

public interface AttendanceRepository {

public List<Employee> getAllEmployee() throws Exception;
	
	public Employee registerEmployee(Employee employee) throws Exception ;
	
	public boolean checkEmployee(Integer id) throws Exception ;
	
	public CheckIn saveCheckInData(Integer id) throws Exception;
	
	public CheckIn saveCheckOutData(Integer id) throws Exception;
	
	public List<CheckIn> getAllCheckInData() throws Exception;
}
