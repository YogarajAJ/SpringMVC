package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.demo.service.AttendanceService;
import com.demo.entity.EmployeeEntity;

@RestController
@RequestMapping("/api")
public class AttendanceRestController {
	
	@Autowired
	private AttendanceService service;
	
	@GetMapping("/allEmployee")
	public List<EmployeeEntity> getAllEmployee() throws Exception {
		return service.getAllEmployee();
	}
}
