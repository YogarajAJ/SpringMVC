package com.demo.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.CheckInDataEntity;
import com.demo.entity.EmployeeEntity;
import com.demo.repository.AttendanceRepository;
import com.demo.repository.CheckInDataRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	private AttendanceRepository employeeRepo;

	@Autowired
	private CheckInDataRepository checkInRepo;
	
	
	@Override
	public List<EmployeeEntity> getAllEmployee() throws Exception {
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeEntity registerEmployee(EmployeeEntity employee) throws Exception {
		return employeeRepo.save(employee);
	}

	@Override
	public boolean checkEmployee(Integer id) throws Exception {
		return employeeRepo.findById(id).isPresent();	
		
	}

	@Override
	public CheckInDataEntity saveCheckInData(Integer id) throws Exception {
		return checkInRepo.save( new CheckInDataEntity(id, new Timestamp(System.currentTimeMillis()), null));
	}

	@Override
	public CheckInDataEntity saveCheckOutData(Integer id) throws Exception {
		CheckInDataEntity checkinData = checkInRepo.getOne(id);
		checkinData.setOut_time(new Timestamp(System.currentTimeMillis()));
		return checkInRepo.save(checkinData);
	}
	
}
