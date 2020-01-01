package com.mindtree.customerdebitcardregistrationapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.customerdebitcardregistrationapplication.entity.DebitCard;
@Repository
public interface DebitCardRepository extends JpaRepository<DebitCard, Long>{

}
