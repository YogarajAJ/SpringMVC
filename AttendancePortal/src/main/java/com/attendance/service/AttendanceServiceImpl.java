package com.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.models.CheckIn;
import com.attendance.models.Employee;
import com.attendance.repository.AttendanceRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	private AttendanceRepository repo;
	
	@Override
	public List<Employee> getAllEmployee() throws Exception {
		return repo.getAllEmployee();
	}

	@Override
	public Employee registerEmployee(Employee employee) throws Exception {
		return repo.registerEmployee(employee);
	}

	@Override
	public boolean checkEmployee(Integer id) throws Exception {
		return repo.checkEmployee(id);
	}

	@Override
	public CheckIn saveCheckInData(Integer id) throws Exception {
		return repo.saveCheckInData(id);
	}

	@Override
	public CheckIn saveCheckOutData(Integer id) throws Exception {
		return repo.saveCheckOutData(id);
	}

	@Override
	public List<CheckIn> getAllCheckInData() throws Exception {
		return repo.getAllCheckInData();
	}

//	@Autowired
//	private AttendanceRepository employeeRepo;
//
//	@Autowired
//	private CheckInDataRepository checkInRepo;
//	
//	
//	@Override
//	public List<EmployeeEntity> getAllEmployee() throws Exception {
//		return employeeRepo.findAll();
//	}
//
//	@Override
//	public EmployeeEntity registerEmployee(EmployeeEntity employee) throws Exception {
//		return employeeRepo.save(employee);
//	}
//
//	@Override
//	public boolean checkEmployee(Integer id) throws Exception {
//		return employeeRepo.findById(id).isPresent();	
//		
//	}
//
//	@Override
//	public CheckInDataEntity saveCheckInData(Integer id) throws Exception {
//		return checkInRepo.save( new CheckInDataEntity(id, new Timestamp(System.currentTimeMillis()), null));
//	}
//
//	@Override
//	public CheckInDataEntity saveCheckOutData(Integer id) throws Exception {
//		CheckInDataEntity checkinData = checkInRepo.getOne(id);
//		checkinData.setOut_time(new Timestamp(System.currentTimeMillis()));
//		return checkInRepo.save(checkinData);
//	}
//	
}
