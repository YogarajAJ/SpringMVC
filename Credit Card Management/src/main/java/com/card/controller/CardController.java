package com.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.card.entity.CardEntity;
import com.card.entity.CustomerEntity;
import com.card.service.CardService;
import com.card.service.CustomerService;

@Controller
public class CardController {

	private Integer customerId, cardId;

	private String first_name, last_name, blockCardStatus;

	public String getBlockCardStatus() {
		return blockCardStatus;
	}

	public void setBlockCardStatus(String blockCardStatus) {
		this.blockCardStatus = blockCardStatus;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CardService cardService;

	@RequestMapping("/test")
	public String testPage() {
		return "test";
	}

	@RequestMapping("/")
	public String loginPage(Model model) {
		model.addAttribute("customer", new CustomerEntity());
		return "login";
	}

	@RequestMapping("/loginProcess")
	public String loginProcessPage(@ModelAttribute("customer") CustomerEntity customer, Model model) {
		// Service Code
		try {
			CustomerEntity tempCustomer = customerService.loginCustomer(customer.getEmail(), customer.getPassword());
			if (tempCustomer != null) {
				model.addAttribute("tempCustomer", tempCustomer);
				setCustomerId(tempCustomer.getCustomer_id());
				setFirst_name(tempCustomer.getFirst_name());
				setLast_name(tempCustomer.getLast_name());
				return "GoToHome";
			} else {
				model.addAttribute("email", customer.getEmail());
				return "Error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("customer", new CustomerEntity());
			return "Error";
		}
	}

	@RequestMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("customer", new CustomerEntity());
		return "registration";
	}

	@RequestMapping("/registerProcess")
	public String registerProcessPage(@ModelAttribute("customer") CustomerEntity customer, Model model) {
		try {
			customerService.registerCustomer(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("customer", new CustomerEntity());
		return "login";
	}

	@RequestMapping("/home")
	public String homePage(Model model) {
		System.out.println(getCustomerId());
		CustomerEntity customer = new CustomerEntity();
		customer.setCustomer_id(getCustomerId());
		model.addAttribute("customer", customer);
		return "home";
	}

	@RequestMapping("/cardDetails")
	public String cardDetailsPage(Model model) {
		try {
			System.out.println(getCustomerId());
			CardEntity card = cardService.viewCustomerCard(getCustomerId());
			if (card != null) {
				model.addAttribute("first_name", first_name);
				model.addAttribute("last_name", last_name);
				model.addAttribute("customer_id", getCustomerId());
				model.addAttribute("card", card);
				System.out.println(card.getCard_id());
				setBlockCardStatus(card.getBlocked_status());
				setCardId(card.getCard_id());
				return "cardDetails";
			} else {
				return "NotFound";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "NotFound";
		}

	}

	@RequestMapping("/transactions")
	public String transactionsPage() {
		return "transactions";
	}

	@RequestMapping("/blockCard")
	public String blockCardPage(Model model) {
		model.addAttribute("status", getBlockCardStatus());		
		return "blockCard";
	}

	@RequestMapping("/blockProcess")
	public String blockCardProcessPage() {
		try {
			System.out.println("------"+getCardId());
			cardService.blockCard(getCardId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "BlockProcess";
	}
}
