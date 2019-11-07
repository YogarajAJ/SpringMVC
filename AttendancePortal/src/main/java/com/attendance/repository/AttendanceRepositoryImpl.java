package com.attendance.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.attendance.models.CheckIn;
import com.attendance.models.Employee;

@Repository
public class AttendanceRepositoryImpl implements AttendanceRepository {

	public List<Employee> employeeList;
	public List<CheckIn> checkinData;

	public AttendanceRepositoryImpl() {
		this.employeeList = new ArrayList<Employee>();
		this.checkinData = new ArrayList<CheckIn>();

		this.employeeList.add(new Employee(1001, "Preethi", "Sridhar", "preethipintu@gmail.com"));
		this.employeeList.add(new Employee(1002, "main", "sample", "sample@gmail.com"));

	}

	@Override
	public List<Employee> getAllEmployee() throws Exception {
		return this.employeeList;
	}

	@Override
	public Employee registerEmployee(Employee employee) throws Exception {
		this.employeeList.add(employee);
		return employee;
	}

	@Override
	public boolean checkEmployee(Integer id) throws Exception {
		boolean flag = false;
		System.out.println(this.employeeList);
		System.out.println(id+"From Check");
		for (Employee e : this.employeeList) {
			System.out.println(id+"From Check");
			if (e.getId().equals(id)) {
				System.out.println(id+"From Check"+flag);
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public CheckIn saveCheckInData(Integer id) throws Exception {
		CheckIn temp = new CheckIn(id, new Timestamp(System.currentTimeMillis()), null);
		this.checkinData.add(temp);
		return temp;
	}

	@Override
	public CheckIn saveCheckOutData(Integer id) throws Exception {
		int index = 0;
		for (CheckIn e : this.checkinData) {
			if (e.getId().equals(id)){
				break;
			}
			index++;
		}
		this.checkinData.get(index).setOut_time(new Timestamp(System.currentTimeMillis()));
		return this.checkinData.get(index);
	}

	@Override
	public List<CheckIn> getAllCheckInData() throws Exception {
		return this.checkinData;
	}
}
