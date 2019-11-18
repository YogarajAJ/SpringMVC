package com.card.service;

import com.card.entity.CustomerEntity;

public interface CustomerService {

	public CustomerEntity registerCustomer(CustomerEntity customer) throws Exception;
	
	public CustomerEntity loginCustomer(String email, String password) throws Exception;
	
}
