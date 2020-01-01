package com.mindtree.customerdebitcardregistrationapplication.service;

import com.mindtree.customerdebitcardregistrationapplication.entity.DebitCard;
import com.mindtree.customerdebitcardregistrationapplication.exception.CustomerDebitCardApplicationException;

public interface DebitCardService {

	void bookDebitCardToCustomer(int customerId, DebitCard debitCard) throws CustomerDebitCardApplicationException;

}
