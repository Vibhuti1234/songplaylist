package com.mindtree.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bankmanagementsystem.entity.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{
	

}
