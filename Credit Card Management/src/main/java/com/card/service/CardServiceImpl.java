package com.card.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.entity.CardEntity;
import com.card.entity.CustomerEntity;
import com.card.repository.CardRepository;
import com.card.repository.CustomerRepository;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private CardRepository cardRepo;
	
	@Override
	public CardEntity viewCustomerCard(Integer customerId) throws Exception {
		CustomerEntity customer = customerRepo.getOne(customerId);
		return cardRepo.getOne(customer.getCard_id());
	}

	@Override
	public boolean blockCard(Integer cardId) throws Exception {
		CardEntity card = cardRepo.getOne(cardId);
		if(card.getBlocked_status().equalsIgnoreCase("no")) {
			card.setBlocked_status("yes");
		}else {
			card.setBlocked_status("no");
		}
		cardRepo.save(card);
		return true;
	}

}
