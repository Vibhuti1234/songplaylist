package com.mindtree.customerdebitcardregistrationapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class DebitCard {
	@Id
	private long cardNumber;
	private String expiryDate;
	private String cardType;
	private double amount;
	
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DebitCard(long cardNumber, String expiryDate, String cardType, double amount) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cardType = cardType;
		this.amount = amount;
	}

	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
