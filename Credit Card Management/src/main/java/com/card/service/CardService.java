package com.card.service;

import com.card.entity.CardEntity;

public interface CardService {

	public CardEntity viewCustomerCard(Integer customerId) throws Exception;
	
	public boolean blockCard(Integer cardId) throws Exception;
}
