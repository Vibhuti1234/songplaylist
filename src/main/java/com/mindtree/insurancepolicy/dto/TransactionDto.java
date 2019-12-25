package com.mindtree.insurancepolicy.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.insurancepolicy.entiy.Customer;
import com.mindtree.insurancepolicy.entiy.Policy;

public class TransactionDto {
	private int transactionId;
	private int monthlyTransactionAmount;
	private boolean isActive;
	private Date startingDate;
	@JsonIgnoreProperties("customer")
	private CustomerDto customer;
	private int maturityAmount;

	private Policy policy;

	public TransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDto(int transactionId, int monthlyTransactionAmount, boolean isActive, Date startingDate,
			CustomerDto customer, int maturityAmount, Policy policy) {
		super();
		this.transactionId = transactionId;
		this.monthlyTransactionAmount = monthlyTransactionAmount;
		this.isActive = isActive;
		this.startingDate = startingDate;
		this.customer = customer;
		this.maturityAmount = maturityAmount;
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "TransactionDto [transactionId=" + transactionId + ", monthlyTransactionAmount="
				+ monthlyTransactionAmount + ", isActive=" + isActive + ", startingDate=" + startingDate + ", customer="
				+ customer + ", maturityAmount=" + maturityAmount + ", policy=" + policy + "]";
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getMonthlyTransactionAmount() {
		return monthlyTransactionAmount;
	}

	public void setMonthlyTransactionAmount(int monthlyTransactionAmount) {
		this.monthlyTransactionAmount = monthlyTransactionAmount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public int getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(int maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	

}
