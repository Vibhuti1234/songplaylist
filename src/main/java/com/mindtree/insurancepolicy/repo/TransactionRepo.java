package com.mindtree.insurancepolicy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.insurancepolicy.entiy.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
