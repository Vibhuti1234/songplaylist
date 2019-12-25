package com.mindtree.insurancepolicy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.insurancepolicy.entiy.Policy;
@Repository
public interface PolicyRepo extends JpaRepository<Policy, Integer> {

}
