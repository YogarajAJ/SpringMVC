package com.card.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.entity.CardEntity;
import com.card.entity.CustomerEntity;
import com.card.repository.CardRepository;
import com.card.repository.CustomerRepository;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private CardRepository cardRepo;
	
	@Autowired
	private LogicService logics;

	public CustomerEntity registerCustomer(CustomerEntity customer) throws Exception {
		
		CardEntity card = new CardEntity();
		card.setCard_number(
				logics.getRandomCardNumber(1000, 9999)+""+
				logics.getRandomCardNumber(1000, 9999)+""+
				logics.getRandomCardNumber(1000, 9999)+""+
				logics.getRandomCardNumber(1000, 9999)+""
				);
		card.setExp_month(logics.generateRandomMonthAndYear(1, 12));
		card.setExp_year(logics.generateRandomMonthAndYear(22, 26));
		card.setBlocked_status("no");
		card.setCard_type(logics.generateRandomCardType());
		card.setPin(logics.generateRandomMonthAndYear(1000, 9999));
		card.setDate_of_issue(new Date(System.currentTimeMillis()));
		card.setCard_id(logics.generateRandomMonthAndYear(1000, 9999));
		CardEntity newCard = cardRepo.save(card);
		
		
		customer.setCustomer_id(logics.generateRandomMonthAndYear(1000, 9999));
		customer.setCard_id(newCard.getCard_id());
		
		return customerRepo.save(customer);
	}

	@Override
	public CustomerEntity loginCustomer(String email, String password) throws Exception {
		List<CustomerEntity> allCustomers = customerRepo.findAll();
		
		if(allCustomers.size() >  0) {
			
			for(CustomerEntity customer : allCustomers) {
				if(customer.getEmail().equals(email)) {
					if(customer.getPassword().equals(password)) {
						return customer;
					}
				}
			}
		}
		return null;
	}
}