package com.mindtree.customerdebitcardregistrationapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.customerdebitcardregistrationapplication.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
