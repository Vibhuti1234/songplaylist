package com.mindtree.insurancepolicy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.insurancepolicy.entiy.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
