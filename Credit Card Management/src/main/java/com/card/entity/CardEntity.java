package com.card.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class CardEntity {

	@Id
	private Integer card_id;
	private String card_number;
	private Integer exp_year;
	private Integer exp_month;
	private Integer pin;
	private String card_type;
	private Date date_of_issue;
	private String blocked_status;

	public Integer getCard_id() {
		return card_id;
	}

	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public Integer getExp_year() {
		return exp_year;
	}

	public void setExp_year(Integer exp_year) {
		this.exp_year = exp_year;
	}

	public Integer getExp_month() {
		return exp_month;
	}

	public void setExp_month(Integer exp_month) {
		this.exp_month = exp_month;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public Date getDate_of_issue() {
		return date_of_issue;
	}

	public void setDate_of_issue(Date date_of_issue) {
		this.date_of_issue = date_of_issue;
	}

	public String getBlocked_status() {
		return blocked_status;
	}

	public void setBlocked_status(String blocked_status) {
		this.blocked_status = blocked_status;
	}

}
