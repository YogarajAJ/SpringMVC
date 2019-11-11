package com.card.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.card.entity.CustomerEntity;

@Controller
public class CardController {

	@RequestMapping("/test")
	public String testPage() {
		return "test";
	}
	
	@RequestMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("customer", new CustomerEntity());
		return "registration";
	}
}
