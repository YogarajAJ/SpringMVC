package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.EmployeeEntity;
import com.demo.models.CheckIn;
import com.demo.models.Employee;
import com.demo.service.AttendanceService;

@Controller
public class AttendanceController {

	@Autowired
	private AttendanceService service;
	
	@RequestMapping("/")
	public String checkInPage(Model model) {
		CheckIn checkin = new CheckIn();
		model.addAttribute("checkinModel", checkin);
		System.out.println("from in " + checkin.getId());
		return "Check-in";
	}
	

	@PostMapping("/checkout")
	public String checkoutPage(@ModelAttribute("checkinModel") CheckIn checkin, Model model) throws Exception {

		if (service.checkEmployee(checkin.getId())){
			model.addAttribute("checkoutModel", new CheckIn());
			service.saveCheckInData(checkin.getId());
			return "Check-out";
		}

		model.addAttribute("employee", new Employee() );
		return "Registration";
	}
	
	
	@PostMapping("/register")
	public String registerEmployee(
			Model model,
			@ModelAttribute("employee")Employee employee) throws Exception {
		EmployeeEntity emp = new EmployeeEntity();
		emp.setId(employee.getId());
		emp.setFirst_name(employee.getFirst_name());
		emp.setLast_name(employee.getLast_name());
		emp.setEmail_id(employee.getEmail_id());
		EmployeeEntity response = service.registerEmployee(emp);
		System.out.println("from - reg"+response.getId());
		model.addAttribute("checkinModel", new CheckIn());
		return "Check-in";
	}

	@PostMapping("/gotoHome")
	public String homePage(@ModelAttribute("checkinModel")CheckIn checkIn, Model model) throws Exception {
		service.saveCheckOutData(checkIn.getId());
		model.addAttribute("checkinModel", new CheckIn());
		return "Check-in";
	}
}
