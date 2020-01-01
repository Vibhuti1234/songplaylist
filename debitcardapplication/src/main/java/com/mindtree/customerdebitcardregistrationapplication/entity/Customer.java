package com.mindtree.customerdebitcardregistrationapplication.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer  implements Comparable<Customer>{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	private  String customerName;
	private int customerAge;
	private int numberOfCards;
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId")
	private List<DebitCard> debitCards=new ArrayList<DebitCard>();
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName, int customerAge, int numberOfCards,
			List<DebitCard> debitCards) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.numberOfCards = numberOfCards;
		this.debitCards = debitCards;
	}

	public int getNumberOfCards() {
		return numberOfCards;
	}

	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
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
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public List<DebitCard> getDebitCards() {
		return debitCards;
	}
	public void setDebitCards(List<DebitCard> debitCards) {
		this.debitCards = debitCards;
	}

	@Override
	public int compareTo(Customer e) {
		// TODO Auto-generated method stub
		return this.numberOfCards-e.numberOfCards;
	}
	

}
