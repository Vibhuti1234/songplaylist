package com.mindtree.insurancepolicy.entiy;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "TRANSACTION")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TRANSACTIONID")
	private int transactionId;
	@Column( name = "TRANSACTIONAMOUNT")
	private int monthlyTransactionAmount;
	@Column( name = "ISACTIVE")
	private boolean isActive;
	@Column( name = "CREATIONDATE")
	private Date startingDate;
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Customer customer;
	private double maturityAmount;
	
	@OneToOne
	private Policy policy;

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transactionId, int monthlyTransactionAmount, boolean isActive, Date startingDate,
			Customer customer, double maturityAmount, Policy policy) {
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
		return "Transaction [transactionId=" + transactionId + ", monthlyTransactionAmount=" + monthlyTransactionAmount
				+ ", isActive=" + isActive + ", startingDate=" + startingDate + ", customer=" + customer
				+ ", maturityAmount=" + maturityAmount + ", policy=" + policy + "]";
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	
	
	

}
