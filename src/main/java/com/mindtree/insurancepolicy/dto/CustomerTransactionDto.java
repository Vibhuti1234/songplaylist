package com.mindtree.insurancepolicy.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CustomerTransactionDto {
	private int customerId;
	private String customerName;
	
	private List<TransactionDto> transactionList;
	public CustomerTransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerTransactionDto(int customerId, String customerName, List<TransactionDto> transactionList) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.transactionList = transactionList;
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
	public List<TransactionDto> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<TransactionDto> transactionList) {
		this.transactionList = transactionList;
	}
	@Override
	public String toString() {
		return "CustomerTransactionDto [customerId=" + customerId + ", customerName=" + customerName
				+ ", transactionList=" + transactionList + "]";
	}
	
	
}
