package com.mindtree.customerdebitcardregistrationapplication.service;

import java.util.List;

import com.mindtree.customerdebitcardregistrationapplication.entity.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

  List<Customer> getAllCustomers();

List<Customer> getCustomersByNumberOfCards(int numberOfCards);
  List<Customer> getCustomersSorted();

}
