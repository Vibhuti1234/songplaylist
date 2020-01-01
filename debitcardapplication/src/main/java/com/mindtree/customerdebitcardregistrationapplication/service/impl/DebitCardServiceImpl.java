package com.mindtree.customerdebitcardregistrationapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.customerdebitcardregistrationapplication.entity.Customer;
import com.mindtree.customerdebitcardregistrationapplication.entity.DebitCard;
import com.mindtree.customerdebitcardregistrationapplication.exception.CustomerDebitCardApplicationException;
import com.mindtree.customerdebitcardregistrationapplication.exception.NoCustomerFoundException;
import com.mindtree.customerdebitcardregistrationapplication.repository.CustomerRepository;
import com.mindtree.customerdebitcardregistrationapplication.repository.DebitCardRepository;
import com.mindtree.customerdebitcardregistrationapplication.service.DebitCardService;
@Service
public class DebitCardServiceImpl implements DebitCardService{
@Autowired
DebitCardRepository debitCardRepository;
@Autowired
CustomerRepository customerRepository;
@Override
public void bookDebitCardToCustomer(int customerId, DebitCard debitCard) throws CustomerDebitCardApplicationException {
	// TODO Auto-generated method stub
	Customer customer=customerRepository.findAll().stream().filter(i->i.getCustomerId()==customerId).findAny().orElseThrow(()->new NoCustomerFoundException("No Customer Found"));
	customer.getDebitCards().add(debitCard);
	customer.setNumberOfCards(customer.getNumberOfCards()+1);
	customerRepository.saveAndFlush(customer);
}

}
