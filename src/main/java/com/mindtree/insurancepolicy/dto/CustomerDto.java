package com.mindtree.insurancepolicy.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mindtree.insurancepolicy.entiy.Policy;
import com.mindtree.insurancepolicy.entiy.Transaction;

public class CustomerDto {
	private int customerId;
	private String customerName;
	@JsonIgnoreProperties("customer")
	private List<TransactionDto> transactions;
	
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDto(int customerId, String customerName, List<TransactionDto> transactions
			) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.transactions = transactions;
		
	}
	
	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + ", transactions="
				+ transactions + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<TransactionDto> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionDto> transactions) {
		this.transactions = transactions;
	}
}
	


