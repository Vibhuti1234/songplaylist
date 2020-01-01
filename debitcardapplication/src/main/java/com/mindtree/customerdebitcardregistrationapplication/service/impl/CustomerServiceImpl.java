package com.mindtree.customerdebitcardregistrationapplication.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.customerdebitcardregistrationapplication.entity.Customer;
import com.mindtree.customerdebitcardregistrationapplication.repository.CustomerRepository;
import com.mindtree.customerdebitcardregistrationapplication.repository.DebitCardRepository;
import com.mindtree.customerdebitcardregistrationapplication.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	DebitCardRepository debitCardRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	@Override
	public List<Customer> getCustomersByNumberOfCards(int numberOfCards) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Customer> getCustomersSorted() {
		// TODO Auto-generated method stub
		List<Customer> customers=customerRepository.findAll();
		Collections.sort(customers,Collections.reverseOrder());
		return customers;
	}
	

}
