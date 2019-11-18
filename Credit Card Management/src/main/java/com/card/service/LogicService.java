package com.card.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class LogicService {

	public String getRandomCardNumber(double min, double max) {
		return (""+((int) (Math.random() * ((max - min) + 1)) + min)).replace(".", "").replace("0", "");
		
	}

	public int generateRandomMonthAndYear(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public String generateRandomCardType() {
		int type = generateRandomMonthAndYear(1, 4);
		if(type == 1)
			return "Rupay";
		if(type == 2)
			return "Visa";
		if(type == 3)
			return "MasterCard";
		else
			return "Amex";
	}
}
