package com.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.attendance.models.Employee;
import com.attendance.models.CheckIn;
import com.attendance.service.AttendanceService;

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

		if (service.checkEmployee(checkin.getId())) {
			model.addAttribute("checkoutModel", new CheckIn());
			service.saveCheckInData(checkin.getId());
			return "Check-out";
		}

		model.addAttribute("employee", new Employee());
		return "Registration";
	}

	@PostMapping("/register")
	public String registerEmployee(Model model, @ModelAttribute("employee") Employee employee) throws Exception {
		// Employee emp = new Employee();
		// emp.setId(employee.getId());
		// emp.setFirst_name(employee.getFirst_name());
		// emp.setLast_name(employee.getLast_name());
		// emp.setEmail_id(employee.getEmail_id());
		Employee response = service.registerEmployee(employee);
		System.out.println("from - reg" + response.getId());
		model.addAttribute("checkinModel", new CheckIn());
		return "Check-in";
	}

	@PostMapping("/details")
	public String homePage(@ModelAttribute("checkoutModel") CheckIn checkIn, Model model) throws Exception {
		CheckIn temp = service.saveCheckOutData(checkIn.getId());
		model.addAttribute("checkinModel", new CheckIn());
		model.addAttribute("data", temp);
		return "Details";
	}

	@RequestMapping("/homePage")
	public String showHome(Model model){
		model.addAttribute("checkinModel", new CheckIn());
		return "Check-in";
	}
	
	@RequestMapping("/allDetails")
	public String allDetails(Model model) throws Exception{
		model.addAttribute("checkinModel", new CheckIn());
		List<CheckIn> checkInList = service.getAllCheckInData();
		model.addAttribute("list",checkInList);
		return "Report";
	}
	
}
