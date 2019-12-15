package com.mindtree.jpacafechainmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.jpacafechainmanagement.entity.Cafe;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Integer> {

}
